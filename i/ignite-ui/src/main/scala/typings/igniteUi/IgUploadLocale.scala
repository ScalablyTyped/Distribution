package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgUploadLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Get or set error message when AJAX Request to get file size throws error.
    *
    */
  var errorMessageAJAXRequestFileSize: js.UndefOr[String] = js.native
  
  /**
    * Get or set error message when ajax call to send cancel upload command.
    *
    */
  var errorMessageCancelUpload: js.UndefOr[String] = js.native
  
  /**
    * Get or set error message when trying to drop more than 1 file and mode is single.
    *
    */
  var errorMessageDropMultipleFilesWhenSingleModel: js.UndefOr[String] = js.native
  
  /**
    * Get or set message shown when max file size of the uploaded file exceeds the limit.
    *
    */
  var errorMessageFileSizeExceeded: js.UndefOr[String] = js.native
  
  /**
    * Get or set error message when ajax call to get file status throws error.
    *
    */
  var errorMessageGetFileStatus: js.UndefOr[String] = js.native
  
  /**
    * Get or set error message when maximum simultaneous files is less or equal to 0.
    *
    */
  var errorMessageMaxSimultaneousFiles: js.UndefOr[String] = js.native
  
  /**
    * Get or set error message when maximum allowed files exceeded.
    *
    */
  var errorMessageMaxUploadedFiles: js.UndefOr[String] = js.native
  
  /**
    * Get or set error message when file is not found.
    *
    */
  var errorMessageNoSuchFile: js.UndefOr[String] = js.native
  
  /**
    * Get or set error message different from the other messages.
    *
    */
  var errorMessageOther: js.UndefOr[String] = js.native
  
  /**
    * Get or set error message when trying to remove non existing file.
    *
    */
  var errorMessageTryToRemoveNonExistingFile: js.UndefOr[String] = js.native
  
  /**
    * Get or set error message when trying to start non existing file.
    *
    */
  var errorMessageTryToStartNonExistingFile: js.UndefOr[String] = js.native
  
  /**
    * Get or set error message when file extension validation failed.
    *
    */
  var errorMessageValidatingFileExtension: js.UndefOr[String] = js.native
  
  /**
    * Get or set label for browse button in main container.
    *
    */
  var labelAddButton: js.UndefOr[String] = js.native
  
  /**
    * Get or set label for summary Clear all button. It will be shown only in multiple upload mode.
    *
    */
  var labelClearAllButton: js.UndefOr[String] = js.native
  
  /**
    * Get or set label for show/hide details button when main container is shown.
    *
    */
  var labelHideDetails: js.UndefOr[String] = js.native
  
  /**
    * Get or set filename when it could not be shown the whole file name and should be shorten.
    *
    */
  var labelProgressBarFileNameContinue: js.UndefOr[String] = js.native
  
  /**
    * Get or set label for show/hide details button when main container is hidden.
    *
    */
  var labelShowDetails: js.UndefOr[String] = js.native
  
  /**
    * Get or set template for showing uploading information in summary progress bar. It will be shown only in multiple upload mode. {0} uploaded filesize. {1} - total file size.
    *
    */
  var labelSummaryProgressBarTemplate: js.UndefOr[String] = js.native
  
  /**
    * Get or set label for button cancelling all files. Shown only in multiple upload mode.
    *
    */
  var labelSummaryProgressButtonCancel: js.UndefOr[String] = js.native
  
  /**
    * Get or set label for start upload batch files. Shown only in multiple upload mode and autostartupload is false.
    *
    */
  var labelSummaryProgressButtonContinue: js.UndefOr[String] = js.native
  
  /**
    * Get or set label when upload is finished. Shown only in multiple upload mode.
    *
    */
  var labelSummaryProgressButtonDone: js.UndefOr[String] = js.native
  
  /**
    * Get or set template for showing summary template. {0} is count of uploaded files. {1} is total count of file to be uploaded.
    *
    */
  var labelSummaryTemplate: js.UndefOr[String] = js.native
  
  /**
    * Get or set label for the first shown browse button. When file is selected for the first time this button is hidden.
    *
    */
  var labelUploadButton: js.UndefOr[String] = js.native
  
  /**
    * Get or set title for browse button in main container.
    *
    */
  var titleAddFileButton: js.UndefOr[String] = js.native
  
  /**
    * Get or set title for the cancel upload button.
    *
    */
  var titleCancelUploadButton: js.UndefOr[String] = js.native
  
  /**
    * Get or set title for summary Clear all button. It will be shown only in multiple upload mode.
    *
    */
  var titleClearAllButton: js.UndefOr[String] = js.native
  
  /**
    * Get or set title for summary Clear all button. It will be shown only in multiple upload mode.
    *
    */
  var titleClearUploaded: js.UndefOr[String] = js.native
  
  /**
    * Get or set title for hide details button.
    *
    */
  var titleHideDetailsButton: js.UndefOr[String] = js.native
  
  /**
    * Get or set title for show details button.
    *
    */
  var titleShowDetailsButton: js.UndefOr[String] = js.native
  
  /**
    * Get or set title for Continue button.
    *
    */
  var titleSingleUploadButtonContinue: js.UndefOr[String] = js.native
  
  /**
    * Get or set title for button cancelling all files. Shown only in multiple upload mode.
    *
    */
  var titleSummaryProgressButtonCancel: js.UndefOr[String] = js.native
  
  /**
    * Get or set title for start upload batch files. Shown only in multiple upload mode and autostartupload is false.
    *
    */
  var titleSummaryProgressButtonContinue: js.UndefOr[String] = js.native
  
  /**
    * Get or set title when upload is finished. Shown only in multiple upload mode.
    *
    */
  var titleSummaryProgressButtonDone: js.UndefOr[String] = js.native
  
  /**
    * Get or set title for the first shown browse button. When file is selected for the first time this button is hidden.
    *
    */
  var titleUploadFileButtonInit: js.UndefOr[String] = js.native
}
object IgUploadLocale {
  
  @scala.inline
  def apply(): IgUploadLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgUploadLocale]
  }
  
  @scala.inline
  implicit class IgUploadLocaleOps[Self <: IgUploadLocale] (val x: Self) extends AnyVal {
    
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
    def setErrorMessageFileSizeExceeded(value: String): Self = this.set("errorMessageFileSizeExceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessageFileSizeExceeded: Self = this.set("errorMessageFileSizeExceeded", js.undefined)
    
    @scala.inline
    def setErrorMessageGetFileStatus(value: String): Self = this.set("errorMessageGetFileStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessageGetFileStatus: Self = this.set("errorMessageGetFileStatus", js.undefined)
    
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
    def setTitleAddFileButton(value: String): Self = this.set("titleAddFileButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleAddFileButton: Self = this.set("titleAddFileButton", js.undefined)
    
    @scala.inline
    def setTitleCancelUploadButton(value: String): Self = this.set("titleCancelUploadButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleCancelUploadButton: Self = this.set("titleCancelUploadButton", js.undefined)
    
    @scala.inline
    def setTitleClearAllButton(value: String): Self = this.set("titleClearAllButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleClearAllButton: Self = this.set("titleClearAllButton", js.undefined)
    
    @scala.inline
    def setTitleClearUploaded(value: String): Self = this.set("titleClearUploaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleClearUploaded: Self = this.set("titleClearUploaded", js.undefined)
    
    @scala.inline
    def setTitleHideDetailsButton(value: String): Self = this.set("titleHideDetailsButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleHideDetailsButton: Self = this.set("titleHideDetailsButton", js.undefined)
    
    @scala.inline
    def setTitleShowDetailsButton(value: String): Self = this.set("titleShowDetailsButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleShowDetailsButton: Self = this.set("titleShowDetailsButton", js.undefined)
    
    @scala.inline
    def setTitleSingleUploadButtonContinue(value: String): Self = this.set("titleSingleUploadButtonContinue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleSingleUploadButtonContinue: Self = this.set("titleSingleUploadButtonContinue", js.undefined)
    
    @scala.inline
    def setTitleSummaryProgressButtonCancel(value: String): Self = this.set("titleSummaryProgressButtonCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleSummaryProgressButtonCancel: Self = this.set("titleSummaryProgressButtonCancel", js.undefined)
    
    @scala.inline
    def setTitleSummaryProgressButtonContinue(value: String): Self = this.set("titleSummaryProgressButtonContinue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleSummaryProgressButtonContinue: Self = this.set("titleSummaryProgressButtonContinue", js.undefined)
    
    @scala.inline
    def setTitleSummaryProgressButtonDone(value: String): Self = this.set("titleSummaryProgressButtonDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleSummaryProgressButtonDone: Self = this.set("titleSummaryProgressButtonDone", js.undefined)
    
    @scala.inline
    def setTitleUploadFileButtonInit(value: String): Self = this.set("titleUploadFileButtonInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleUploadFileButtonInit: Self = this.set("titleUploadFileButtonInit", js.undefined)
  }
}
