package typings.materialDashUi.__MaterialUI.BottomNavigation

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomNavigationProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var selectedIndex: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object BottomNavigationProps {
  @scala.inline
  def apply(className: String = null, selectedIndex: Int | Double = null, style: CSSProperties = null): BottomNavigationProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[BottomNavigationProps]
  }
}

