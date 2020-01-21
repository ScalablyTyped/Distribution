package typings.jqueryFileupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def fileupload(action: String, message: String, settings: String): JQueryFileUpload = js.native
  def fileupload(action: String, message: String, settings: JQueryFileInputOptions): JQueryFileUpload = js.native
  def fileupload(action: String, settings: String): JQueryFileUpload = js.native
  def fileupload(action: String, settings: JQueryFileInputOptions): JQueryFileUpload = js.native
  def fileupload(settings: String): JQueryFileUpload = js.native
  // Interface to the main method of jQuery File Upload
  def fileupload(settings: JQueryFileInputOptions): JQueryFileUpload = js.native
}

