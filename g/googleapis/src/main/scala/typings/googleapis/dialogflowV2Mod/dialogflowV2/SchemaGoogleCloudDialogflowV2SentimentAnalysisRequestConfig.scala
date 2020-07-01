package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures the types of sentiment analysis to perform.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig extends js.Object {
  /**
    * Optional. Instructs the service to perform sentiment analysis on
    * `query_text`. If not provided, sentiment analysis is not performed on
    * `query_text`.
    */
  var analyzeQueryTextSentiment: js.UndefOr[Boolean] = js.native
}

object SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig {
  @scala.inline
  def apply(analyzeQueryTextSentiment: js.UndefOr[Boolean] = js.undefined): SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(analyzeQueryTextSentiment)) __obj.updateDynamic("analyzeQueryTextSentiment")(analyzeQueryTextSentiment.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig]
  }
}

