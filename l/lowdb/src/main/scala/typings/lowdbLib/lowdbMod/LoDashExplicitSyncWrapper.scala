package typings
package lowdbLib.lowdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Note: this interface is augmented in _lodash.d.ts
@js.native
trait LoDashExplicitSyncWrapper[TValue]
  extends lodashLib.lodashMod.LoDashWrapper[TValue] {
  def write(): TValue = js.native
}

