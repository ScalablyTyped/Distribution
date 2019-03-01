package typings
package i18nextDashExpressDashMiddlewareLib.I18nextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nextOptions
  extends i18nextDashExpressDashMiddlewareLib.i18nextExpressMiddlewareNs.I18nextOptions

object I18nextOptions {
  @scala.inline
  def apply(
    detection: i18nextDashExpressDashMiddlewareLib.i18nextExpressMiddlewareNs.LanguageDetectorOptions = null
  ): I18nextOptions = {
    val __obj = js.Dynamic.literal()
    if (detection != null) __obj.updateDynamic("detection")(detection)
    __obj.asInstanceOf[I18nextOptions]
  }
}

