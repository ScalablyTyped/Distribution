package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of sentiment analysis as configured by
  * `sentiment_analysis_request_config`.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2SentimentAnalysisResult extends js.Object {
  
  /**
    * The sentiment analysis result for `query_text`.
    */
  var queryTextSentiment: js.UndefOr[SchemaGoogleCloudDialogflowV2Sentiment] = js.native
}
object SchemaGoogleCloudDialogflowV2SentimentAnalysisResult {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2SentimentAnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2SentimentAnalysisResult]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2SentimentAnalysisResultOps[Self <: SchemaGoogleCloudDialogflowV2SentimentAnalysisResult] (val x: Self) extends AnyVal {
    
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
    def setQueryTextSentiment(value: SchemaGoogleCloudDialogflowV2Sentiment): Self = this.set("queryTextSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryTextSentiment: Self = this.set("queryTextSentiment", js.undefined)
  }
}
