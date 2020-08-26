package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgUploadMethods extends js.Object {
  /**
    * Append additional data field to formData(before submitting it to the server). Usually this function is used in the handler of the event onFormDataSubmit. If the browser supports HTML5 file API formData is instance of FormData, otherwise(like IE10 and older) formData is jQuery representation of the <form> that should be submitted to the server
    *
    * @param formData If the browser supports HTML5 file API formData is instance of FormData, otherwise(like IE10 and older) formData is jQuery representation of the <form> that should be submitted to the server
    * @param field Data field that should be appended to the formData. The object has 2 properties - value and name. If the browser supports HTML5 the data field is appended to the formData object. Otherwise it is appended as input hidden field to the <form>
    */
  def addDataField(formData: js.Object, field: js.Object): Unit = js.native
  /**
    * Append additional data fields to formData(before submitting it to the server). Usually this function is used in the handler of the event onFormDataSubmit. If the browser supports HTML5 file API formData is instance of FormData, otherwise(like IE10 and older) formData is jQuery representation of the <form> that should be submitted to the server
    *
    * @param formData If the browser supports HTML5 file API formData is instance of FormData, otherwise(like IE10 and older) formData is jQuery representation of the <form> that should be submitted to the server
    * @param fields Array of data fields that should be appended to the formData. Each data field is object with 2 properties - value and name. If the browser supports HTML5 these data fields are added to the formData. Otherwise each of these data field is appended as input hidden field to the <form>
    */
  def addDataFields(formData: js.Object, fields: js.Array[_]): Unit = js.native
  /**
    * Cancel all uploading and pending files
    */
  def cancelAll(): Unit = js.native
  /**
    * Cancel upload for the specified file id
    *  formNumber - id of the file to be canceled
    *
    * @param formNumber id of the form which should be cancelled
    */
  def cancelUpload(formNumber: Double): Unit = js.native
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit = js.native
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit = js.native
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.igupload#options:language)
    * Note that this method is for rare scenarios, use [language](ui.igupload#options:language) or [locale](ui.igupload#options:locale) option setter
    */
  def changeLocale(): Unit = js.native
  /**
    * Hide finished files
    */
  def clearAll(): Unit = js.native
  /**
    * Return jquery object of fileupload container - html DOM element
    */
  def container(): Unit = js.native
  /**
    * Destroy the widget
    */
  def destroy(): Unit = js.native
  /**
    * Returns the information about the file by specified file identifier. It could be file which is uploading/uploaded or uploading is not started. If there isn"t file with the specified file id returns null
    *
    * @param fileIndex unique identifier of the file
    */
  def getFileInfo(fileIndex: Double): js.Object = js.native
  /**
    * Returns the information about uploading files - all files uploaded/uploading/pending
    */
  def getFileInfoData(): js.Object = js.native
  /**
    * Start uploading file as submitting form with the specified formNumber.
    *
    * @param formNumber id of the upload form. If left undefined and useSingleRequest is true all pending files will be uploaded.
    */
  def startUpload(formNumber: Double): Unit = js.native
  /**
    * Returns the current widget element
    */
  def widget(): Unit = js.native
}

object IgUploadMethods {
  @scala.inline
  def apply(
    addDataField: (js.Object, js.Object) => Unit,
    addDataFields: (js.Object, js.Array[_]) => Unit,
    cancelAll: () => Unit,
    cancelUpload: Double => Unit,
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: () => Unit,
    clearAll: () => Unit,
    container: () => Unit,
    destroy: () => Unit,
    getFileInfo: Double => js.Object,
    getFileInfoData: () => js.Object,
    startUpload: Double => Unit,
    widget: () => Unit
  ): IgUploadMethods = {
    val __obj = js.Dynamic.literal(addDataField = js.Any.fromFunction2(addDataField), addDataFields = js.Any.fromFunction2(addDataFields), cancelAll = js.Any.fromFunction0(cancelAll), cancelUpload = js.Any.fromFunction1(cancelUpload), changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction0(changeLocale), clearAll = js.Any.fromFunction0(clearAll), container = js.Any.fromFunction0(container), destroy = js.Any.fromFunction0(destroy), getFileInfo = js.Any.fromFunction1(getFileInfo), getFileInfoData = js.Any.fromFunction0(getFileInfoData), startUpload = js.Any.fromFunction1(startUpload), widget = js.Any.fromFunction0(widget))
    __obj.asInstanceOf[IgUploadMethods]
  }
  @scala.inline
  implicit class IgUploadMethodsOps[Self <: IgUploadMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddDataField(value: (js.Object, js.Object) => Unit): Self = this.set("addDataField", js.Any.fromFunction2(value))
    @scala.inline
    def setAddDataFields(value: (js.Object, js.Array[_]) => Unit): Self = this.set("addDataFields", js.Any.fromFunction2(value))
    @scala.inline
    def setCancelAll(value: () => Unit): Self = this.set("cancelAll", js.Any.fromFunction0(value))
    @scala.inline
    def setCancelUpload(value: Double => Unit): Self = this.set("cancelUpload", js.Any.fromFunction1(value))
    @scala.inline
    def setChangeGlobalLanguage(value: () => Unit): Self = this.set("changeGlobalLanguage", js.Any.fromFunction0(value))
    @scala.inline
    def setChangeGlobalRegional(value: () => Unit): Self = this.set("changeGlobalRegional", js.Any.fromFunction0(value))
    @scala.inline
    def setChangeLocale(value: () => Unit): Self = this.set("changeLocale", js.Any.fromFunction0(value))
    @scala.inline
    def setClearAll(value: () => Unit): Self = this.set("clearAll", js.Any.fromFunction0(value))
    @scala.inline
    def setContainer(value: () => Unit): Self = this.set("container", js.Any.fromFunction0(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFileInfo(value: Double => js.Object): Self = this.set("getFileInfo", js.Any.fromFunction1(value))
    @scala.inline
    def setGetFileInfoData(value: () => js.Object): Self = this.set("getFileInfoData", js.Any.fromFunction0(value))
    @scala.inline
    def setStartUpload(value: Double => Unit): Self = this.set("startUpload", js.Any.fromFunction1(value))
    @scala.inline
    def setWidget(value: () => Unit): Self = this.set("widget", js.Any.fromFunction0(value))
  }
  
}

