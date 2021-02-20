package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configures the types of sentiment analysis to perform.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig extends StObject {
  
  /**
    * Optional. Instructs the service to perform sentiment analysis on
    * `query_text`. If not provided, sentiment analysis is not performed on
    * `query_text`.
    */
  var analyzeQueryTextSentiment: js.UndefOr[Boolean] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfigMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzeQueryTextSentiment(value: Boolean): Self = StObject.set(x, "analyzeQueryTextSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyzeQueryTextSentimentUndefined: Self = StObject.set(x, "analyzeQueryTextSentiment", js.undefined)
  }
}
