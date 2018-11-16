package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgUploadLocale
  extends /**
	 * Option for IgUploadLocale
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
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

