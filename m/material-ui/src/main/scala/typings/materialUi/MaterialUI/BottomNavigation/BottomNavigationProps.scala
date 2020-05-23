package typings.materialUi.MaterialUI.BottomNavigation

import typings.react.mod.CSSProperties
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
  def apply(
    className: String = null,
    selectedIndex: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null
  ): BottomNavigationProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedIndex)) __obj.updateDynamic("selectedIndex")(selectedIndex.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomNavigationProps]
  }
}

