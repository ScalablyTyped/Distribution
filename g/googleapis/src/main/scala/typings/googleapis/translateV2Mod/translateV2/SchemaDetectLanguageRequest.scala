package typings.googleapis.translateV2Mod.translateV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for language detection.
  */
@js.native
trait SchemaDetectLanguageRequest extends js.Object {
  /**
    * The input text upon which to perform language detection. Repeat this
    * parameter to perform language detection on multiple text inputs.
    */
  var q: js.UndefOr[js.Array[String]] = js.native
}

object SchemaDetectLanguageRequest {
  @scala.inline
  def apply(q: js.Array[String] = null): SchemaDetectLanguageRequest = {
    val __obj = js.Dynamic.literal()
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDetectLanguageRequest]
  }
}

