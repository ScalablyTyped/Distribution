package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DeferredKeySelectionNs {
  type AddKey[TSelection, TKey /* <: java.lang.String */] = knexLib.knexMod.DeferredKeySelection[js.Any, js.Any | TKey]
  type Augment[T, TBase, TKey /* <: java.lang.String */] = AddKey[SetBase[T, TBase], TKey]
  type Resolve[TSelection] = TSelection | (js.Array[
    ResolveSingle[
      /* import warning: ImportType.apply Failed type conversion: TSelection[0] */ js.Any
    ]
  ]) | ResolveSingle[TSelection]
  type ResolveSingle[TSelection] = TSelection | (stdLib.Pick[js.Any, js.Any with java.lang.String])
  type SetBase[TSelection, TBase] = (knexLib.knexMod.DeferredKeySelection[TBase, scala.Nothing]) | (knexLib.knexMod.DeferredKeySelection[TBase, js.Any])
}
