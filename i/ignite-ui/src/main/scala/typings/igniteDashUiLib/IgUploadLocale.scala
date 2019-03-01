package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgUploadLocale
  extends /**
	 * Option for IgUploadLocale
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Get or set error message when AJAX Request to get file size throws error.
  	 *
  	 */
  var errorMessageAJAXRequestFileSize: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set error message when ajax call to send cancel upload command.
  	 *
  	 */
  var errorMessageCancelUpload: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set error message when trying to drop more than 1 file and mode is single.
  	 *
  	 */
  var errorMessageDropMultipleFilesWhenSingleModel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set message shown when max file size of the uploaded file exceeds the limit.
  	 *
  	 */
  var errorMessageFileSizeExceeded: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set error message when ajax call to get file status throws error.
  	 *
  	 */
  var errorMessageGetFileStatus: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set error message when maximum simultaneous files is less or equal to 0.
  	 *
  	 */
  var errorMessageMaxSimultaneousFiles: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set error message when maximum allowed files exceeded.
  	 *
  	 */
  var errorMessageMaxUploadedFiles: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set error message when file is not found.
  	 *
  	 */
  var errorMessageNoSuchFile: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set error message different from the other messages.
  	 *
  	 */
  var errorMessageOther: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set error message when trying to remove non existing file.
  	 *
  	 */
  var errorMessageTryToRemoveNonExistingFile: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set error message when trying to start non existing file.
  	 *
  	 */
  var errorMessageTryToStartNonExistingFile: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set error message when file extension validation failed.
  	 *
  	 */
  var errorMessageValidatingFileExtension: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set label for browse button in main container.
  	 *
  	 */
  var labelAddButton: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set label for summary Clear all button. It will be shown only in multiple upload mode.
  	 *
  	 */
  var labelClearAllButton: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set label for show/hide details button when main container is shown.
  	 *
  	 */
  var labelHideDetails: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set filename when it could not be shown the whole file name and should be shorten.
  	 *
  	 */
  var labelProgressBarFileNameContinue: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set label for show/hide details button when main container is hidden.
  	 *
  	 */
  var labelShowDetails: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set template for showing uploading information in summary progress bar. It will be shown only in multiple upload mode. {0} uploaded filesize. {1} - total file size.
  	 *
  	 */
  var labelSummaryProgressBarTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set label for button cancelling all files. Shown only in multiple upload mode.
  	 *
  	 */
  var labelSummaryProgressButtonCancel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set label for start upload batch files. Shown only in multiple upload mode and autostartupload is false.
  	 *
  	 */
  var labelSummaryProgressButtonContinue: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set label when upload is finished. Shown only in multiple upload mode.
  	 *
  	 */
  var labelSummaryProgressButtonDone: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set template for showing summary template. {0} is count of uploaded files. {1} is total count of file to be uploaded.
  	 *
  	 */
  var labelSummaryTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set label for the first shown browse button. When file is selected for the first time this button is hidden.
  	 *
  	 */
  var labelUploadButton: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set title for browse button in main container.
  	 *
  	 */
  var titleAddFileButton: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set title for the cancel upload button.
  	 *
  	 */
  var titleCancelUploadButton: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set title for summary Clear all button. It will be shown only in multiple upload mode.
  	 *
  	 */
  var titleClearAllButton: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set title for summary Clear all button. It will be shown only in multiple upload mode.
  	 *
  	 */
  var titleClearUploaded: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set title for hide details button.
  	 *
  	 */
  var titleHideDetailsButton: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set title for show details button.
  	 *
  	 */
  var titleShowDetailsButton: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set title for Continue button.
  	 *
  	 */
  var titleSingleUploadButtonContinue: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set title for button cancelling all files. Shown only in multiple upload mode.
  	 *
  	 */
  var titleSummaryProgressButtonCancel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set title for start upload batch files. Shown only in multiple upload mode and autostartupload is false.
  	 *
  	 */
  var titleSummaryProgressButtonContinue: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set title when upload is finished. Shown only in multiple upload mode.
  	 *
  	 */
  var titleSummaryProgressButtonDone: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set title for the first shown browse button. When file is selected for the first time this button is hidden.
  	 *
  	 */
  var titleUploadFileButtonInit: js.UndefOr[java.lang.String] = js.undefined
}

object IgUploadLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgUploadLocale
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    errorMessageAJAXRequestFileSize: java.lang.String = null,
    errorMessageCancelUpload: java.lang.String = null,
    errorMessageDropMultipleFilesWhenSingleModel: java.lang.String = null,
    errorMessageFileSizeExceeded: java.lang.String = null,
    errorMessageGetFileStatus: java.lang.String = null,
    errorMessageMaxSimultaneousFiles: java.lang.String = null,
    errorMessageMaxUploadedFiles: java.lang.String = null,
    errorMessageNoSuchFile: java.lang.String = null,
    errorMessageOther: java.lang.String = null,
    errorMessageTryToRemoveNonExistingFile: java.lang.String = null,
    errorMessageTryToStartNonExistingFile: java.lang.String = null,
    errorMessageValidatingFileExtension: java.lang.String = null,
    labelAddButton: java.lang.String = null,
    labelClearAllButton: java.lang.String = null,
    labelHideDetails: java.lang.String = null,
    labelProgressBarFileNameContinue: java.lang.String = null,
    labelShowDetails: java.lang.String = null,
    labelSummaryProgressBarTemplate: java.lang.String = null,
    labelSummaryProgressButtonCancel: java.lang.String = null,
    labelSummaryProgressButtonContinue: java.lang.String = null,
    labelSummaryProgressButtonDone: java.lang.String = null,
    labelSummaryTemplate: java.lang.String = null,
    labelUploadButton: java.lang.String = null,
    titleAddFileButton: java.lang.String = null,
    titleCancelUploadButton: java.lang.String = null,
    titleClearAllButton: java.lang.String = null,
    titleClearUploaded: java.lang.String = null,
    titleHideDetailsButton: java.lang.String = null,
    titleShowDetailsButton: java.lang.String = null,
    titleSingleUploadButtonContinue: java.lang.String = null,
    titleSummaryProgressButtonCancel: java.lang.String = null,
    titleSummaryProgressButtonContinue: java.lang.String = null,
    titleSummaryProgressButtonDone: java.lang.String = null,
    titleUploadFileButtonInit: java.lang.String = null
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

