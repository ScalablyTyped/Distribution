package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgUpload
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Get or set file allowed file extensions. When this array is empty - it is not made such validation. Example ["gif", "jpg", "bmp"].
    *
    */
  var allowedExtensions: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Get or set whether the file start upload automatically when it is selected. Default is false.
    *
    */
  var autostartupload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the name of the cancel all button event click. Fired when cancel all button in summary is clicked. Fired only in multiple upload mode.
    */
  var cancelAllClicked: js.UndefOr[CancelAllClickedEvent] = js.undefined
  
  /**
    * UniqueId of the control - should not be changed by developer. Set from server-side wrapper.
    *
    */
  var controlId: js.UndefOr[String] = js.undefined
  
  /**
    * Get or set control specific CSS options. For example you can override specific control classes with custom ones.
    *
    */
  var css: js.UndefOr[js.Any] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set error message when AJAX Request to get file size throws error.
    * Use option [locale.errorMessageAJAXRequestFileSize](ui.igupload#options:locale.errorMessageAJAXRequestFileSize).
    */
  var errorMessageAJAXRequestFileSize: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set error message when ajax call to send cancel upload command.
    * Use option [locale.errorMessageCancelUpload](ui.igupload#options:locale.errorMessageCancelUpload).
    */
  var errorMessageCancelUpload: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set error message when trying to drop more than 1 file and mode is single.
    * Use option [locale.errorMessageDropMultipleFilesWhenSingleModel](ui.igupload#options:locale.errorMessageDropMultipleFilesWhenSingleModel).
    */
  var errorMessageDropMultipleFilesWhenSingleModel: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set error message when ajax call to get file status throws error.
    * Use option [locale.errorMessageGetFileStatus](ui.igupload#options:locale.errorMessageGetFileStatus).
    */
  var errorMessageGetFileStatus: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set message shown when max file size of the uploaded file exceeds the limit.
    * Use option [locale.errorMessageMaxFileSizeExceeded](ui.igupload#options:locale.errorMessageMaxFileSizeExceeded).
    */
  var errorMessageMaxFileSizeExceeded: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set error message when maximum simultaneous files is less or equal to 0.
    * Use option [locale.errorMessageMaxSimultaneousFiles](ui.igupload#options:locale.errorMessageMaxSimultaneousFiles).
    */
  var errorMessageMaxSimultaneousFiles: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set error message when maximum allowed files exceeded.
    * Use option [locale.errorMessageMaxUploadedFiles](ui.igupload#options:locale.errorMessageMaxUploadedFiles).
    */
  var errorMessageMaxUploadedFiles: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set error message when file is not found.
    * Use option [locale.errorMessageNoSuchFile](ui.igupload#options:locale.errorMessageNoSuchFile).
    */
  var errorMessageNoSuchFile: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    *  Get or set error message different from the other messages.
    * Use option [locale.errorMessageOther](ui.igupload#options:locale.errorMessageOther).
    */
  var errorMessageOther: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set error message when trying to remove non existing file.
    * Use option [locale.errorMessageTryToRemoveNonExistingFile](ui.igupload#options:locale.errorMessageTryToRemoveNonExistingFile).
    */
  var errorMessageTryToRemoveNonExistingFile: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set error message when trying to start non existing file.
    * Use option [locale.errorMessageTryToStartNonExistingFile](ui.igupload#options:locale.errorMessageTryToStartNonExistingFile).
    */
  var errorMessageTryToStartNonExistingFile: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set error message when file extension validation failed.
    * Use option [locale.errorMessageValidatingFileExtension](ui.igupload#options:locale.errorMessageValidatingFileExtension).
    */
  var errorMessageValidatingFileExtension: js.UndefOr[String] = js.undefined
  
  /**
    * Set icon css classes for specified file extension
    *
    */
  var fileExtensionIcons: js.UndefOr[IgUploadFileExtensionIcons] = js.undefined
  
  /**
    * It is fired when validating file extensions
    */
  var fileExtensionsValidating: js.UndefOr[FileExtensionsValidatingEvent] = js.undefined
  
  /**
    * Defines the name of the file upload selected event. Fired when file is selected from browse dialog.
    * Return false in order to cancel uploading file.
    */
  var fileSelected: js.UndefOr[FileSelectedEvent] = js.undefined
  
  /**
    * Defines the name of the file upload selecting event. Fired when browse button is pressed.
    * Return false in order to cancel selecting file.
    */
  var fileSelecting: js.UndefOr[FileSelectingEvent] = js.undefined
  
  /**
    * The number of digits after the decimal point.
    *
    */
  var fileSizeDecimalDisplay: js.UndefOr[Double] = js.undefined
  
  /**
    * Get or set file size metrics how to be shown files size.
    *
    */
  var fileSizeMetric: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Defines the name of the file upload cancel event. Fired when the server responses that the file is canceled.
    */
  var fileUploadAborted: js.UndefOr[FileUploadAbortedEvent] = js.undefined
  
  /**
    * Defines the name of the uploaded event. Fired when the file is uploaded
    */
  var fileUploaded: js.UndefOr[FileUploadedEvent] = js.undefined
  
  /**
    * Defines the name of the file uploading event. Fired every time when fileuploader get status for the upload.
    * Return false in order to cancel uploading file.
    */
  var fileUploading: js.UndefOr[FileUploadingEvent] = js.undefined
  
  /**
    * Get or set height of the main container of the file upload control. Main container contains all buttons, progressbar, etc.
    *
    */
  var height: js.UndefOr[Double | String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set label for browse button in main container.
    * Use option [locale.labelAddButton](ui.igupload#options:locale.labelAddButton).
    */
  var labelAddButton: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set label for summary Clear all button. It will be shown only in multiple upload mode.
    * Use option [locale.labelClearAllButton](ui.igupload#options:locale.labelClearAllButton).
    */
  var labelClearAllButton: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set label for show/hide details button when main container is shown.
    * Use option [locale.labelHideDetails](ui.igupload#options:locale.labelHideDetails).
    */
  var labelHideDetails: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set filename when it could not be shown the whole file name and should be shorten.
    * Use option [locale.labelProgressBarFileNameContinue](ui.igupload#options:locale.labelProgressBarFileNameContinue).
    */
  var labelProgressBarFileNameContinue: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set label for show/hide details button when main container is hidden.
    * Use option [locale.labelShowDetails](ui.igupload#options:locale.labelShowDetails).
    */
  var labelShowDetails: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set template for showing uploading information in summary progress bar. It will be shown only in multiple upload mode. {0} uploaded filesize. {1} - total file size.
    * Use option [locale.labelSummaryProgressBarTemplate](ui.igupload#options:locale.labelSummaryProgressBarTemplate).
    */
  var labelSummaryProgressBarTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set label for button cancelling all files. Shown only in multiple upload mode.
    * Use option [locale.labelSummaryProgressButtonCancel](ui.igupload#options:locale.labelSummaryProgressButtonCancel).
    */
  var labelSummaryProgressButtonCancel: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set label for start upload batch files. Shown only in multiple upload mode and autostartupload is false.
    * Use option [locale.labelSummaryProgressButtonContinue](ui.igupload#options:locale.labelSummaryProgressButtonContinue).
    */
  var labelSummaryProgressButtonContinue: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set label when upload is finished. Shown only in multiple upload mode.
    * Use option [locale.labelSummaryProgressButtonDone](ui.igupload#options:locale.labelSummaryProgressButtonDone).
    */
  var labelSummaryProgressButtonDone: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set template for showing summary template. {0} is count of uploaded files. {1} is total count of file to be uploaded.
    * Use option [locale.labelSummaryTemplate](ui.igupload#options:locale.labelSummaryTemplate).
    */
  var labelSummaryTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Get or set label for the first shown browse button. When file is selected for the first time this button is hidden.
    * Use option [locale.labelUploadButton](ui.igupload#options:locale.labelUploadButton).
    */
  var labelUploadButton: js.UndefOr[String] = js.undefined
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[IgUploadLocale] = js.undefined
  
  /**
    * Maximum size(in bytes) allowed for the file to be uploaded. If it is set to null or -1 there is no limitation otherwise if the size(of the selected file) exceeds this value it is not allowed to be uploaded. This option is used for validation only on client side and only if the browser supports HTML5 file API and share information about the file size
    */
  var maxFileSize: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Get or set count of files that could be uploaded at the same time.
    *
    */
  var maxSimultaneousFilesUploads: js.UndefOr[Double] = js.undefined
  
  /**
    * Get or set the maximum number of allowed files to upload.
    *
    */
  var maxUploadedFiles: js.UndefOr[Double] = js.undefined
  
  /**
    * Get or set multiple or single file upload. In single upload it is possible to upload only one file at the same time.
    *
    */
  var mode: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Get or set a bool setting that allows user to select(for upload) more than 1 file from the browse dialog at once. HTML 5+ - it is supported by Chrome, MOzilla FF, Safar, Opera latest versions and IE10+
    *
    */
  var multipleFiles: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the name of the file upload error event. Fired when error is occurred.
    */
  var onError: js.UndefOr[OnErrorEvent] = js.undefined
  
  /**
    * It is fired before submitting to the server the uploading file(and its additional data if any). It could be used to append additional data fields to the FormData object(if the browser supports HTML5 file API - like newest Chrome, Firefox, IE11+). If the browser does not support HTML5 file API(IE10 and older) it could be added these data fields(as hidden input fields) to the form. Use the public API function addDataFields.
    */
  var onFormDataSubmit: js.UndefOr[OnFormDataSubmitEvent] = js.undefined
  
  /**
    * It is fired when event onload(of XmlHttpRequest) is fired. This event will be fired only if the browser supports HTML5 file API
    */
  var onXHRLoad: js.UndefOr[OnXHRLoadEvent] = js.undefined
  
  /**
    * Get or set URL of HTTPHandler to get information about file upload, current size and also to get commands
    *
    */
  var progressUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    * Get or set whether to show File Extension icon
    *
    */
  var showFileExtensionIcon: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Get or set URL for uploading.
    *
    */
  var uploadUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Get or set whether to use only one request for sending data, when you are sending more than one file.
    *
    */
  var useSingleRequest: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Get or set width of the main container of the file upload control. Main container contains all buttons, progressbar, etc.
    *
    */
  var width: js.UndefOr[Double | String] = js.undefined
}
object IgUpload {
  
  @scala.inline
  def apply(): IgUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgUpload]
  }
  
  @scala.inline
  implicit class IgUploadMutableBuilder[Self <: IgUpload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedExtensions(value: js.Array[js.Any]): Self = StObject.set(x, "allowedExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedExtensionsUndefined: Self = StObject.set(x, "allowedExtensions", js.undefined)
    
    @scala.inline
    def setAllowedExtensionsVarargs(value: js.Any*): Self = StObject.set(x, "allowedExtensions", js.Array(value :_*))
    
    @scala.inline
    def setAutostartupload(value: Boolean): Self = StObject.set(x, "autostartupload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutostartuploadUndefined: Self = StObject.set(x, "autostartupload", js.undefined)
    
    @scala.inline
    def setCancelAllClicked(value: (/* event */ Event, /* ui */ CancelAllClickedEventUIParam) => Unit): Self = StObject.set(x, "cancelAllClicked", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCancelAllClickedUndefined: Self = StObject.set(x, "cancelAllClicked", js.undefined)
    
    @scala.inline
    def setControlId(value: String): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlIdUndefined: Self = StObject.set(x, "controlId", js.undefined)
    
    @scala.inline
    def setCss(value: js.Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setErrorMessageAJAXRequestFileSize(value: String): Self = StObject.set(x, "errorMessageAJAXRequestFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageAJAXRequestFileSizeUndefined: Self = StObject.set(x, "errorMessageAJAXRequestFileSize", js.undefined)
    
    @scala.inline
    def setErrorMessageCancelUpload(value: String): Self = StObject.set(x, "errorMessageCancelUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageCancelUploadUndefined: Self = StObject.set(x, "errorMessageCancelUpload", js.undefined)
    
    @scala.inline
    def setErrorMessageDropMultipleFilesWhenSingleModel(value: String): Self = StObject.set(x, "errorMessageDropMultipleFilesWhenSingleModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageDropMultipleFilesWhenSingleModelUndefined: Self = StObject.set(x, "errorMessageDropMultipleFilesWhenSingleModel", js.undefined)
    
    @scala.inline
    def setErrorMessageGetFileStatus(value: String): Self = StObject.set(x, "errorMessageGetFileStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageGetFileStatusUndefined: Self = StObject.set(x, "errorMessageGetFileStatus", js.undefined)
    
    @scala.inline
    def setErrorMessageMaxFileSizeExceeded(value: String): Self = StObject.set(x, "errorMessageMaxFileSizeExceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageMaxFileSizeExceededUndefined: Self = StObject.set(x, "errorMessageMaxFileSizeExceeded", js.undefined)
    
    @scala.inline
    def setErrorMessageMaxSimultaneousFiles(value: String): Self = StObject.set(x, "errorMessageMaxSimultaneousFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageMaxSimultaneousFilesUndefined: Self = StObject.set(x, "errorMessageMaxSimultaneousFiles", js.undefined)
    
    @scala.inline
    def setErrorMessageMaxUploadedFiles(value: String): Self = StObject.set(x, "errorMessageMaxUploadedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageMaxUploadedFilesUndefined: Self = StObject.set(x, "errorMessageMaxUploadedFiles", js.undefined)
    
    @scala.inline
    def setErrorMessageNoSuchFile(value: String): Self = StObject.set(x, "errorMessageNoSuchFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageNoSuchFileUndefined: Self = StObject.set(x, "errorMessageNoSuchFile", js.undefined)
    
    @scala.inline
    def setErrorMessageOther(value: String): Self = StObject.set(x, "errorMessageOther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageOtherUndefined: Self = StObject.set(x, "errorMessageOther", js.undefined)
    
    @scala.inline
    def setErrorMessageTryToRemoveNonExistingFile(value: String): Self = StObject.set(x, "errorMessageTryToRemoveNonExistingFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageTryToRemoveNonExistingFileUndefined: Self = StObject.set(x, "errorMessageTryToRemoveNonExistingFile", js.undefined)
    
    @scala.inline
    def setErrorMessageTryToStartNonExistingFile(value: String): Self = StObject.set(x, "errorMessageTryToStartNonExistingFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageTryToStartNonExistingFileUndefined: Self = StObject.set(x, "errorMessageTryToStartNonExistingFile", js.undefined)
    
    @scala.inline
    def setErrorMessageValidatingFileExtension(value: String): Self = StObject.set(x, "errorMessageValidatingFileExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageValidatingFileExtensionUndefined: Self = StObject.set(x, "errorMessageValidatingFileExtension", js.undefined)
    
    @scala.inline
    def setFileExtensionIcons(value: IgUploadFileExtensionIcons): Self = StObject.set(x, "fileExtensionIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileExtensionIconsUndefined: Self = StObject.set(x, "fileExtensionIcons", js.undefined)
    
    @scala.inline
    def setFileExtensionsValidating(value: (/* event */ Event, /* ui */ FileExtensionsValidatingEventUIParam) => Unit): Self = StObject.set(x, "fileExtensionsValidating", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFileExtensionsValidatingUndefined: Self = StObject.set(x, "fileExtensionsValidating", js.undefined)
    
    @scala.inline
    def setFileSelected(value: (/* event */ Event, /* ui */ FileSelectedEventUIParam) => Unit): Self = StObject.set(x, "fileSelected", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFileSelectedUndefined: Self = StObject.set(x, "fileSelected", js.undefined)
    
    @scala.inline
    def setFileSelecting(value: (/* event */ Event, /* ui */ FileSelectingEventUIParam) => Unit): Self = StObject.set(x, "fileSelecting", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFileSelectingUndefined: Self = StObject.set(x, "fileSelecting", js.undefined)
    
    @scala.inline
    def setFileSizeDecimalDisplay(value: Double): Self = StObject.set(x, "fileSizeDecimalDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSizeDecimalDisplayUndefined: Self = StObject.set(x, "fileSizeDecimalDisplay", js.undefined)
    
    @scala.inline
    def setFileSizeMetric(value: js.Any): Self = StObject.set(x, "fileSizeMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSizeMetricUndefined: Self = StObject.set(x, "fileSizeMetric", js.undefined)
    
    @scala.inline
    def setFileUploadAborted(value: (/* event */ Event, /* ui */ FileUploadAbortedEventUIParam) => Unit): Self = StObject.set(x, "fileUploadAborted", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFileUploadAbortedUndefined: Self = StObject.set(x, "fileUploadAborted", js.undefined)
    
    @scala.inline
    def setFileUploaded(value: (/* event */ Event, /* ui */ FileUploadedEventUIParam) => Unit): Self = StObject.set(x, "fileUploaded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFileUploadedUndefined: Self = StObject.set(x, "fileUploaded", js.undefined)
    
    @scala.inline
    def setFileUploading(value: (/* event */ Event, /* ui */ FileUploadingEventUIParam) => Unit): Self = StObject.set(x, "fileUploading", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFileUploadingUndefined: Self = StObject.set(x, "fileUploading", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLabelAddButton(value: String): Self = StObject.set(x, "labelAddButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAddButtonUndefined: Self = StObject.set(x, "labelAddButton", js.undefined)
    
    @scala.inline
    def setLabelClearAllButton(value: String): Self = StObject.set(x, "labelClearAllButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelClearAllButtonUndefined: Self = StObject.set(x, "labelClearAllButton", js.undefined)
    
    @scala.inline
    def setLabelHideDetails(value: String): Self = StObject.set(x, "labelHideDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelHideDetailsUndefined: Self = StObject.set(x, "labelHideDetails", js.undefined)
    
    @scala.inline
    def setLabelProgressBarFileNameContinue(value: String): Self = StObject.set(x, "labelProgressBarFileNameContinue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelProgressBarFileNameContinueUndefined: Self = StObject.set(x, "labelProgressBarFileNameContinue", js.undefined)
    
    @scala.inline
    def setLabelShowDetails(value: String): Self = StObject.set(x, "labelShowDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelShowDetailsUndefined: Self = StObject.set(x, "labelShowDetails", js.undefined)
    
    @scala.inline
    def setLabelSummaryProgressBarTemplate(value: String): Self = StObject.set(x, "labelSummaryProgressBarTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelSummaryProgressBarTemplateUndefined: Self = StObject.set(x, "labelSummaryProgressBarTemplate", js.undefined)
    
    @scala.inline
    def setLabelSummaryProgressButtonCancel(value: String): Self = StObject.set(x, "labelSummaryProgressButtonCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelSummaryProgressButtonCancelUndefined: Self = StObject.set(x, "labelSummaryProgressButtonCancel", js.undefined)
    
    @scala.inline
    def setLabelSummaryProgressButtonContinue(value: String): Self = StObject.set(x, "labelSummaryProgressButtonContinue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelSummaryProgressButtonContinueUndefined: Self = StObject.set(x, "labelSummaryProgressButtonContinue", js.undefined)
    
    @scala.inline
    def setLabelSummaryProgressButtonDone(value: String): Self = StObject.set(x, "labelSummaryProgressButtonDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelSummaryProgressButtonDoneUndefined: Self = StObject.set(x, "labelSummaryProgressButtonDone", js.undefined)
    
    @scala.inline
    def setLabelSummaryTemplate(value: String): Self = StObject.set(x, "labelSummaryTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelSummaryTemplateUndefined: Self = StObject.set(x, "labelSummaryTemplate", js.undefined)
    
    @scala.inline
    def setLabelUploadButton(value: String): Self = StObject.set(x, "labelUploadButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUploadButtonUndefined: Self = StObject.set(x, "labelUploadButton", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocale(value: IgUploadLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMaxFileSize(value: js.Any): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
    
    @scala.inline
    def setMaxSimultaneousFilesUploads(value: Double): Self = StObject.set(x, "maxSimultaneousFilesUploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSimultaneousFilesUploadsUndefined: Self = StObject.set(x, "maxSimultaneousFilesUploads", js.undefined)
    
    @scala.inline
    def setMaxUploadedFiles(value: Double): Self = StObject.set(x, "maxUploadedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUploadedFilesUndefined: Self = StObject.set(x, "maxUploadedFiles", js.undefined)
    
    @scala.inline
    def setMode(value: js.Any): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setMultipleFiles(value: Boolean): Self = StObject.set(x, "multipleFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleFilesUndefined: Self = StObject.set(x, "multipleFiles", js.undefined)
    
    @scala.inline
    def setOnError(value: (/* event */ Event, /* ui */ OnErrorEventUIParam) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnFormDataSubmit(value: (/* event */ Event, /* ui */ OnFormDataSubmitEventUIParam) => Unit): Self = StObject.set(x, "onFormDataSubmit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnFormDataSubmitUndefined: Self = StObject.set(x, "onFormDataSubmit", js.undefined)
    
    @scala.inline
    def setOnXHRLoad(value: (/* event */ Event, /* ui */ OnXHRLoadEventUIParam) => Unit): Self = StObject.set(x, "onXHRLoad", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnXHRLoadUndefined: Self = StObject.set(x, "onXHRLoad", js.undefined)
    
    @scala.inline
    def setProgressUrl(value: String): Self = StObject.set(x, "progressUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUrlUndefined: Self = StObject.set(x, "progressUrl", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setShowFileExtensionIcon(value: Boolean): Self = StObject.set(x, "showFileExtensionIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFileExtensionIconUndefined: Self = StObject.set(x, "showFileExtensionIcon", js.undefined)
    
    @scala.inline
    def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
    
    @scala.inline
    def setUseSingleRequest(value: Boolean): Self = StObject.set(x, "useSingleRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSingleRequestUndefined: Self = StObject.set(x, "useSingleRequest", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
