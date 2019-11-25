package typings.knex.knexMod

import typings.knex.knexMod.DeferredKeySelection.AddAliases
import typings.knex.knexMod.DeferredKeySelection.AddKey
import typings.knex.knexMod.DeferredKeySelection.ResolveOne
import typings.knex.knexMod.DeferredKeySelection.SetBase
import typings.knex.knexNumbers.`false`
import typings.knex.knexNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Container type for situations when we want a partial/intersection eventually
// but the keys being selected or additional properties being augmented are not
// all known at once and we would want to effectively build up a partial/intersection
// over multiple steps.
trait DeferredKeySelection[// The base of selection. In intermediate stages this may be unknown.
// If it remains unknown at the point of resolution, the selection will fall back to any
TBase, // Union of keys to be selected
// In intermediate stages this may be never.
TKeys /* <: String */, // Changes how the resolution should behave if TKeys is never.
// If true, then we assume that some keys were selected, and if TKeys is never, we will fall back to any.
// If false, and TKeys is never, then we select TBase in its entirity
THasSelect /* <: `true` | `false` */, // Mapping of aliases <key in result> -> <key in TBase>
TAliasMapping /* <: js.Object */, // If enabled, then instead of extracting a partial, during resolution
// we will pick just a single property.
TSingle /* <: Boolean */, // Extra props which will be intersected with the result
TIntersectProps /* <: js.Object */, // Extra props which will be unioned with the result
TUnionProps] extends js.Object {
  var _aliases: TAliasMapping
  // These properties are not actually used, but exist simply because
  // typescript doesn't end up happy when type parameters are unused
  var _base: TBase
  var _hasSelection: THasSelect
  var _intersectProps: TIntersectProps
  var _keys: TKeys
  var _single: TSingle
  var _unionProps: TUnionProps
}

// An companion namespace for DeferredKeySelection which provides type operators
// to build up participants of intersection/partial over multiple invocations
// and for final resolution.
//
// While the comments use wordings such as replacement and addition, it is important
// to keep in mind that types are always immutable and all type operators return new altered types.
@JSImport("knex", "DeferredKeySelection")
@js.native
object DeferredKeySelection extends js.Object {
  type AddAliases[TSelection, T] = DeferredKeySelection[
    js.Any, 
    js.Any | scala.Nothing, 
    `false` | js.Any, 
    (js.Any with T) | T, 
    `false` | js.Any, 
    js.Any | js.Object, 
    js.Any | scala.Nothing
  ]
  type AddKey[TSelection, TKey /* <: String */] = DeferredKeySelection[
    js.Any, 
    js.Any | TKey, 
    `true`, 
    js.Any | js.Object, 
    `false` | js.Any, 
    js.Any | js.Object, 
    js.Any | scala.Nothing
  ]
  type AddUnionMember[TSelection, T] = DeferredKeySelection[
    js.Any | TSelection, 
    js.Any | scala.Nothing, 
    `false` | js.Any, 
    js.Any | js.Object, 
    `false` | js.Any, 
    js.Any | js.Object, 
    js.Any | T
  ]
  type Any = DeferredKeySelection[js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any]
  // Convenience utility to set base, keys and aliases in a single type
  // application
  type Augment[T, TBase, TKey /* <: String */, TAliasMapping] = AddAliases[AddKey[SetBase[T, TBase], TKey], TAliasMapping]
  // If TSelection is already a deferred selection, then replace the base with TBase
  // If unknown, create a new deferred selection with TBase as the base
  // Else, retain original
  //
  // For practical reasons applicable to current context, we always return arrays of
  // deferred selections. So, this particular operator may not be useful in generic contexts.
  type ReplaceBase[TSelection, TBase] = TSelection | (ArrayIfAlready[TSelection, SetBase[js.Any | UnwrapArrayMember[TSelection], TBase]])
  type Resolve[TSelection] = UnknownToAny[TSelection] | (js.Array[
    (ResolveOne[
      /* import warning: importer.ImportType#apply Failed type conversion: TSelection[0] */ js.Any
    ]) | UnknownToAny[js.Any]
  ]) | ResolveOne[TSelection]
  // Core resolution logic -- Refer to docs for DeferredKeySelection for specifics
  type ResolveOne[TSelection] = TSelection | (UnknownToAny[
    (// ^ We convert final result to any if it is unknown for backward compatibility.
  //   Historically knex typings have been liberal with returning any and changing
  //   default return type to unknown would be a major breaking change for users.
  //
  //   So we compromise on type safety here and return any.
  AugmentParams[
      js.Any | (AugmentParams[PartialOrAny[js.Any, js.Any], MappedAliasType[js.Any, js.Any]]), 
      js.Any
    ]) | js.Any
  ])
  // Replace the Base if already a deferred selection.
  // If not, create a new deferred selection with specified base.
  type SetBase[TSelection, TBase] = DeferredKeySelection[
    TBase, 
    js.Any | scala.Nothing, 
    `false` | js.Any, 
    js.Any | js.Object, 
    `false` | js.Any, 
    js.Any | js.Object, 
    js.Any | scala.Nothing
  ]
  // Type operators to substitute individual type parameters:
  type SetSingle[TSelection, TSingle /* <: Boolean */] = DeferredKeySelection[js.Any, js.Any, js.Any, js.Any, TSingle, js.Any, js.Any]
}

