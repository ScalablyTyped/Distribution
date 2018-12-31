package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgUploadMethods extends js.Object {
  /**
  	 * Append additional data field to formData(before submitting it to the server). Usually this function is used in the handler of the event onFormDataSubmit. If the browser supports HTML5 file API formData is instance of FormData, otherwise(like IE10 and older) formData is jQuery representation of the <form> that should be submitted to the server
  	 *
  	 * @param formData If the browser supports HTML5 file API formData is instance of FormData, otherwise(like IE10 and older) formData is jQuery representation of the <form> that should be submitted to the server
  	 * @param field Data field that should be appended to the formData. The object has 2 properties - value and name. If the browser supports HTML5 the data field is appended to the formData object. Otherwise it is appended as input hidden field to the <form>
  	 */
  def addDataField(formData: js.Object, field: js.Object): scala.Unit
  /**
  	 * Append additional data fields to formData(before submitting it to the server). Usually this function is used in the handler of the event onFormDataSubmit. If the browser supports HTML5 file API formData is instance of FormData, otherwise(like IE10 and older) formData is jQuery representation of the <form> that should be submitted to the server
  	 *
  	 * @param formData If the browser supports HTML5 file API formData is instance of FormData, otherwise(like IE10 and older) formData is jQuery representation of the <form> that should be submitted to the server
  	 * @param fields Array of data fields that should be appended to the formData. Each data field is object with 2 properties - value and name. If the browser supports HTML5 these data fields are added to the formData. Otherwise each of these data field is appended as input hidden field to the <form>
  	 */
  def addDataFields(formData: js.Object, fields: js.Array[_]): scala.Unit
  /**
  	 * Cancel all uploading and pending files
  	 */
  def cancelAll(): scala.Unit
  /**
  	 * Cancel upload for the specified file id
  	 *  formNumber - id of the file to be canceled
  	 *
  	 * @param formNumber id of the form which should be cancelled
  	 */
  def cancelUpload(formNumber: scala.Double): scala.Unit
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): scala.Unit
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): scala.Unit
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.igupload#options:language)
  	 * Note that this method is for rare scenarios, use [language](ui.igupload#options:language) or [locale](ui.igupload#options:locale) option setter
  	 */
  def changeLocale(): scala.Unit
  /**
  	 * Hide finished files
  	 */
  def clearAll(): scala.Unit
  /**
  	 * Return jquery object of fileupload container - html DOM element
  	 */
  def container(): scala.Unit
  /**
  	 * Destroy the widget
  	 */
  def destroy(): scala.Unit
  /**
  	 * Returns the information about the file by specified file identifier. It could be file which is uploading/uploaded or uploading is not started. If there isn"t file with the specified file id returns null
  	 *
  	 * @param fileIndex unique identifier of the file
  	 */
  def getFileInfo(fileIndex: scala.Double): js.Object
  /**
  	 * Returns the information about uploading files - all files uploaded/uploading/pending
  	 */
  def getFileInfoData(): js.Object
  /**
  	 * Start uploading file as submitting form with the specified formNumber.
  	 *
  	 * @param formNumber id of the upload form. If left undefined and useSingleRequest is true all pending files will be uploaded.
  	 */
  def startUpload(formNumber: scala.Double): scala.Unit
  /**
  	 * Returns the current widget element
  	 */
  def widget(): scala.Unit
}

