package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig extends StObject {
  
  /**
    * Instructs the service to perform sentiment analysis on `query_text`. If not provided, sentiment analysis is not performed on `query_text`.
    */
  var analyzeQueryTextSentiment: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig](x: Self) {
    
    inline def setAnalyzeQueryTextSentiment(value: Boolean): Self = StObject.set(x, "analyzeQueryTextSentiment", value.asInstanceOf[js.Any])
    
    inline def setAnalyzeQueryTextSentimentNull: Self = StObject.set(x, "analyzeQueryTextSentiment", null)
    
    inline def setAnalyzeQueryTextSentimentUndefined: Self = StObject.set(x, "analyzeQueryTextSentiment", js.undefined)
  }
}
