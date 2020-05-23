package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgUpload
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Get or set file allowed file extensions. When this array is empty - it is not made such validation. Example ["gif", "jpg", "bmp"].
    *
    */
  var allowedExtensions: js.UndefOr[js.Array[_]] = js.undefined
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
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    allowedExtensions: js.Array[_] = null,
    autostartupload: js.UndefOr[Boolean] = js.undefined,
    cancelAllClicked: (/* event */ Event, /* ui */ CancelAllClickedEventUIParam) => Unit = null,
    controlId: String = null,
    css: js.Any = null,
    errorMessageAJAXRequestFileSize: String = null,
    errorMessageCancelUpload: String = null,
    errorMessageDropMultipleFilesWhenSingleModel: String = null,
    errorMessageGetFileStatus: String = null,
    errorMessageMaxFileSizeExceeded: String = null,
    errorMessageMaxSimultaneousFiles: String = null,
    errorMessageMaxUploadedFiles: String = null,
    errorMessageNoSuchFile: String = null,
    errorMessageOther: String = null,
    errorMessageTryToRemoveNonExistingFile: String = null,
    errorMessageTryToStartNonExistingFile: String = null,
    errorMessageValidatingFileExtension: String = null,
    fileExtensionIcons: IgUploadFileExtensionIcons = null,
    fileExtensionsValidating: (/* event */ Event, /* ui */ FileExtensionsValidatingEventUIParam) => Unit = null,
    fileSelected: (/* event */ Event, /* ui */ FileSelectedEventUIParam) => Unit = null,
    fileSelecting: (/* event */ Event, /* ui */ FileSelectingEventUIParam) => Unit = null,
    fileSizeDecimalDisplay: js.UndefOr[Double] = js.undefined,
    fileSizeMetric: js.Any = null,
    fileUploadAborted: (/* event */ Event, /* ui */ FileUploadAbortedEventUIParam) => Unit = null,
    fileUploaded: (/* event */ Event, /* ui */ FileUploadedEventUIParam) => Unit = null,
    fileUploading: (/* event */ Event, /* ui */ FileUploadingEventUIParam) => Unit = null,
    height: Double | String = null,
    labelAddButton: String = null,
    labelClearAllButton: String = null,
    labelHideDetails: String = null,
    labelProgressBarFileNameContinue: String = null,
    labelShowDetails: String = null,
    labelSummaryProgressBarTemplate: String = null,
    labelSummaryProgressButtonCancel: String = null,
    labelSummaryProgressButtonContinue: String = null,
    labelSummaryProgressButtonDone: String = null,
    labelSummaryTemplate: String = null,
    labelUploadButton: String = null,
    language: String = null,
    locale: IgUploadLocale = null,
    maxFileSize: js.Any = null,
    maxSimultaneousFilesUploads: js.UndefOr[Double] = js.undefined,
    maxUploadedFiles: js.UndefOr[Double] = js.undefined,
    mode: js.Any = null,
    multipleFiles: js.UndefOr[Boolean] = js.undefined,
    onError: (/* event */ Event, /* ui */ OnErrorEventUIParam) => Unit = null,
    onFormDataSubmit: (/* event */ Event, /* ui */ OnFormDataSubmitEventUIParam) => Unit = null,
    onXHRLoad: (/* event */ Event, /* ui */ OnXHRLoadEventUIParam) => Unit = null,
    progressUrl: String = null,
    regional: String | js.Object = null,
    showFileExtensionIcon: js.UndefOr[Boolean] = js.undefined,
    uploadUrl: String = null,
    useSingleRequest: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null
  ): IgUpload = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (allowedExtensions != null) __obj.updateDynamic("allowedExtensions")(allowedExtensions.asInstanceOf[js.Any])
    if (!js.isUndefined(autostartupload)) __obj.updateDynamic("autostartupload")(autostartupload.get.asInstanceOf[js.Any])
    if (cancelAllClicked != null) __obj.updateDynamic("cancelAllClicked")(js.Any.fromFunction2(cancelAllClicked))
    if (controlId != null) __obj.updateDynamic("controlId")(controlId.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (errorMessageAJAXRequestFileSize != null) __obj.updateDynamic("errorMessageAJAXRequestFileSize")(errorMessageAJAXRequestFileSize.asInstanceOf[js.Any])
    if (errorMessageCancelUpload != null) __obj.updateDynamic("errorMessageCancelUpload")(errorMessageCancelUpload.asInstanceOf[js.Any])
    if (errorMessageDropMultipleFilesWhenSingleModel != null) __obj.updateDynamic("errorMessageDropMultipleFilesWhenSingleModel")(errorMessageDropMultipleFilesWhenSingleModel.asInstanceOf[js.Any])
    if (errorMessageGetFileStatus != null) __obj.updateDynamic("errorMessageGetFileStatus")(errorMessageGetFileStatus.asInstanceOf[js.Any])
    if (errorMessageMaxFileSizeExceeded != null) __obj.updateDynamic("errorMessageMaxFileSizeExceeded")(errorMessageMaxFileSizeExceeded.asInstanceOf[js.Any])
    if (errorMessageMaxSimultaneousFiles != null) __obj.updateDynamic("errorMessageMaxSimultaneousFiles")(errorMessageMaxSimultaneousFiles.asInstanceOf[js.Any])
    if (errorMessageMaxUploadedFiles != null) __obj.updateDynamic("errorMessageMaxUploadedFiles")(errorMessageMaxUploadedFiles.asInstanceOf[js.Any])
    if (errorMessageNoSuchFile != null) __obj.updateDynamic("errorMessageNoSuchFile")(errorMessageNoSuchFile.asInstanceOf[js.Any])
    if (errorMessageOther != null) __obj.updateDynamic("errorMessageOther")(errorMessageOther.asInstanceOf[js.Any])
    if (errorMessageTryToRemoveNonExistingFile != null) __obj.updateDynamic("errorMessageTryToRemoveNonExistingFile")(errorMessageTryToRemoveNonExistingFile.asInstanceOf[js.Any])
    if (errorMessageTryToStartNonExistingFile != null) __obj.updateDynamic("errorMessageTryToStartNonExistingFile")(errorMessageTryToStartNonExistingFile.asInstanceOf[js.Any])
    if (errorMessageValidatingFileExtension != null) __obj.updateDynamic("errorMessageValidatingFileExtension")(errorMessageValidatingFileExtension.asInstanceOf[js.Any])
    if (fileExtensionIcons != null) __obj.updateDynamic("fileExtensionIcons")(fileExtensionIcons.asInstanceOf[js.Any])
    if (fileExtensionsValidating != null) __obj.updateDynamic("fileExtensionsValidating")(js.Any.fromFunction2(fileExtensionsValidating))
    if (fileSelected != null) __obj.updateDynamic("fileSelected")(js.Any.fromFunction2(fileSelected))
    if (fileSelecting != null) __obj.updateDynamic("fileSelecting")(js.Any.fromFunction2(fileSelecting))
    if (!js.isUndefined(fileSizeDecimalDisplay)) __obj.updateDynamic("fileSizeDecimalDisplay")(fileSizeDecimalDisplay.get.asInstanceOf[js.Any])
    if (fileSizeMetric != null) __obj.updateDynamic("fileSizeMetric")(fileSizeMetric.asInstanceOf[js.Any])
    if (fileUploadAborted != null) __obj.updateDynamic("fileUploadAborted")(js.Any.fromFunction2(fileUploadAborted))
    if (fileUploaded != null) __obj.updateDynamic("fileUploaded")(js.Any.fromFunction2(fileUploaded))
    if (fileUploading != null) __obj.updateDynamic("fileUploading")(js.Any.fromFunction2(fileUploading))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (labelAddButton != null) __obj.updateDynamic("labelAddButton")(labelAddButton.asInstanceOf[js.Any])
    if (labelClearAllButton != null) __obj.updateDynamic("labelClearAllButton")(labelClearAllButton.asInstanceOf[js.Any])
    if (labelHideDetails != null) __obj.updateDynamic("labelHideDetails")(labelHideDetails.asInstanceOf[js.Any])
    if (labelProgressBarFileNameContinue != null) __obj.updateDynamic("labelProgressBarFileNameContinue")(labelProgressBarFileNameContinue.asInstanceOf[js.Any])
    if (labelShowDetails != null) __obj.updateDynamic("labelShowDetails")(labelShowDetails.asInstanceOf[js.Any])
    if (labelSummaryProgressBarTemplate != null) __obj.updateDynamic("labelSummaryProgressBarTemplate")(labelSummaryProgressBarTemplate.asInstanceOf[js.Any])
    if (labelSummaryProgressButtonCancel != null) __obj.updateDynamic("labelSummaryProgressButtonCancel")(labelSummaryProgressButtonCancel.asInstanceOf[js.Any])
    if (labelSummaryProgressButtonContinue != null) __obj.updateDynamic("labelSummaryProgressButtonContinue")(labelSummaryProgressButtonContinue.asInstanceOf[js.Any])
    if (labelSummaryProgressButtonDone != null) __obj.updateDynamic("labelSummaryProgressButtonDone")(labelSummaryProgressButtonDone.asInstanceOf[js.Any])
    if (labelSummaryTemplate != null) __obj.updateDynamic("labelSummaryTemplate")(labelSummaryTemplate.asInstanceOf[js.Any])
    if (labelUploadButton != null) __obj.updateDynamic("labelUploadButton")(labelUploadButton.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSimultaneousFilesUploads)) __obj.updateDynamic("maxSimultaneousFilesUploads")(maxSimultaneousFilesUploads.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxUploadedFiles)) __obj.updateDynamic("maxUploadedFiles")(maxUploadedFiles.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleFiles)) __obj.updateDynamic("multipleFiles")(multipleFiles.get.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction2(onError))
    if (onFormDataSubmit != null) __obj.updateDynamic("onFormDataSubmit")(js.Any.fromFunction2(onFormDataSubmit))
    if (onXHRLoad != null) __obj.updateDynamic("onXHRLoad")(js.Any.fromFunction2(onXHRLoad))
    if (progressUrl != null) __obj.updateDynamic("progressUrl")(progressUrl.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (!js.isUndefined(showFileExtensionIcon)) __obj.updateDynamic("showFileExtensionIcon")(showFileExtensionIcon.get.asInstanceOf[js.Any])
    if (uploadUrl != null) __obj.updateDynamic("uploadUrl")(uploadUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(useSingleRequest)) __obj.updateDynamic("useSingleRequest")(useSingleRequest.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgUpload]
  }
}

