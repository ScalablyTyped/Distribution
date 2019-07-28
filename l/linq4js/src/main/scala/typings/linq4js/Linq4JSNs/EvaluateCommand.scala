package typings.linq4js.Linq4JSNs

import typings.linq4js.Array
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Linq4JS.EvaluateCommand")
@js.native
class EvaluateCommand protected () extends js.Object {
  def this(command: String, identifier: String*) = this()
  var Command: String = js.native
  var Finder: Array[RegExp] = js.native
  var SplitRegex: Array[RegExp] = js.native
}

