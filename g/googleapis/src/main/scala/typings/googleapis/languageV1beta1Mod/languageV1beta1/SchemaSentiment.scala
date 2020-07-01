package typings.googleapis.languageV1beta1Mod.languageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the feeling associated with the entire text or entities in the
  * text.
  */
@js.native
trait SchemaSentiment extends js.Object {
  /**
    * A non-negative number in the [0, +inf) range, which represents the
    * absolute magnitude of sentiment regardless of score (positive or
    * negative).
    */
  var magnitude: js.UndefOr[Double] = js.native
  /**
    * DEPRECATED FIELD - This field is being deprecated in favor of score.
    * Please refer to our documentation at
    * https://cloud.google.com/natural-language/docs for more information.
    */
  var polarity: js.UndefOr[Double] = js.native
  /**
    * Sentiment score between -1.0 (negative sentiment) and 1.0 (positive
    * sentiment).
    */
  var score: js.UndefOr[Double] = js.native
}

object SchemaSentiment {
  @scala.inline
  def apply(
    magnitude: js.UndefOr[Double] = js.undefined,
    polarity: js.UndefOr[Double] = js.undefined,
    score: js.UndefOr[Double] = js.undefined
  ): SchemaSentiment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(magnitude)) __obj.updateDynamic("magnitude")(magnitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(polarity)) __obj.updateDynamic("polarity")(polarity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSentiment]
  }
}

