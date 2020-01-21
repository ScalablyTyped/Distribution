package typings.grammarkdown.diagnosticsMod

import typings.grammarkdown.coreMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/diagnostics", "LineMap")
@js.native
class LineMap protected () extends js.Object {
  def this(text: String) = this()
  var computeLineStarts: js.Any = js.native
  var isLineBreak: js.Any = js.native
  val lineCount: Double = js.native
  var lineStarts: js.Any = js.native
  var text: js.Any = js.native
  def formatOffset(pos: Double): String = js.native
  def offsetAt(position: Position): Double = js.native
  def positionAt(offset: Double): Position = js.native
}

