package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2SentimentAnalysisResult extends StObject {
  
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
  implicit class GoogleCloudDialogflowV2SentimentAnalysisResultMutableBuilder[Self <: GoogleCloudDialogflowV2SentimentAnalysisResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryTextSentiment(value: GoogleCloudDialogflowV2Sentiment): Self = StObject.set(x, "queryTextSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryTextSentimentUndefined: Self = StObject.set(x, "queryTextSentiment", js.undefined)
  }
}
