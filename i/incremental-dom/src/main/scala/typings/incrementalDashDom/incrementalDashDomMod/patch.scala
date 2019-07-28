package typings.incrementalDashDom.incrementalDashDomMod

import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("incremental-dom", "patch")
@js.native
object patch extends js.Object {
  def apply[T](node: DocumentFragment, fn: js.Function1[/* data */ T, Unit]): Node = js.native
  def apply[T](node: DocumentFragment, fn: js.Function1[/* data */ T, Unit], data: T): Node = js.native
  def apply[T](node: Element, fn: js.Function1[/* data */ T, Unit]): Node = js.native
  def apply[T](node: Element, fn: js.Function1[/* data */ T, Unit], data: T): Node = js.native
}

