package typings.igniteUi

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
    val __obj = js.Dynamic.literal(cssPath = cssPath.asInstanceOf[js.Any], scriptPath = scriptPath.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDetectLocale)) __obj.updateDynamic("autoDetectLocale")(autoDetectLocale.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localePath != null) __obj.updateDynamic("localePath")(localePath.asInstanceOf[js.Any])
    if (preinit != null) __obj.updateDynamic("preinit")(preinit.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(ready.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgLoaderSettings]
  }
}

