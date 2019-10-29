package typings.handlebars.Handlebars

import typings.handlebars.hbs.AST.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Handlebars.Exception")
@js.native
class Exception protected () extends js.Object {
  def this(message: String) = this()
  def this(message: String, node: Node) = this()
  var column: js.UndefOr[js.Any] = js.native
  var description: String = js.native
  var endColumn: js.UndefOr[js.Any] = js.native
  var endLineNumber: js.UndefOr[js.Any] = js.native
  var fileName: String = js.native
  var lineNumber: js.UndefOr[js.Any] = js.native
  var message: String = js.native
  var name: String = js.native
  var number: Double = js.native
  var stack: js.UndefOr[String] = js.native
}

