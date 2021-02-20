package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Upload extends Widget {
  
  def clearAllFiles(): Unit = js.native
  
  def clearFile(callback: js.Function): Unit = js.native
  
  def clearFileByUid(uid: String): Unit = js.native
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  def enable(enable: Boolean): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getFiles(): js.Any = js.native
  
  @JSName("options")
  var options_Upload: UploadOptions = js.native
  
  def pause(li: JQuery): Unit = js.native
  
  def removeAllFiles(): Unit = js.native
  
  def removeFile(callback: js.Function): Unit = js.native
  
  def removeFileByUid(uid: String): Unit = js.native
  
  def resume(li: JQuery): Unit = js.native
  
  def toggle(enable: Boolean): Unit = js.native
  
  def upload(): Unit = js.native
  
  var wrapper: JQuery = js.native
}
