package typings.grommet.grommetMod

import typings.grommet.baseMod.ThemeType
import typings.grommet.grommetStrings.dark
import typings.grommet.grommetStrings.light
import typings.grommet.grommetStrings.rtl
import typings.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrommetProps extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var cssVars: js.UndefOr[Boolean] = js.undefined
  var dir: js.UndefOr[rtl] = js.undefined
  var full: js.UndefOr[Boolean] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[ThemeType] = js.undefined
  var themeMode: js.UndefOr[dark | light] = js.undefined
  var userAgent: js.UndefOr[String] = js.undefined
}

object GrommetProps {
  @scala.inline
  def apply(
    background: BackgroundType = null,
    cssVars: js.UndefOr[Boolean] = js.undefined,
    dir: rtl = null,
    full: js.UndefOr[Boolean] = js.undefined,
    plain: js.UndefOr[Boolean] = js.undefined,
    theme: ThemeType = null,
    themeMode: dark | light = null,
    userAgent: String = null
  ): GrommetProps = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(cssVars)) __obj.updateDynamic("cssVars")(cssVars.get.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full.get.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (themeMode != null) __obj.updateDynamic("themeMode")(themeMode.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrommetProps]
  }
}

