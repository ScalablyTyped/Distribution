package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DeferredKeySelectionNs {
  type AddAliases[TSelection, T] = knexLib.knexMod.DeferredKeySelection[
    js.Any, 
    js.Any | scala.Nothing, 
    knexLib.knexLibNumbers.`false` | js.Any, 
    (js.Any with T) | T, 
    knexLib.knexLibNumbers.`false` | js.Any, 
    js.Any | js.Object, 
    js.Any | scala.Nothing
  ]
  type AddKey[TSelection, TKey /* <: java.lang.String */] = knexLib.knexMod.DeferredKeySelection[
    js.Any, 
    js.Any | TKey, 
    knexLib.knexLibNumbers.`true`, 
    js.Any | js.Object, 
    knexLib.knexLibNumbers.`false` | js.Any, 
    js.Any | js.Object, 
    js.Any | scala.Nothing
  ]
  type AddUnionMember[TSelection, T] = knexLib.knexMod.DeferredKeySelection[
    js.Any | TSelection, 
    js.Any | scala.Nothing, 
    knexLib.knexLibNumbers.`false` | js.Any, 
    js.Any | js.Object, 
    knexLib.knexLibNumbers.`false` | js.Any, 
    js.Any | js.Object, 
    js.Any | T
  ]
  type Any = knexLib.knexMod.DeferredKeySelection[js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any]
  // Convenience utility to set base, keys and aliases in a single type
  // application
  type Augment[T, TBase, TKey /* <: java.lang.String */, TAliasMapping] = AddAliases[AddKey[SetBase[T, TBase], TKey], TAliasMapping]
  // If TSelection is already a deferred selection, then replace the base with TBase
  // If unknown, create a new deferred selection with TBase as the base
  // Else, retain original
  //
  // For practical reasons applicable to current context, we always return arrays of
  // deferred selections. So, this particular operator may not be useful in generic contexts.
  type ReplaceBase[TSelection, TBase] = TSelection | (knexLib.knexMod.ArrayIfAlready[TSelection, SetBase[js.Any | knexLib.knexMod.UnwrapArrayMember[TSelection], TBase]])
  type Resolve[TSelection] = TSelection | (js.Array[
    ResolveOne[
      /* import warning: ImportType.apply Failed type conversion: TSelection[0] */ js.Any
    ]
  ]) | ResolveOne[TSelection]
  // Core resolution logic -- Refer to docs for DeferredKeySelection for specifics
  type ResolveOne[TSelection] = TSelection | (knexLib.knexMod.UnknownToAny[
    (// ^ We convert final result to any if it is unknown for backward compatibility.
  //   Historically knex typings have been liberal with returning any and changing
  //   default return type to unknown would be a major breaking change for users.
  //
  //   So we compromise on type safety here and return any.
  knexLib.knexMod.AugmentParams[
      js.Any | (knexLib.knexMod.AugmentParams[
        knexLib.knexMod.PartialOrAny[js.Any, js.Any], 
        knexLib.knexMod.MappedAliasType[js.Any, js.Any]
      ]), 
      js.Any
    ]) | js.Any
  ])
  // Replace the Base if already a deferred selection.
  // If not, create a new deferred selection with specified base.
  type SetBase[TSelection, TBase] = knexLib.knexMod.DeferredKeySelection[
    TBase, 
    js.Any | scala.Nothing, 
    knexLib.knexLibNumbers.`false` | js.Any, 
    js.Any | js.Object, 
    knexLib.knexLibNumbers.`false` | js.Any, 
    js.Any | js.Object, 
    js.Any | scala.Nothing
  ]
  // Type operators to substitute individual type parameters:
  type SetSingle[TSelection, TSingle /* <: scala.Boolean */] = knexLib.knexMod.DeferredKeySelection[js.Any, js.Any, js.Any, js.Any, TSingle, js.Any, js.Any]
}
