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
    complete: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    success: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IhideMenuItems = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("menuList")(menuList)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[IhideMenuItems]
  }
}

