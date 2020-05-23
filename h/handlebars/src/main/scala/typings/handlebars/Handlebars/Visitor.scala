package typings.handlebars.Handlebars

import typings.handlebars.hbs.AST.Expression
import typings.handlebars.hbs.AST.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Visitor extends ICompiler {
  def acceptArray(arr: js.Array[Expression]): Unit = js.native
  def acceptKey(node: Node, name: String): Unit = js.native
}

