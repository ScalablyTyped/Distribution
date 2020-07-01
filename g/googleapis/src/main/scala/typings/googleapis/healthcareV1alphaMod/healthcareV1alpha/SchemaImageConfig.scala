package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies how de-identification of image pixel should be handled.
  */
@js.native
trait SchemaImageConfig extends js.Object {
  /**
    * If true, all text found in the image is redacted.
    */
  var redactAllText: js.UndefOr[Boolean] = js.native
}

object SchemaImageConfig {
  @scala.inline
  def apply(redactAllText: js.UndefOr[Boolean] = js.undefined): SchemaImageConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(redactAllText)) __obj.updateDynamic("redactAllText")(redactAllText.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImageConfig]
  }
}

