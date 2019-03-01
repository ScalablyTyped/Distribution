package typings
package grommetDashIconsLib.iconsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends js.Object {
  var a11yTitle: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[
    grommetDashIconsLib.grommetDashIconsLibStrings.small | grommetDashIconsLib.grommetDashIconsLibStrings.medium | grommetDashIconsLib.grommetDashIconsLibStrings.large | grommetDashIconsLib.grommetDashIconsLibStrings.xlarge | java.lang.String
  ] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    a11yTitle: java.lang.String = null,
    color: java.lang.String = null,
    size: grommetDashIconsLib.grommetDashIconsLibStrings.small | grommetDashIconsLib.grommetDashIconsLibStrings.medium | grommetDashIconsLib.grommetDashIconsLibStrings.large | grommetDashIconsLib.grommetDashIconsLibStrings.xlarge | java.lang.String = null
  ): IconProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (color != null) __obj.updateDynamic("color")(color)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}

