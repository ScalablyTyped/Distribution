package typings
package i18nextLib.i18nextMod.i18nextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Services extends js.Object {
  var backendConnector: js.Any
  var i18nFormat: js.Any
  var interpolator: js.Any
  var languageDetector: js.Any
  var languageUtils: js.Any
  var logger: js.Any
  var pluralResolver: js.Any
  var resourceStore: Resource
}

object Services {
  @scala.inline
  def apply(
    backendConnector: js.Any,
    i18nFormat: js.Any,
    interpolator: js.Any,
    languageDetector: js.Any,
    languageUtils: js.Any,
    logger: js.Any,
    pluralResolver: js.Any,
    resourceStore: Resource
  ): Services = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backendConnector")(backendConnector)
    __obj.updateDynamic("i18nFormat")(i18nFormat)
    __obj.updateDynamic("interpolator")(interpolator)
    __obj.updateDynamic("languageDetector")(languageDetector)
    __obj.updateDynamic("languageUtils")(languageUtils)
    __obj.updateDynamic("logger")(logger)
    __obj.updateDynamic("pluralResolver")(pluralResolver)
    __obj.updateDynamic("resourceStore")(resourceStore)
    __obj.asInstanceOf[Services]
  }
}

