package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2SentimentAnalysisResult extends js.Object {
  
  /** The sentiment analysis result for `query_text`. */
  var queryTextSentiment: js.UndefOr[GoogleCloudDialogflowV2Sentiment] = js.native
}
object GoogleCloudDialogflowV2SentimentAnalysisResult {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2SentimentAnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2SentimentAnalysisResult]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2SentimentAnalysisResultOps[Self <: GoogleCloudDialogflowV2SentimentAnalysisResult] (val x: Self) extends AnyVal {
    
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
    def setQueryTextSentiment(value: GoogleCloudDialogflowV2Sentiment): Self = this.set("queryTextSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryTextSentiment: Self = this.set("queryTextSentiment", js.undefined)
  }
}
