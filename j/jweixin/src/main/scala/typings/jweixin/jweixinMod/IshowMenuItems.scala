package typings.jweixin.jweixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IshowMenuItems extends BaseParams {
  var menuList: typings.jweixin.jweixinMod.menuList
}

object IshowMenuItems {
  @scala.inline
  def apply(
    menuList: menuList,
    complete: /* repeated */ js.Any => Unit = null,
    fail: /* repeated */ js.Any => Unit = null,
    success: /* repeated */ js.Any => Unit = null
  ): IshowMenuItems = {
    val __obj = js.Dynamic.literal(menuList = menuList)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[IshowMenuItems]
  }
}

