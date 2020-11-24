package typings.knockout.mod.utils

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("knockout", "utils.domData")
@js.native
object domData extends js.Object {
  
  def clear(node: Node): Boolean = js.native
  
  def get[T](node: Node, key: String): T = js.native
  
  def set[T](node: Node, key: String, value: T): Unit = js.native
}
