package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configures the types of sentiment analysis to perform.
  */
trait SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig extends StObject {
  
  /**
    * Optional. Instructs the service to perform sentiment analysis on
    * `query_text`. If not provided, sentiment analysis is not performed on
    * `query_text`.
    */
  var analyzeQueryTextSentiment: js.UndefOr[Boolean] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig](x: Self) {
    
    inline def setAnalyzeQueryTextSentiment(value: Boolean): Self = StObject.set(x, "analyzeQueryTextSentiment", value.asInstanceOf[js.Any])
    
    inline def setAnalyzeQueryTextSentimentUndefined: Self = StObject.set(x, "analyzeQueryTextSentiment", js.undefined)
  }
}
