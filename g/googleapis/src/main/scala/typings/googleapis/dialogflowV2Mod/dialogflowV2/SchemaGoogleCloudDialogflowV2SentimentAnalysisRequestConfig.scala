package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configures the types of sentiment analysis to perform.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig extends StObject {
  
  /**
    * Optional. Instructs the service to perform sentiment analysis on
    * `query_text`. If not provided, sentiment analysis is not performed on
    * `query_text`.
    */
  var analyzeQueryTextSentiment: js.UndefOr[Boolean] = js.native
}
object SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfigMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzeQueryTextSentiment(value: Boolean): Self = StObject.set(x, "analyzeQueryTextSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyzeQueryTextSentimentUndefined: Self = StObject.set(x, "analyzeQueryTextSentiment", js.undefined)
  }
}
