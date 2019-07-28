package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLoaderSettings extends js.Object {
  var autoDetectLocale: js.UndefOr[Boolean] = js.undefined
  var cssPath: String
  var locale: js.UndefOr[String] = js.undefined
  var localePath: js.UndefOr[String] = js.undefined
  var preinit: js.UndefOr[js.Function] = js.undefined
  var ready: js.UndefOr[js.Function] = js.undefined
  var regional: js.UndefOr[String] = js.undefined
  var resources: js.UndefOr[String] = js.undefined
  var scriptPath: String
  var theme: js.UndefOr[String] = js.undefined
}

object IgLoaderSettings {
  @scala.inline
  def apply(
    cssPath: String,
    scriptPath: String,
    autoDetectLocale: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    localePath: String = null,
    preinit: js.Function = null,
    ready: js.Function = null,
    regional: String = null,
    resources: String = null,
    theme: String = null
  ): IgLoaderSettings = {
    val __obj = js.Dynamic.literal(cssPath = cssPath, scriptPath = scriptPath)
    if (!js.isUndefined(autoDetectLocale)) __obj.updateDynamic("autoDetectLocale")(autoDetectLocale)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (localePath != null) __obj.updateDynamic("localePath")(localePath)
    if (preinit != null) __obj.updateDynamic("preinit")(preinit)
    if (ready != null) __obj.updateDynamic("ready")(ready)
    if (regional != null) __obj.updateDynamic("regional")(regional)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IgLoaderSettings]
  }
}

