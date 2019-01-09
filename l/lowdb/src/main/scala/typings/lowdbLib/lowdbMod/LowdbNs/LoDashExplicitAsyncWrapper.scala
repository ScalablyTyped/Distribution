package typings
package lowdbLib.lowdbMod.LowdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Note: this interface is augmented in _lodash.d.ts
@js.native
trait LoDashExplicitAsyncWrapper[TValue]
  extends lodashLib.lodashMod.underscoreNs.LoDashWrapper[TValue] {
  def write(): js.Promise[TValue] = js.native
}

