package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DeferredIndexNs {
  type Augment[T, TBase, TKey /* <: java.lang.String */, TAliasMapping] = knexLib.knexMod.DeferredKeySelectionNs.SetSingle[
    knexLib.knexMod.DeferredKeySelectionNs.AddKey[knexLib.knexMod.DeferredKeySelectionNs.SetBase[T, TBase], TKey], 
    knexLib.knexLibNumbers.`true`
  ]
}
