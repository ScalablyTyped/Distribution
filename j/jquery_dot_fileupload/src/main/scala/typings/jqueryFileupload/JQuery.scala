package typings.jqueryFileupload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def fileupload(action: String, message: String, settings: String): JQueryFileUpload = js.native
  def fileupload(action: String, message: String, settings: JQueryFileInputOptions): JQueryFileUpload = js.native
  def fileupload(action: String, settings: String): JQueryFileUpload = js.native
  def fileupload(action: String, settings: JQueryFileInputOptions): JQueryFileUpload = js.native
  def fileupload(settings: String): JQueryFileUpload = js.native
  // Interface to the main method of jQuery File Upload
  def fileupload(settings: JQueryFileInputOptions): JQueryFileUpload = js.native
}
