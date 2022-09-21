package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2SentimentAnalysisResult extends StObject {
  
  /**
    * The sentiment analysis result for `query_text`.
    */
  var queryTextSentiment: js.UndefOr[SchemaGoogleCloudDialogflowV2Sentiment] = js.undefined
}
object SchemaGoogleCloudDialogflowV2SentimentAnalysisResult {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2SentimentAnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2SentimentAnalysisResult]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2SentimentAnalysisResult](x: Self) {
    
    inline def setQueryTextSentiment(value: SchemaGoogleCloudDialogflowV2Sentiment): Self = StObject.set(x, "queryTextSentiment", value.asInstanceOf[js.Any])
    
    inline def setQueryTextSentimentUndefined: Self = StObject.set(x, "queryTextSentiment", js.undefined)
  }
}
