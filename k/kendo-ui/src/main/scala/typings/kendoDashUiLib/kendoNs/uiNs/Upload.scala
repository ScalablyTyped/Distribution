package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Upload")
@js.native
class Upload protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: UploadOptions) = this()
  @JSName("options")
  var options_Upload: UploadOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def clearAllFiles(): scala.Unit = js.native
  def clearFile(callback: js.Function): scala.Unit = js.native
  def clearFileByUid(uid: java.lang.String): scala.Unit = js.native
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def enable(enable: scala.Boolean): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getFiles(): js.Any = js.native
  def pause(li: kendoDashUiLib.JQuery): scala.Unit = js.native
  def removeAllFiles(): scala.Unit = js.native
  def removeFile(callback: js.Function): scala.Unit = js.native
  def removeFileByUid(uid: java.lang.String): scala.Unit = js.native
  def resume(li: kendoDashUiLib.JQuery): scala.Unit = js.native
  def toggle(enable: scala.Boolean): scala.Unit = js.native
  def upload(): scala.Unit = js.native
}

@JSGlobal("kendo.ui.Upload")
@js.native
object Upload extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Upload = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Upload = js.native
}

