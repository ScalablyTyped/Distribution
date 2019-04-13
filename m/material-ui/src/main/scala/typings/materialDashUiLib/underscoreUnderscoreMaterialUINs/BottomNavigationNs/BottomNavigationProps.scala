package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.BottomNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomNavigationProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var selectedIndex: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object BottomNavigationProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    selectedIndex: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null
  ): BottomNavigationProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[BottomNavigationProps]
  }
}

