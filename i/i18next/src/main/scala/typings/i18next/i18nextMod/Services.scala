package typings.i18next.i18nextMod

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
    val __obj = js.Dynamic.literal(backendConnector = backendConnector, i18nFormat = i18nFormat, interpolator = interpolator, languageDetector = languageDetector, languageUtils = languageUtils, logger = logger, pluralResolver = pluralResolver, resourceStore = resourceStore)
  
    __obj.asInstanceOf[Services]
  }
}

