package typings
package lowdbLib.lowdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Note: this interface is augmented in _lodash.d.ts
@js.native
trait LoDashExplicitAsyncWrapper[TValue]
  extends lodashLib.lodashMod.LoDashWrapper[TValue] {
  def write(): js.Promise[TValue] = js.native
}

