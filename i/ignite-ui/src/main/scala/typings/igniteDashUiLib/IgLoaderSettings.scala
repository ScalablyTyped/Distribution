package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLoaderSettings extends js.Object {
  var autoDetectLocale: js.UndefOr[scala.Boolean] = js.undefined
  var cssPath: java.lang.String
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var localePath: js.UndefOr[java.lang.String] = js.undefined
  var preinit: js.UndefOr[js.Function] = js.undefined
  var ready: js.UndefOr[js.Function] = js.undefined
  var regional: js.UndefOr[java.lang.String] = js.undefined
  var resources: js.UndefOr[java.lang.String] = js.undefined
  var scriptPath: java.lang.String
  var theme: js.UndefOr[java.lang.String] = js.undefined
}

object IgLoaderSettings {
  @scala.inline
  def apply(
    cssPath: java.lang.String,
    scriptPath: java.lang.String,
    autoDetectLocale: js.UndefOr[scala.Boolean] = js.undefined,
    locale: java.lang.String = null,
    localePath: java.lang.String = null,
    preinit: js.Function = null,
    ready: js.Function = null,
    regional: java.lang.String = null,
    resources: java.lang.String = null,
    theme: java.lang.String = null
  ): IgLoaderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cssPath")(cssPath)
    __obj.updateDynamic("scriptPath")(scriptPath)
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

