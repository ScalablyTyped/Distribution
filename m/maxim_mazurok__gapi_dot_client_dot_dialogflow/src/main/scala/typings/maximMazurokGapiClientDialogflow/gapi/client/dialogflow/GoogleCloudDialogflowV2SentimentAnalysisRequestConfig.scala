package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2SentimentAnalysisRequestConfig extends js.Object {
  
  /** Instructs the service to perform sentiment analysis on `query_text`. If not provided, sentiment analysis is not performed on `query_text`. */
  var analyzeQueryTextSentiment: js.UndefOr[Boolean] = js.native
}
object GoogleCloudDialogflowV2SentimentAnalysisRequestConfig {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2SentimentAnalysisRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2SentimentAnalysisRequestConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2SentimentAnalysisRequestConfigOps[Self <: GoogleCloudDialogflowV2SentimentAnalysisRequestConfig] (val x: Self) extends AnyVal {
    
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
    def setAnalyzeQueryTextSentiment(value: Boolean): Self = this.set("analyzeQueryTextSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyzeQueryTextSentiment: Self = this.set("analyzeQueryTextSentiment", js.undefined)
  }
}
