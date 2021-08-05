package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgUploadLocale
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
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
  
  inline def apply(): IgUploadLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgUploadLocale]
  }
  
  extension [Self <: IgUploadLocale](x: Self) {
    
    inline def setErrorMessageAJAXRequestFileSize(value: String): Self = StObject.set(x, "errorMessageAJAXRequestFileSize", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageAJAXRequestFileSizeUndefined: Self = StObject.set(x, "errorMessageAJAXRequestFileSize", js.undefined)
    
    inline def setErrorMessageCancelUpload(value: String): Self = StObject.set(x, "errorMessageCancelUpload", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageCancelUploadUndefined: Self = StObject.set(x, "errorMessageCancelUpload", js.undefined)
    
    inline def setErrorMessageDropMultipleFilesWhenSingleModel(value: String): Self = StObject.set(x, "errorMessageDropMultipleFilesWhenSingleModel", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageDropMultipleFilesWhenSingleModelUndefined: Self = StObject.set(x, "errorMessageDropMultipleFilesWhenSingleModel", js.undefined)
    
    inline def setErrorMessageFileSizeExceeded(value: String): Self = StObject.set(x, "errorMessageFileSizeExceeded", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageFileSizeExceededUndefined: Self = StObject.set(x, "errorMessageFileSizeExceeded", js.undefined)
    
    inline def setErrorMessageGetFileStatus(value: String): Self = StObject.set(x, "errorMessageGetFileStatus", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageGetFileStatusUndefined: Self = StObject.set(x, "errorMessageGetFileStatus", js.undefined)
    
    inline def setErrorMessageMaxSimultaneousFiles(value: String): Self = StObject.set(x, "errorMessageMaxSimultaneousFiles", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageMaxSimultaneousFilesUndefined: Self = StObject.set(x, "errorMessageMaxSimultaneousFiles", js.undefined)
    
    inline def setErrorMessageMaxUploadedFiles(value: String): Self = StObject.set(x, "errorMessageMaxUploadedFiles", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageMaxUploadedFilesUndefined: Self = StObject.set(x, "errorMessageMaxUploadedFiles", js.undefined)
    
    inline def setErrorMessageNoSuchFile(value: String): Self = StObject.set(x, "errorMessageNoSuchFile", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNoSuchFileUndefined: Self = StObject.set(x, "errorMessageNoSuchFile", js.undefined)
    
    inline def setErrorMessageOther(value: String): Self = StObject.set(x, "errorMessageOther", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageOtherUndefined: Self = StObject.set(x, "errorMessageOther", js.undefined)
    
    inline def setErrorMessageTryToRemoveNonExistingFile(value: String): Self = StObject.set(x, "errorMessageTryToRemoveNonExistingFile", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageTryToRemoveNonExistingFileUndefined: Self = StObject.set(x, "errorMessageTryToRemoveNonExistingFile", js.undefined)
    
    inline def setErrorMessageTryToStartNonExistingFile(value: String): Self = StObject.set(x, "errorMessageTryToStartNonExistingFile", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageTryToStartNonExistingFileUndefined: Self = StObject.set(x, "errorMessageTryToStartNonExistingFile", js.undefined)
    
    inline def setErrorMessageValidatingFileExtension(value: String): Self = StObject.set(x, "errorMessageValidatingFileExtension", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageValidatingFileExtensionUndefined: Self = StObject.set(x, "errorMessageValidatingFileExtension", js.undefined)
    
    inline def setLabelAddButton(value: String): Self = StObject.set(x, "labelAddButton", value.asInstanceOf[js.Any])
    
    inline def setLabelAddButtonUndefined: Self = StObject.set(x, "labelAddButton", js.undefined)
    
    inline def setLabelClearAllButton(value: String): Self = StObject.set(x, "labelClearAllButton", value.asInstanceOf[js.Any])
    
    inline def setLabelClearAllButtonUndefined: Self = StObject.set(x, "labelClearAllButton", js.undefined)
    
    inline def setLabelHideDetails(value: String): Self = StObject.set(x, "labelHideDetails", value.asInstanceOf[js.Any])
    
    inline def setLabelHideDetailsUndefined: Self = StObject.set(x, "labelHideDetails", js.undefined)
    
    inline def setLabelProgressBarFileNameContinue(value: String): Self = StObject.set(x, "labelProgressBarFileNameContinue", value.asInstanceOf[js.Any])
    
    inline def setLabelProgressBarFileNameContinueUndefined: Self = StObject.set(x, "labelProgressBarFileNameContinue", js.undefined)
    
    inline def setLabelShowDetails(value: String): Self = StObject.set(x, "labelShowDetails", value.asInstanceOf[js.Any])
    
    inline def setLabelShowDetailsUndefined: Self = StObject.set(x, "labelShowDetails", js.undefined)
    
    inline def setLabelSummaryProgressBarTemplate(value: String): Self = StObject.set(x, "labelSummaryProgressBarTemplate", value.asInstanceOf[js.Any])
    
    inline def setLabelSummaryProgressBarTemplateUndefined: Self = StObject.set(x, "labelSummaryProgressBarTemplate", js.undefined)
    
    inline def setLabelSummaryProgressButtonCancel(value: String): Self = StObject.set(x, "labelSummaryProgressButtonCancel", value.asInstanceOf[js.Any])
    
    inline def setLabelSummaryProgressButtonCancelUndefined: Self = StObject.set(x, "labelSummaryProgressButtonCancel", js.undefined)
    
    inline def setLabelSummaryProgressButtonContinue(value: String): Self = StObject.set(x, "labelSummaryProgressButtonContinue", value.asInstanceOf[js.Any])
    
    inline def setLabelSummaryProgressButtonContinueUndefined: Self = StObject.set(x, "labelSummaryProgressButtonContinue", js.undefined)
    
    inline def setLabelSummaryProgressButtonDone(value: String): Self = StObject.set(x, "labelSummaryProgressButtonDone", value.asInstanceOf[js.Any])
    
    inline def setLabelSummaryProgressButtonDoneUndefined: Self = StObject.set(x, "labelSummaryProgressButtonDone", js.undefined)
    
    inline def setLabelSummaryTemplate(value: String): Self = StObject.set(x, "labelSummaryTemplate", value.asInstanceOf[js.Any])
    
    inline def setLabelSummaryTemplateUndefined: Self = StObject.set(x, "labelSummaryTemplate", js.undefined)
    
    inline def setLabelUploadButton(value: String): Self = StObject.set(x, "labelUploadButton", value.asInstanceOf[js.Any])
    
    inline def setLabelUploadButtonUndefined: Self = StObject.set(x, "labelUploadButton", js.undefined)
    
    inline def setTitleAddFileButton(value: String): Self = StObject.set(x, "titleAddFileButton", value.asInstanceOf[js.Any])
    
    inline def setTitleAddFileButtonUndefined: Self = StObject.set(x, "titleAddFileButton", js.undefined)
    
    inline def setTitleCancelUploadButton(value: String): Self = StObject.set(x, "titleCancelUploadButton", value.asInstanceOf[js.Any])
    
    inline def setTitleCancelUploadButtonUndefined: Self = StObject.set(x, "titleCancelUploadButton", js.undefined)
    
    inline def setTitleClearAllButton(value: String): Self = StObject.set(x, "titleClearAllButton", value.asInstanceOf[js.Any])
    
    inline def setTitleClearAllButtonUndefined: Self = StObject.set(x, "titleClearAllButton", js.undefined)
    
    inline def setTitleClearUploaded(value: String): Self = StObject.set(x, "titleClearUploaded", value.asInstanceOf[js.Any])
    
    inline def setTitleClearUploadedUndefined: Self = StObject.set(x, "titleClearUploaded", js.undefined)
    
    inline def setTitleHideDetailsButton(value: String): Self = StObject.set(x, "titleHideDetailsButton", value.asInstanceOf[js.Any])
    
    inline def setTitleHideDetailsButtonUndefined: Self = StObject.set(x, "titleHideDetailsButton", js.undefined)
    
    inline def setTitleShowDetailsButton(value: String): Self = StObject.set(x, "titleShowDetailsButton", value.asInstanceOf[js.Any])
    
    inline def setTitleShowDetailsButtonUndefined: Self = StObject.set(x, "titleShowDetailsButton", js.undefined)
    
    inline def setTitleSingleUploadButtonContinue(value: String): Self = StObject.set(x, "titleSingleUploadButtonContinue", value.asInstanceOf[js.Any])
    
    inline def setTitleSingleUploadButtonContinueUndefined: Self = StObject.set(x, "titleSingleUploadButtonContinue", js.undefined)
    
    inline def setTitleSummaryProgressButtonCancel(value: String): Self = StObject.set(x, "titleSummaryProgressButtonCancel", value.asInstanceOf[js.Any])
    
    inline def setTitleSummaryProgressButtonCancelUndefined: Self = StObject.set(x, "titleSummaryProgressButtonCancel", js.undefined)
    
    inline def setTitleSummaryProgressButtonContinue(value: String): Self = StObject.set(x, "titleSummaryProgressButtonContinue", value.asInstanceOf[js.Any])
    
    inline def setTitleSummaryProgressButtonContinueUndefined: Self = StObject.set(x, "titleSummaryProgressButtonContinue", js.undefined)
    
    inline def setTitleSummaryProgressButtonDone(value: String): Self = StObject.set(x, "titleSummaryProgressButtonDone", value.asInstanceOf[js.Any])
    
    inline def setTitleSummaryProgressButtonDoneUndefined: Self = StObject.set(x, "titleSummaryProgressButtonDone", js.undefined)
    
    inline def setTitleUploadFileButtonInit(value: String): Self = StObject.set(x, "titleUploadFileButtonInit", value.asInstanceOf[js.Any])
    
    inline def setTitleUploadFileButtonInitUndefined: Self = StObject.set(x, "titleUploadFileButtonInit", js.undefined)
  }
}
