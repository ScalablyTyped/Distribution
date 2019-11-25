package typings.i18next.i18nextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Services extends js.Object {
  var backendConnector: js.Any
  var i18nFormat: js.Any
  var interpolator: Interpolator
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
    interpolator: Interpolator,
    languageDetector: js.Any,
    languageUtils: js.Any,
    logger: js.Any,
    pluralResolver: js.Any,
    resourceStore: Resource
  ): Services = {
    val __obj = js.Dynamic.literal(backendConnector = backendConnector.asInstanceOf[js.Any], i18nFormat = i18nFormat.asInstanceOf[js.Any], interpolator = interpolator.asInstanceOf[js.Any], languageDetector = languageDetector.asInstanceOf[js.Any], languageUtils = languageUtils.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], pluralResolver = pluralResolver.asInstanceOf[js.Any], resourceStore = resourceStore.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Services]
  }
}

