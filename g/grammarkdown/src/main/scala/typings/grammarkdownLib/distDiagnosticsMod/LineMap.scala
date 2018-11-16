package typings
package grammarkdownLib.distDiagnosticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/diagnostics", "LineMap")
@js.native
class LineMap protected () extends js.Object {
  def this(text: java.lang.String) = this()
  var computeLineStarts: js.Any = js.native
  var isLineBreak: js.Any = js.native
  val lineCount: scala.Double = js.native
  var lineStarts: js.Any = js.native
  var text: js.Any = js.native
  def formatOffset(pos: scala.Double): java.lang.String = js.native
  def offsetAt(position: grammarkdownLib.distCoreMod.Position): scala.Double = js.native
  def positionAt(offset: scala.Double): grammarkdownLib.distCoreMod.Position = js.native
}

