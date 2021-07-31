package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of sentiment analysis as configured by
  * `sentiment_analysis_request_config`.
  */
trait SchemaGoogleCloudDialogflowV2SentimentAnalysisResult extends StObject {
  
  /**
    * The sentiment analysis result for `query_text`.
    */
  var queryTextSentiment: js.UndefOr[SchemaGoogleCloudDialogflowV2Sentiment] = js.undefined
}
object SchemaGoogleCloudDialogflowV2SentimentAnalysisResult {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2SentimentAnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2SentimentAnalysisResult]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2SentimentAnalysisResultMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2SentimentAnalysisResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryTextSentiment(value: SchemaGoogleCloudDialogflowV2Sentiment): Self = StObject.set(x, "queryTextSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryTextSentimentUndefined: Self = StObject.set(x, "queryTextSentiment", js.undefined)
  }
}
