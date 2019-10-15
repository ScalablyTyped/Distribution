package typings.handsontable.handsontableMod.Handsontable.plugins

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportFile extends BasePlugin {
  def downloadFile(format: String, options: js.Object): Unit = js.native
  def exportAsBlob(format: String): Blob = js.native
  def exportAsBlob(format: String, options: js.Object): Blob = js.native
  def exportAsString(format: String): String = js.native
  def exportAsString(format: String, options: js.Object): String = js.native
}

