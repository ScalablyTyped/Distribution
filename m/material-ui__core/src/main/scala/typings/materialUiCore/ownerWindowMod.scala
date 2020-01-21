package typings.materialUiCore

import typings.std.Node
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/utils/ownerWindow", JSImport.Namespace)
@js.native
object ownerWindowMod extends js.Object {
  def default(node: Node): Window_ = js.native
  def default(node: Node, fallback: Window_): Window_ = js.native
}

