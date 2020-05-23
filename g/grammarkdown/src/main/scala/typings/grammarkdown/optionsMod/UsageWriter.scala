package typings.grammarkdown.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/options", "UsageWriter")
@js.native
class UsageWriter protected () extends js.Object {
  def this(margin: Double, padding: Double) = this()
  var fit: js.Any = js.native
  var margin: js.Any = js.native
  var padding: js.Any = js.native
  var remainder: js.Any = js.native
  def writeOption(): Unit = js.native
  def writeOption(left: String): Unit = js.native
  def writeOption(left: String, right: String): Unit = js.native
  def writeln(): Unit = js.native
  def writeln(text: String): Unit = js.native
}

