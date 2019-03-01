package typings
package i18nextDashExpressDashMiddlewareLib.i18nextExpressMiddlewareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary i18next options.
  * @interface
  */
trait I18nextOptions extends js.Object {
  var detection: js.UndefOr[LanguageDetectorOptions] = js.undefined
}

object I18nextOptions {
  @scala.inline
  def apply(detection: LanguageDetectorOptions = null): I18nextOptions = {
    val __obj = js.Dynamic.literal()
    if (detection != null) __obj.updateDynamic("detection")(detection)
    __obj.asInstanceOf[I18nextOptions]
  }
}

