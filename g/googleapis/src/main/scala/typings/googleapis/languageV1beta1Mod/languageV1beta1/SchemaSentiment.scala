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
  def apply(magnitude: Int | Double = null, polarity: Int | Double = null, score: Int | Double = null): SchemaSentiment = {
    val __obj = js.Dynamic.literal()
    if (magnitude != null) __obj.updateDynamic("magnitude")(magnitude.asInstanceOf[js.Any])
    if (polarity != null) __obj.updateDynamic("polarity")(polarity.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSentiment]
  }
}

