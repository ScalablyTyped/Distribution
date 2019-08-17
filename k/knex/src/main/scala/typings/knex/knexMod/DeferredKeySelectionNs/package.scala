package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DeferredKeySelectionNs {
  import typings.knex.knexMod.ArrayIfAlready
  import typings.knex.knexMod.AugmentParams
  import typings.knex.knexMod.DeferredKeySelection
  import typings.knex.knexMod.MappedAliasType
  import typings.knex.knexMod.PartialOrAny
  import typings.knex.knexMod.UnknownToAny
  import typings.knex.knexMod.UnwrapArrayMember
  import typings.knex.knexNumbers.`false`
  import typings.knex.knexNumbers.`true`

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
      /* import warning: ImportType.apply Failed type conversion: TSelection[0] */ js.Any
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
