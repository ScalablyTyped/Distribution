package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1SentimentAnalysisResult extends StObject {
  
  /** The sentiment analysis result for `query_text`. */
  var queryTextSentiment: js.UndefOr[GoogleCloudDialogflowV2beta1Sentiment] = js.undefined
}
object GoogleCloudDialogflowV2beta1SentimentAnalysisResult {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1SentimentAnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1SentimentAnalysisResult]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1SentimentAnalysisResultMutableBuilder[Self <: GoogleCloudDialogflowV2beta1SentimentAnalysisResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryTextSentiment(value: GoogleCloudDialogflowV2beta1Sentiment): Self = StObject.set(x, "queryTextSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryTextSentimentUndefined: Self = StObject.set(x, "queryTextSentiment", js.undefined)
  }
}
