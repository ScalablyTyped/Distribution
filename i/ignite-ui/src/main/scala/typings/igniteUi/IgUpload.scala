package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgUpload
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Get or set file allowed file extensions. When this array is empty - it is not made such validation. Example ["gif", "jpg", "bmp"].
    *
    */
  var allowedExtensions: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Get or set whether the file start upload automatically when it is selected. Default is false.
    *
    */
  var autostartupload: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines the name of the cancel all button event click. Fired when cancel all button in summary is clicked. Fired only in multiple upload mode.
    */
  var cancelAllClicked: js.UndefOr[CancelAllClickedEvent] = js.native
  
  /**
    * UniqueId of the control - should not be changed by developer. Set from server-side wrapper.
    *
    */
  var controlId: js.UndefOr[String] = js.native
  
  /**
    * Get or set control specific CSS options. For example you can override specific control classes with custom ones.
    *
    */
  var css: js.UndefOr[js.Any] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set error message when AJAX Request to get file size throws error.
    * Use option [locale.errorMessageAJAXRequestFileSize](ui.igupload#options:locale.errorMessageAJAXRequestFileSize).
    */
  var errorMessageAJAXRequestFileSize: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set error message when ajax call to send cancel upload command.
    * Use option [locale.errorMessageCancelUpload](ui.igupload#options:locale.errorMessageCancelUpload).
    */
  var errorMessageCancelUpload: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set error message when trying to drop more than 1 file and mode is single.
    * Use option [locale.errorMessageDropMultipleFilesWhenSingleModel](ui.igupload#options:locale.errorMessageDropMultipleFilesWhenSingleModel).
    */
  var errorMessageDropMultipleFilesWhenSingleModel: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set error message when ajax call to get file status throws error.
    * Use option [locale.errorMessageGetFileStatus](ui.igupload#options:locale.errorMessageGetFileStatus).
    */
  var errorMessageGetFileStatus: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set message shown when max file size of the uploaded file exceeds the limit.
    * Use option [locale.errorMessageMaxFileSizeExceeded](ui.igupload#options:locale.errorMessageMaxFileSizeExceeded).
    */
  var errorMessageMaxFileSizeExceeded: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set error message when maximum simultaneous files is less or equal to 0.
    * Use option [locale.errorMessageMaxSimultaneousFiles](ui.igupload#options:locale.errorMessageMaxSimultaneousFiles).
    */
  var errorMessageMaxSimultaneousFiles: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set error message when maximum allowed files exceeded.
    * Use option [locale.errorMessageMaxUploadedFiles](ui.igupload#options:locale.errorMessageMaxUploadedFiles).
    */
  var errorMessageMaxUploadedFiles: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set error message when file is not found.
    * Use option [locale.errorMessageNoSuchFile](ui.igupload#options:locale.errorMessageNoSuchFile).
    */
  var errorMessageNoSuchFile: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    *  Get or set error message different from the other messages.
    * Use option [locale.errorMessageOther](ui.igupload#options:locale.errorMessageOther).
    */
  var errorMessageOther: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set error message when trying to remove non existing file.
    * Use option [locale.errorMessageTryToRemoveNonExistingFile](ui.igupload#options:locale.errorMessageTryToRemoveNonExistingFile).
    */
  var errorMessageTryToRemoveNonExistingFile: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set error message when trying to start non existing file.
    * Use option [locale.errorMessageTryToStartNonExistingFile](ui.igupload#options:locale.errorMessageTryToStartNonExistingFile).
    */
  var errorMessageTryToStartNonExistingFile: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set error message when file extension validation failed.
    * Use option [locale.errorMessageValidatingFileExtension](ui.igupload#options:locale.errorMessageValidatingFileExtension).
    */
  var errorMessageValidatingFileExtension: js.UndefOr[String] = js.native
  
  /**
    * Set icon css classes for specified file extension
    *
    */
  var fileExtensionIcons: js.UndefOr[IgUploadFileExtensionIcons] = js.native
  
  /**
    * It is fired when validating file extensions
    */
  var fileExtensionsValidating: js.UndefOr[FileExtensionsValidatingEvent] = js.native
  
  /**
    * Defines the name of the file upload selected event. Fired when file is selected from browse dialog.
    * Return false in order to cancel uploading file.
    */
  var fileSelected: js.UndefOr[FileSelectedEvent] = js.native
  
  /**
    * Defines the name of the file upload selecting event. Fired when browse button is pressed.
    * Return false in order to cancel selecting file.
    */
  var fileSelecting: js.UndefOr[FileSelectingEvent] = js.native
  
  /**
    * The number of digits after the decimal point.
    *
    */
  var fileSizeDecimalDisplay: js.UndefOr[Double] = js.native
  
  /**
    * Get or set file size metrics how to be shown files size.
    *
    */
  var fileSizeMetric: js.UndefOr[js.Any] = js.native
  
  /**
    * Defines the name of the file upload cancel event. Fired when the server responses that the file is canceled.
    */
  var fileUploadAborted: js.UndefOr[FileUploadAbortedEvent] = js.native
  
  /**
    * Defines the name of the uploaded event. Fired when the file is uploaded
    */
  var fileUploaded: js.UndefOr[FileUploadedEvent] = js.native
  
  /**
    * Defines the name of the file uploading event. Fired every time when fileuploader get status for the upload.
    * Return false in order to cancel uploading file.
    */
  var fileUploading: js.UndefOr[FileUploadingEvent] = js.native
  
  /**
    * Get or set height of the main container of the file upload control. Main container contains all buttons, progressbar, etc.
    *
    */
  var height: js.UndefOr[Double | String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set label for browse button in main container.
    * Use option [locale.labelAddButton](ui.igupload#options:locale.labelAddButton).
    */
  var labelAddButton: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set label for summary Clear all button. It will be shown only in multiple upload mode.
    * Use option [locale.labelClearAllButton](ui.igupload#options:locale.labelClearAllButton).
    */
  var labelClearAllButton: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set label for show/hide details button when main container is shown.
    * Use option [locale.labelHideDetails](ui.igupload#options:locale.labelHideDetails).
    */
  var labelHideDetails: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set filename when it could not be shown the whole file name and should be shorten.
    * Use option [locale.labelProgressBarFileNameContinue](ui.igupload#options:locale.labelProgressBarFileNameContinue).
    */
  var labelProgressBarFileNameContinue: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set label for show/hide details button when main container is hidden.
    * Use option [locale.labelShowDetails](ui.igupload#options:locale.labelShowDetails).
    */
  var labelShowDetails: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set template for showing uploading information in summary progress bar. It will be shown only in multiple upload mode. {0} uploaded filesize. {1} - total file size.
    * Use option [locale.labelSummaryProgressBarTemplate](ui.igupload#options:locale.labelSummaryProgressBarTemplate).
    */
  var labelSummaryProgressBarTemplate: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set label for button cancelling all files. Shown only in multiple upload mode.
    * Use option [locale.labelSummaryProgressButtonCancel](ui.igupload#options:locale.labelSummaryProgressButtonCancel).
    */
  var labelSummaryProgressButtonCancel: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set label for start upload batch files. Shown only in multiple upload mode and autostartupload is false.
    * Use option [locale.labelSummaryProgressButtonContinue](ui.igupload#options:locale.labelSummaryProgressButtonContinue).
    */
  var labelSummaryProgressButtonContinue: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set label when upload is finished. Shown only in multiple upload mode.
    * Use option [locale.labelSummaryProgressButtonDone](ui.igupload#options:locale.labelSummaryProgressButtonDone).
    */
  var labelSummaryProgressButtonDone: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set template for showing summary template. {0} is count of uploaded files. {1} is total count of file to be uploaded.
    * Use option [locale.labelSummaryTemplate](ui.igupload#options:locale.labelSummaryTemplate).
    */
  var labelSummaryTemplate: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set label for the first shown browse button. When file is selected for the first time this button is hidden.
    * Use option [locale.labelUploadButton](ui.igupload#options:locale.labelUploadButton).
    */
  var labelUploadButton: js.UndefOr[String] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  var locale: js.UndefOr[IgUploadLocale] = js.native
  
  /**
    * Maximum size(in bytes) allowed for the file to be uploaded. If it is set to null or -1 there is no limitation otherwise if the size(of the selected file) exceeds this value it is not allowed to be uploaded. This option is used for validation only on client side and only if the browser supports HTML5 file API and share information about the file size
    */
  var maxFileSize: js.UndefOr[js.Any] = js.native
  
  /**
    * Get or set count of files that could be uploaded at the same time.
    *
    */
  var maxSimultaneousFilesUploads: js.UndefOr[Double] = js.native
  
  /**
    * Get or set the maximum number of allowed files to upload.
    *
    */
  var maxUploadedFiles: js.UndefOr[Double] = js.native
  
  /**
    * Get or set multiple or single file upload. In single upload it is possible to upload only one file at the same time.
    *
    */
  var mode: js.UndefOr[js.Any] = js.native
  
  /**
    * Get or set a bool setting that allows user to select(for upload) more than 1 file from the browse dialog at once. HTML 5+ - it is supported by Chrome, MOzilla FF, Safar, Opera latest versions and IE10+
    *
    */
  var multipleFiles: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines the name of the file upload error event. Fired when error is occurred.
    */
  var onError: js.UndefOr[OnErrorEvent] = js.native
  
  /**
    * It is fired before submitting to the server the uploading file(and its additional data if any). It could be used to append additional data fields to the FormData object(if the browser supports HTML5 file API - like newest Chrome, Firefox, IE11+). If the browser does not support HTML5 file API(IE10 and older) it could be added these data fields(as hidden input fields) to the form. Use the public API function addDataFields.
    */
  var onFormDataSubmit: js.UndefOr[OnFormDataSubmitEvent] = js.native
  
  /**
    * It is fired when event onload(of XmlHttpRequest) is fired. This event will be fired only if the browser supports HTML5 file API
    */
  var onXHRLoad: js.UndefOr[OnXHRLoadEvent] = js.native
  
  /**
    * Get or set URL of HTTPHandler to get information about file upload, current size and also to get commands
    *
    */
  var progressUrl: js.UndefOr[String] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    * Get or set whether to show File Extension icon
    *
    */
  var showFileExtensionIcon: js.UndefOr[Boolean] = js.native
  
  /**
    * Get or set URL for uploading.
    *
    */
  var uploadUrl: js.UndefOr[String] = js.native
  
  /**
    * Get or set whether to use only one request for sending data, when you are sending more than one file.
    *
    */
  var useSingleRequest: js.UndefOr[Boolean] = js.native
  
  /**
    * Get or set width of the main container of the file upload control. Main container contains all buttons, progressbar, etc.
    *
    */
  var width: js.UndefOr[Double | String] = js.native
}
object IgUpload {
  
  @scala.inline
  def apply(): IgUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgUpload]
  }
  
  @scala.inline
  implicit class IgUploadOps[Self <: IgUpload] (val x: Self) extends AnyVal {
    
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
    def setAllowedExtensionsVarargs(value: js.Any*): Self = this.set("allowedExtensions", js.Array(value :_*))
    
    @scala.inline
    def setAllowedExtensions(value: js.Array[_]): Self = this.set("allowedExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedExtensions: Self = this.set("allowedExtensions", js.undefined)
    
    @scala.inline
    def setAutostartupload(value: Boolean): Self = this.set("autostartupload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutostartupload: Self = this.set("autostartupload", js.undefined)
    
    @scala.inline
    def setCancelAllClicked(value: (/* event */ Event, /* ui */ CancelAllClickedEventUIParam) => Unit): Self = this.set("cancelAllClicked", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCancelAllClicked: Self = this.set("cancelAllClicked", js.undefined)
    
    @scala.inline
    def setControlId(value: String): Self = this.set("controlId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlId: Self = this.set("controlId", js.undefined)
    
    @scala.inline
    def setCss(value: js.Any): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setErrorMessageAJAXRequestFileSize(value: String): Self = this.set("errorMessageAJAXRequestFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessageAJAXRequestFileSize: Self = this.set("errorMessageAJAXRequestFileSize", js.undefined)
    
    @scala.inline
    def setErrorMessageCancelUpload(value: String): Self = this.set("errorMessageCancelUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessageCancelUpload: Self = this.set("errorMessageCancelUpload", js.undefined)
    
    @scala.inline
    def setErrorMessageDropMultipleFilesWhenSingleModel(value: String): Self = this.set("errorMessageDropMultipleFilesWhenSingleModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessageDropMultipleFilesWhenSingleModel: Self = this.set("errorMessageDropMultipleFilesWhenSingleModel", js.undefined)
    
    @scala.inline
    def setErrorMessageGetFileStatus(value: String): Self = this.set("errorMessageGetFileStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessageGetFileStatus: Self = this.set("errorMessageGetFileStatus", js.undefined)
    
    @scala.inline
    def setErrorMessageMaxFileSizeExceeded(value: String): Self = this.set("errorMessageMaxFileSizeExceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessageMaxFileSizeExceeded: Self = this.set("errorMessageMaxFileSizeExceeded", js.undefined)
    
    @scala.inline
    def setErrorMessageMaxSimultaneousFiles(value: String): Self = this.set("errorMessageMaxSimultaneousFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessageMaxSimultaneousFiles: Self = this.set("errorMessageMaxSimultaneousFiles", js.undefined)
    
    @scala.inline
    def setErrorMessageMaxUploadedFiles(value: String): Self = this.set("errorMessageMaxUploadedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessageMaxUploadedFiles: Self = this.set("errorMessageMaxUploadedFiles", js.undefined)
    
    @scala.inline
    def setErrorMessageNoSuchFile(value: String): Self = this.set("errorMessageNoSuchFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessageNoSuchFile: Self = this.set("errorMessageNoSuchFile", js.undefined)
    
    @scala.inline
    def setErrorMessageOther(value: String): Self = this.set("errorMessageOther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessageOther: Self = this.set("errorMessageOther", js.undefined)
    
    @scala.inline
    def setErrorMessageTryToRemoveNonExistingFile(value: String): Self = this.set("errorMessageTryToRemoveNonExistingFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessageTryToRemoveNonExistingFile: Self = this.set("errorMessageTryToRemoveNonExistingFile", js.undefined)
    
    @scala.inline
    def setErrorMessageTryToStartNonExistingFile(value: String): Self = this.set("errorMessageTryToStartNonExistingFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessageTryToStartNonExistingFile: Self = this.set("errorMessageTryToStartNonExistingFile", js.undefined)
    
    @scala.inline
    def setErrorMessageValidatingFileExtension(value: String): Self = this.set("errorMessageValidatingFileExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessageValidatingFileExtension: Self = this.set("errorMessageValidatingFileExtension", js.undefined)
    
    @scala.inline
    def setFileExtensionIcons(value: IgUploadFileExtensionIcons): Self = this.set("fileExtensionIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileExtensionIcons: Self = this.set("fileExtensionIcons", js.undefined)
    
    @scala.inline
    def setFileExtensionsValidating(value: (/* event */ Event, /* ui */ FileExtensionsValidatingEventUIParam) => Unit): Self = this.set("fileExtensionsValidating", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFileExtensionsValidating: Self = this.set("fileExtensionsValidating", js.undefined)
    
    @scala.inline
    def setFileSelected(value: (/* event */ Event, /* ui */ FileSelectedEventUIParam) => Unit): Self = this.set("fileSelected", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFileSelected: Self = this.set("fileSelected", js.undefined)
    
    @scala.inline
    def setFileSelecting(value: (/* event */ Event, /* ui */ FileSelectingEventUIParam) => Unit): Self = this.set("fileSelecting", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFileSelecting: Self = this.set("fileSelecting", js.undefined)
    
    @scala.inline
    def setFileSizeDecimalDisplay(value: Double): Self = this.set("fileSizeDecimalDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSizeDecimalDisplay: Self = this.set("fileSizeDecimalDisplay", js.undefined)
    
    @scala.inline
    def setFileSizeMetric(value: js.Any): Self = this.set("fileSizeMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSizeMetric: Self = this.set("fileSizeMetric", js.undefined)
    
    @scala.inline
    def setFileUploadAborted(value: (/* event */ Event, /* ui */ FileUploadAbortedEventUIParam) => Unit): Self = this.set("fileUploadAborted", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFileUploadAborted: Self = this.set("fileUploadAborted", js.undefined)
    
    @scala.inline
    def setFileUploaded(value: (/* event */ Event, /* ui */ FileUploadedEventUIParam) => Unit): Self = this.set("fileUploaded", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFileUploaded: Self = this.set("fileUploaded", js.undefined)
    
    @scala.inline
    def setFileUploading(value: (/* event */ Event, /* ui */ FileUploadingEventUIParam) => Unit): Self = this.set("fileUploading", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFileUploading: Self = this.set("fileUploading", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLabelAddButton(value: String): Self = this.set("labelAddButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelAddButton: Self = this.set("labelAddButton", js.undefined)
    
    @scala.inline
    def setLabelClearAllButton(value: String): Self = this.set("labelClearAllButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelClearAllButton: Self = this.set("labelClearAllButton", js.undefined)
    
    @scala.inline
    def setLabelHideDetails(value: String): Self = this.set("labelHideDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelHideDetails: Self = this.set("labelHideDetails", js.undefined)
    
    @scala.inline
    def setLabelProgressBarFileNameContinue(value: String): Self = this.set("labelProgressBarFileNameContinue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelProgressBarFileNameContinue: Self = this.set("labelProgressBarFileNameContinue", js.undefined)
    
    @scala.inline
    def setLabelShowDetails(value: String): Self = this.set("labelShowDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelShowDetails: Self = this.set("labelShowDetails", js.undefined)
    
    @scala.inline
    def setLabelSummaryProgressBarTemplate(value: String): Self = this.set("labelSummaryProgressBarTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelSummaryProgressBarTemplate: Self = this.set("labelSummaryProgressBarTemplate", js.undefined)
    
    @scala.inline
    def setLabelSummaryProgressButtonCancel(value: String): Self = this.set("labelSummaryProgressButtonCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelSummaryProgressButtonCancel: Self = this.set("labelSummaryProgressButtonCancel", js.undefined)
    
    @scala.inline
    def setLabelSummaryProgressButtonContinue(value: String): Self = this.set("labelSummaryProgressButtonContinue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelSummaryProgressButtonContinue: Self = this.set("labelSummaryProgressButtonContinue", js.undefined)
    
    @scala.inline
    def setLabelSummaryProgressButtonDone(value: String): Self = this.set("labelSummaryProgressButtonDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelSummaryProgressButtonDone: Self = this.set("labelSummaryProgressButtonDone", js.undefined)
    
    @scala.inline
    def setLabelSummaryTemplate(value: String): Self = this.set("labelSummaryTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelSummaryTemplate: Self = this.set("labelSummaryTemplate", js.undefined)
    
    @scala.inline
    def setLabelUploadButton(value: String): Self = this.set("labelUploadButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelUploadButton: Self = this.set("labelUploadButton", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLocale(value: IgUploadLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxFileSize(value: js.Any): Self = this.set("maxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFileSize: Self = this.set("maxFileSize", js.undefined)
    
    @scala.inline
    def setMaxSimultaneousFilesUploads(value: Double): Self = this.set("maxSimultaneousFilesUploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSimultaneousFilesUploads: Self = this.set("maxSimultaneousFilesUploads", js.undefined)
    
    @scala.inline
    def setMaxUploadedFiles(value: Double): Self = this.set("maxUploadedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxUploadedFiles: Self = this.set("maxUploadedFiles", js.undefined)
    
    @scala.inline
    def setMode(value: js.Any): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setMultipleFiles(value: Boolean): Self = this.set("multipleFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleFiles: Self = this.set("multipleFiles", js.undefined)
    
    @scala.inline
    def setOnError(value: (/* event */ Event, /* ui */ OnErrorEventUIParam) => Unit): Self = this.set("onError", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnFormDataSubmit(value: (/* event */ Event, /* ui */ OnFormDataSubmitEventUIParam) => Unit): Self = this.set("onFormDataSubmit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnFormDataSubmit: Self = this.set("onFormDataSubmit", js.undefined)
    
    @scala.inline
    def setOnXHRLoad(value: (/* event */ Event, /* ui */ OnXHRLoadEventUIParam) => Unit): Self = this.set("onXHRLoad", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnXHRLoad: Self = this.set("onXHRLoad", js.undefined)
    
    @scala.inline
    def setProgressUrl(value: String): Self = this.set("progressUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressUrl: Self = this.set("progressUrl", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    
    @scala.inline
    def setShowFileExtensionIcon(value: Boolean): Self = this.set("showFileExtensionIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFileExtensionIcon: Self = this.set("showFileExtensionIcon", js.undefined)
    
    @scala.inline
    def setUploadUrl(value: String): Self = this.set("uploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadUrl: Self = this.set("uploadUrl", js.undefined)
    
    @scala.inline
    def setUseSingleRequest(value: Boolean): Self = this.set("useSingleRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSingleRequest: Self = this.set("useSingleRequest", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
