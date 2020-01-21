package typings.googleapis.translateV2Mod.translateV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for discovering supported languages.
  */
@js.native
trait SchemaGetSupportedLanguagesRequest extends js.Object {
  /**
    * The language to use to return localized, human readable names of
    * supported languages.
    */
  var target: js.UndefOr[String] = js.native
}

object SchemaGetSupportedLanguagesRequest {
  @scala.inline
  def apply(target: String = null): SchemaGetSupportedLanguagesRequest = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetSupportedLanguagesRequest]
  }
}

