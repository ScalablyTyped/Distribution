package typings.i18next.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Services extends js.Object {
  var backendConnector: js.Any = js.native
  var i18nFormat: js.Any = js.native
  var interpolator: Interpolator = js.native
  var languageDetector: js.Any = js.native
  var languageUtils: js.Any = js.native
  var logger: js.Any = js.native
  var pluralResolver: js.Any = js.native
  var resourceStore: ResourceStore = js.native
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
    resourceStore: ResourceStore
  ): Services = {
    val __obj = js.Dynamic.literal(backendConnector = backendConnector.asInstanceOf[js.Any], i18nFormat = i18nFormat.asInstanceOf[js.Any], interpolator = interpolator.asInstanceOf[js.Any], languageDetector = languageDetector.asInstanceOf[js.Any], languageUtils = languageUtils.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], pluralResolver = pluralResolver.asInstanceOf[js.Any], resourceStore = resourceStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Services]
  }
  @scala.inline
  implicit class ServicesOps[Self <: Services] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackendConnector(value: js.Any): Self = this.set("backendConnector", value.asInstanceOf[js.Any])
    @scala.inline
    def setI18nFormat(value: js.Any): Self = this.set("i18nFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterpolator(value: Interpolator): Self = this.set("interpolator", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguageDetector(value: js.Any): Self = this.set("languageDetector", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguageUtils(value: js.Any): Self = this.set("languageUtils", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogger(value: js.Any): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def setPluralResolver(value: js.Any): Self = this.set("pluralResolver", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceStore(value: ResourceStore): Self = this.set("resourceStore", value.asInstanceOf[js.Any])
  }
  
}

