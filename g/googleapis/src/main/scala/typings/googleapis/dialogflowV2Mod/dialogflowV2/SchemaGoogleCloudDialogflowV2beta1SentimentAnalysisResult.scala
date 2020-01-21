package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of sentiment analysis as configured by
  * `sentiment_analysis_request_config`.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisResult extends js.Object {
  /**
    * The sentiment analysis result for `query_text`.
    */
  var queryTextSentiment: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1Sentiment] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisResult {
  @scala.inline
  def apply(queryTextSentiment: SchemaGoogleCloudDialogflowV2beta1Sentiment = null): SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisResult = {
    val __obj = js.Dynamic.literal()
    if (queryTextSentiment != null) __obj.updateDynamic("queryTextSentiment")(queryTextSentiment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisResult]
  }
}

