package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgUploadLocale
  extends /**
	 * Option for IgUploadLocale
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Get or set error message when AJAX Request to get file size throws error.
  	 *
  	 */
  var errorMessageAJAXRequestFileSize: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set error message when ajax call to send cancel upload command.
  	 *
  	 */
  var errorMessageCancelUpload: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set error message when trying to drop more than 1 file and mode is single.
  	 *
  	 */
  var errorMessageDropMultipleFilesWhenSingleModel: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set message shown when max file size of the uploaded file exceeds the limit.
  	 *
  	 */
  var errorMessageFileSizeExceeded: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set error message when ajax call to get file status throws error.
  	 *
  	 */
  var errorMessageGetFileStatus: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set error message when maximum simultaneous files is less or equal to 0.
  	 *
  	 */
  var errorMessageMaxSimultaneousFiles: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set error message when maximum allowed files exceeded.
  	 *
  	 */
  var errorMessageMaxUploadedFiles: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set error message when file is not found.
  	 *
  	 */
  var errorMessageNoSuchFile: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set error message different from the other messages.
  	 *
  	 */
  var errorMessageOther: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set error message when trying to remove non existing file.
  	 *
  	 */
  var errorMessageTryToRemoveNonExistingFile: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set error message when trying to start non existing file.
  	 *
  	 */
  var errorMessageTryToStartNonExistingFile: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set error message when file extension validation failed.
  	 *
  	 */
  var errorMessageValidatingFileExtension: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set label for browse button in main container.
  	 *
  	 */
  var labelAddButton: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set label for summary Clear all button. It will be shown only in multiple upload mode.
  	 *
  	 */
  var labelClearAllButton: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set label for show/hide details button when main container is shown.
  	 *
  	 */
  var labelHideDetails: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set filename when it could not be shown the whole file name and should be shorten.
  	 *
  	 */
  var labelProgressBarFileNameContinue: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set label for show/hide details button when main container is hidden.
  	 *
  	 */
  var labelShowDetails: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set template for showing uploading information in summary progress bar. It will be shown only in multiple upload mode. {0} uploaded filesize. {1} - total file size.
  	 *
  	 */
  var labelSummaryProgressBarTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set label for button cancelling all files. Shown only in multiple upload mode.
  	 *
  	 */
  var labelSummaryProgressButtonCancel: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set label for start upload batch files. Shown only in multiple upload mode and autostartupload is false.
  	 *
  	 */
  var labelSummaryProgressButtonContinue: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set label when upload is finished. Shown only in multiple upload mode.
  	 *
  	 */
  var labelSummaryProgressButtonDone: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set template for showing summary template. {0} is count of uploaded files. {1} is total count of file to be uploaded.
  	 *
  	 */
  var labelSummaryTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set label for the first shown browse button. When file is selected for the first time this button is hidden.
  	 *
  	 */
  var labelUploadButton: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set title for browse button in main container.
  	 *
  	 */
  var titleAddFileButton: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set title for the cancel upload button.
  	 *
  	 */
  var titleCancelUploadButton: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set title for summary Clear all button. It will be shown only in multiple upload mode.
  	 *
  	 */
  var titleClearAllButton: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set title for summary Clear all button. It will be shown only in multiple upload mode.
  	 *
  	 */
  var titleClearUploaded: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set title for hide details button.
  	 *
  	 */
  var titleHideDetailsButton: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set title for show details button.
  	 *
  	 */
  var titleShowDetailsButton: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set title for Continue button.
  	 *
  	 */
  var titleSingleUploadButtonContinue: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set title for button cancelling all files. Shown only in multiple upload mode.
  	 *
  	 */
  var titleSummaryProgressButtonCancel: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set title for start upload batch files. Shown only in multiple upload mode and autostartupload is false.
  	 *
  	 */
  var titleSummaryProgressButtonContinue: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set title when upload is finished. Shown only in multiple upload mode.
  	 *
  	 */
  var titleSummaryProgressButtonDone: js.UndefOr[String] = js.undefined
  /**
  	 * Get or set title for the first shown browse button. When file is selected for the first time this button is hidden.
  	 *
  	 */
  var titleUploadFileButtonInit: js.UndefOr[String] = js.undefined
}

object IgUploadLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgUploadLocale
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    errorMessageAJAXRequestFileSize: String = null,
    errorMessageCancelUpload: String = null,
    errorMessageDropMultipleFilesWhenSingleModel: String = null,
    errorMessageFileSizeExceeded: String = null,
    errorMessageGetFileStatus: String = null,
    errorMessageMaxSimultaneousFiles: String = null,
    errorMessageMaxUploadedFiles: String = null,
    errorMessageNoSuchFile: String = null,
    errorMessageOther: String = null,
    errorMessageTryToRemoveNonExistingFile: String = null,
    errorMessageTryToStartNonExistingFile: String = null,
    errorMessageValidatingFileExtension: String = null,
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
    titleAddFileButton: String = null,
    titleCancelUploadButton: String = null,
    titleClearAllButton: String = null,
    titleClearUploaded: String = null,
    titleHideDetailsButton: String = null,
    titleShowDetailsButton: String = null,
    titleSingleUploadButtonContinue: String = null,
    titleSummaryProgressButtonCancel: String = null,
    titleSummaryProgressButtonContinue: String = null,
    titleSummaryProgressButtonDone: String = null,
    titleUploadFileButtonInit: String = null
  ): IgUploadLocale = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (errorMessageAJAXRequestFileSize != null) __obj.updateDynamic("errorMessageAJAXRequestFileSize")(errorMessageAJAXRequestFileSize)
    if (errorMessageCancelUpload != null) __obj.updateDynamic("errorMessageCancelUpload")(errorMessageCancelUpload)
    if (errorMessageDropMultipleFilesWhenSingleModel != null) __obj.updateDynamic("errorMessageDropMultipleFilesWhenSingleModel")(errorMessageDropMultipleFilesWhenSingleModel)
    if (errorMessageFileSizeExceeded != null) __obj.updateDynamic("errorMessageFileSizeExceeded")(errorMessageFileSizeExceeded)
    if (errorMessageGetFileStatus != null) __obj.updateDynamic("errorMessageGetFileStatus")(errorMessageGetFileStatus)
    if (errorMessageMaxSimultaneousFiles != null) __obj.updateDynamic("errorMessageMaxSimultaneousFiles")(errorMessageMaxSimultaneousFiles)
    if (errorMessageMaxUploadedFiles != null) __obj.updateDynamic("errorMessageMaxUploadedFiles")(errorMessageMaxUploadedFiles)
    if (errorMessageNoSuchFile != null) __obj.updateDynamic("errorMessageNoSuchFile")(errorMessageNoSuchFile)
    if (errorMessageOther != null) __obj.updateDynamic("errorMessageOther")(errorMessageOther)
    if (errorMessageTryToRemoveNonExistingFile != null) __obj.updateDynamic("errorMessageTryToRemoveNonExistingFile")(errorMessageTryToRemoveNonExistingFile)
    if (errorMessageTryToStartNonExistingFile != null) __obj.updateDynamic("errorMessageTryToStartNonExistingFile")(errorMessageTryToStartNonExistingFile)
    if (errorMessageValidatingFileExtension != null) __obj.updateDynamic("errorMessageValidatingFileExtension")(errorMessageValidatingFileExtension)
    if (labelAddButton != null) __obj.updateDynamic("labelAddButton")(labelAddButton)
    if (labelClearAllButton != null) __obj.updateDynamic("labelClearAllButton")(labelClearAllButton)
    if (labelHideDetails != null) __obj.updateDynamic("labelHideDetails")(labelHideDetails)
    if (labelProgressBarFileNameContinue != null) __obj.updateDynamic("labelProgressBarFileNameContinue")(labelProgressBarFileNameContinue)
    if (labelShowDetails != null) __obj.updateDynamic("labelShowDetails")(labelShowDetails)
    if (labelSummaryProgressBarTemplate != null) __obj.updateDynamic("labelSummaryProgressBarTemplate")(labelSummaryProgressBarTemplate)
    if (labelSummaryProgressButtonCancel != null) __obj.updateDynamic("labelSummaryProgressButtonCancel")(labelSummaryProgressButtonCancel)
    if (labelSummaryProgressButtonContinue != null) __obj.updateDynamic("labelSummaryProgressButtonContinue")(labelSummaryProgressButtonContinue)
    if (labelSummaryProgressButtonDone != null) __obj.updateDynamic("labelSummaryProgressButtonDone")(labelSummaryProgressButtonDone)
    if (labelSummaryTemplate != null) __obj.updateDynamic("labelSummaryTemplate")(labelSummaryTemplate)
    if (labelUploadButton != null) __obj.updateDynamic("labelUploadButton")(labelUploadButton)
    if (titleAddFileButton != null) __obj.updateDynamic("titleAddFileButton")(titleAddFileButton)
    if (titleCancelUploadButton != null) __obj.updateDynamic("titleCancelUploadButton")(titleCancelUploadButton)
    if (titleClearAllButton != null) __obj.updateDynamic("titleClearAllButton")(titleClearAllButton)
    if (titleClearUploaded != null) __obj.updateDynamic("titleClearUploaded")(titleClearUploaded)
    if (titleHideDetailsButton != null) __obj.updateDynamic("titleHideDetailsButton")(titleHideDetailsButton)
    if (titleShowDetailsButton != null) __obj.updateDynamic("titleShowDetailsButton")(titleShowDetailsButton)
    if (titleSingleUploadButtonContinue != null) __obj.updateDynamic("titleSingleUploadButtonContinue")(titleSingleUploadButtonContinue)
    if (titleSummaryProgressButtonCancel != null) __obj.updateDynamic("titleSummaryProgressButtonCancel")(titleSummaryProgressButtonCancel)
    if (titleSummaryProgressButtonContinue != null) __obj.updateDynamic("titleSummaryProgressButtonContinue")(titleSummaryProgressButtonContinue)
    if (titleSummaryProgressButtonDone != null) __obj.updateDynamic("titleSummaryProgressButtonDone")(titleSummaryProgressButtonDone)
    if (titleUploadFileButtonInit != null) __obj.updateDynamic("titleUploadFileButtonInit")(titleUploadFileButtonInit)
    __obj.asInstanceOf[IgUploadLocale]
  }
}

