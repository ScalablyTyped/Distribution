package typings.i18nextDashExpressDashMiddleware.i18nextDashExpressDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageDetectorAllOptions extends js.Object {
  var fallbackLng: Boolean | String | js.Array[String]
}

object LanguageDetectorAllOptions {
  @scala.inline
  def apply(fallbackLng: Boolean | String | js.Array[String]): LanguageDetectorAllOptions = {
    val __obj = js.Dynamic.literal(fallbackLng = fallbackLng.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LanguageDetectorAllOptions]
  }
}

