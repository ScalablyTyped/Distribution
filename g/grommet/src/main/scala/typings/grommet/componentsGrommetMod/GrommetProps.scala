package typings.grommet.componentsGrommetMod

import typings.grommet.grommetStrings.dark
import typings.grommet.grommetStrings.light
import typings.grommet.themesBaseMod.ThemeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrommetProps extends js.Object {
  var cssVars: js.UndefOr[Boolean] = js.undefined
  var full: js.UndefOr[Boolean] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[ThemeType] = js.undefined
  var themeMode: js.UndefOr[dark | light] = js.undefined
  var userAgent: js.UndefOr[String] = js.undefined
}

object GrommetProps {
  @scala.inline
  def apply(
    cssVars: js.UndefOr[Boolean] = js.undefined,
    full: js.UndefOr[Boolean] = js.undefined,
    plain: js.UndefOr[Boolean] = js.undefined,
    theme: ThemeType = null,
    themeMode: dark | light = null,
    userAgent: String = null
  ): GrommetProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cssVars)) __obj.updateDynamic("cssVars")(cssVars)
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full)
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (themeMode != null) __obj.updateDynamic("themeMode")(themeMode.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    __obj.asInstanceOf[GrommetProps]
  }
}

