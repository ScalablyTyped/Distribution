package typings
package incrementalDashDomLib.incrementalDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("incremental-dom", "patch")
@js.native
object patch extends js.Object {
  def apply[T](node: stdLib.DocumentFragment, fn: js.Function1[/* data */ T, scala.Unit]): stdLib.Node = js.native
  def apply[T](node: stdLib.DocumentFragment, fn: js.Function1[/* data */ T, scala.Unit], data: T): stdLib.Node = js.native
  def apply[T](node: stdLib.Element, fn: js.Function1[/* data */ T, scala.Unit]): stdLib.Node = js.native
  def apply[T](node: stdLib.Element, fn: js.Function1[/* data */ T, scala.Unit], data: T): stdLib.Node = js.native
}

