package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2SentimentAnalysisRequestConfig extends StObject {
  
  /** Instructs the service to perform sentiment analysis on `query_text`. If not provided, sentiment analysis is not performed on `query_text`. */
  var analyzeQueryTextSentiment: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudDialogflowV2SentimentAnalysisRequestConfig {
  
  inline def apply(): GoogleCloudDialogflowV2SentimentAnalysisRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2SentimentAnalysisRequestConfig]
  }
  
  extension [Self <: GoogleCloudDialogflowV2SentimentAnalysisRequestConfig](x: Self) {
    
    inline def setAnalyzeQueryTextSentiment(value: Boolean): Self = StObject.set(x, "analyzeQueryTextSentiment", value.asInstanceOf[js.Any])
    
    inline def setAnalyzeQueryTextSentimentUndefined: Self = StObject.set(x, "analyzeQueryTextSentiment", js.undefined)
  }
}
