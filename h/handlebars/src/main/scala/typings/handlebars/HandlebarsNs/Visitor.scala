package typings.handlebars.HandlebarsNs

import typings.handlebars.hbsNs.ASTNs.Expression
import typings.handlebars.hbsNs.ASTNs.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Handlebars.Visitor")
@js.native
class Visitor () extends ICompiler {
  def acceptArray(arr: js.Array[Expression]): Unit = js.native
  def acceptKey(node: Node, name: String): Unit = js.native
}

