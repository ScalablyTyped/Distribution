package typings
package jqueryDotFileuploadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def fileupload(action: java.lang.String, message: java.lang.String, settings: java.lang.String): JQueryFileUpload = js.native
  def fileupload(action: java.lang.String, message: java.lang.String, settings: JQueryFileInputOptions): JQueryFileUpload = js.native
  def fileupload(action: java.lang.String, settings: java.lang.String): JQueryFileUpload = js.native
  def fileupload(action: java.lang.String, settings: JQueryFileInputOptions): JQueryFileUpload = js.native
  def fileupload(settings: java.lang.String): JQueryFileUpload = js.native
  // Interface to the main method of jQuery File Upload
  def fileupload(settings: JQueryFileInputOptions): JQueryFileUpload = js.native
}

