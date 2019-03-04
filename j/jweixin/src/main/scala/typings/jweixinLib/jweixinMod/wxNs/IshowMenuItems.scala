package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IshowMenuItems extends BaseParams {
  var menuList: menuList
}

object IshowMenuItems {
  @scala.inline
  def apply(
    menuList: menuList,
    complete: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    success: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IshowMenuItems = {
    val __obj = js.Dynamic.literal(menuList = menuList)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[IshowMenuItems]
  }
}

