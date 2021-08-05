package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2SentimentAnalysisResult extends StObject {
  
  /** The sentiment analysis result for `query_text`. */
  var queryTextSentiment: js.UndefOr[GoogleCloudDialogflowV2Sentiment] = js.undefined
}
object GoogleCloudDialogflowV2SentimentAnalysisResult {
  
  inline def apply(): GoogleCloudDialogflowV2SentimentAnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2SentimentAnalysisResult]
  }
  
  extension [Self <: GoogleCloudDialogflowV2SentimentAnalysisResult](x: Self) {
    
    inline def setQueryTextSentiment(value: GoogleCloudDialogflowV2Sentiment): Self = StObject.set(x, "queryTextSentiment", value.asInstanceOf[js.Any])
    
    inline def setQueryTextSentimentUndefined: Self = StObject.set(x, "queryTextSentiment", js.undefined)
  }
}
