package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2SentimentAnalysisRequestConfig extends StObject {
  
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
  implicit class GoogleCloudDialogflowV2SentimentAnalysisRequestConfigMutableBuilder[Self <: GoogleCloudDialogflowV2SentimentAnalysisRequestConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzeQueryTextSentiment(value: Boolean): Self = StObject.set(x, "analyzeQueryTextSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyzeQueryTextSentimentUndefined: Self = StObject.set(x, "analyzeQueryTextSentiment", js.undefined)
  }
}
