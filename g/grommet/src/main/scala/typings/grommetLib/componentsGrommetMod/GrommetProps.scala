package typings
package grommetLib.componentsGrommetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrommetProps extends js.Object {
  var cssVars: js.UndefOr[scala.Boolean] = js.undefined
  var full: js.UndefOr[scala.Boolean] = js.undefined
  var plain: js.UndefOr[scala.Boolean] = js.undefined
  var theme: js.UndefOr[js.Object] = js.undefined
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
}

object GrommetProps {
  @scala.inline
  def apply(
    cssVars: js.UndefOr[scala.Boolean] = js.undefined,
    full: js.UndefOr[scala.Boolean] = js.undefined,
    plain: js.UndefOr[scala.Boolean] = js.undefined,
    theme: js.Object = null,
    userAgent: java.lang.String = null
  ): GrommetProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cssVars)) __obj.updateDynamic("cssVars")(cssVars)
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full)
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    __obj.asInstanceOf[GrommetProps]
  }
}

