package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IhideMenuItems extends BaseParams {
  var menuList: js.Array[menuProtected | menuShare]
}

object IhideMenuItems {
  @scala.inline
  def apply(
    menuList: js.Array[menuProtected | menuShare],
    complete: /* repeated */ js.Any => scala.Unit = null,
    fail: /* repeated */ js.Any => scala.Unit = null,
    success: /* repeated */ js.Any => scala.Unit = null
  ): IhideMenuItems = {
    val __obj = js.Dynamic.literal(menuList = menuList)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[IhideMenuItems]
  }
}

