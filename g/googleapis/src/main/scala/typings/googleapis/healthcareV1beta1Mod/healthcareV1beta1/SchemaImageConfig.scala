package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies how de-identification of image pixel should be handled.
  */
@js.native
trait SchemaImageConfig extends js.Object {
  /**
    * Determines how to redact text from image.
    */
  var textRedactionMode: js.UndefOr[String] = js.native
}

object SchemaImageConfig {
  @scala.inline
  def apply(textRedactionMode: String = null): SchemaImageConfig = {
    val __obj = js.Dynamic.literal()
    if (textRedactionMode != null) __obj.updateDynamic("textRedactionMode")(textRedactionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImageConfig]
  }
}

