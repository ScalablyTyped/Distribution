package typings
package grammarkdownLib.distOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/options", "UsageWriter")
@js.native
class UsageWriter protected () extends js.Object {
  def this(margin: scala.Double, padding: scala.Double) = this()
  var fit: js.Any = js.native
  var margin: js.Any = js.native
  var marginText: js.Any = js.native
  var padding: js.Any = js.native
  var paddingText: js.Any = js.native
  var remainder: js.Any = js.native
  def writeOption(): scala.Unit = js.native
  def writeOption(left: js.UndefOr[scala.Nothing], right: java.lang.String): scala.Unit = js.native
  def writeOption(left: java.lang.String): scala.Unit = js.native
  def writeOption(left: java.lang.String, right: java.lang.String): scala.Unit = js.native
  def writeln(): scala.Unit = js.native
  def writeln(text: java.lang.String): scala.Unit = js.native
}

