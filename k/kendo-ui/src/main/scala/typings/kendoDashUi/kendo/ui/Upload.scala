package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Upload")
@js.native
class Upload protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: UploadOptions) = this()
  @JSName("options")
  var options_Upload: UploadOptions = js.native
  var wrapper: JQuery = js.native
  def clearAllFiles(): Unit = js.native
  def clearFile(callback: js.Function): Unit = js.native
  def clearFileByUid(uid: String): Unit = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def enable(enable: Boolean): Unit = js.native
  def focus(): Unit = js.native
  def getFiles(): js.Any = js.native
  def pause(li: JQuery): Unit = js.native
  def removeAllFiles(): Unit = js.native
  def removeFile(callback: js.Function): Unit = js.native
  def removeFileByUid(uid: String): Unit = js.native
  def resume(li: JQuery): Unit = js.native
  def toggle(enable: Boolean): Unit = js.native
  def upload(): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.Upload")
@js.native
object Upload extends js.Object {
  var fn: Upload = js.native
  def extend(proto: js.Object): Upload = js.native
}

