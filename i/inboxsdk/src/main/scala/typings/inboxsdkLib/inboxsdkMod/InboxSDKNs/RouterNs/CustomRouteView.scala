package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomRouteView extends RouteView {
  def getElement(): stdLib.HTMLElement
  def setFullWidth(fullWidth: scala.Boolean): scala.Unit
}

object CustomRouteView {
  @scala.inline
  def apply(
    destroyed: scala.Boolean,
    getElement: () => stdLib.HTMLElement,
    getParams: () => RouteParams,
    getRouteID: () => java.lang.String,
    getRouteType: () => RouteTypes,
    on_destroy: (inboxsdkLib.inboxsdkLibStrings.destroy, js.Function0[scala.Unit]) => scala.Unit,
    setFullWidth: scala.Boolean => scala.Unit
  ): CustomRouteView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed, getElement = js.Any.fromFunction0(getElement), getParams = js.Any.fromFunction0(getParams), getRouteID = js.Any.fromFunction0(getRouteID), getRouteType = js.Any.fromFunction0(getRouteType), setFullWidth = js.Any.fromFunction1(setFullWidth))
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_destroy))
    __obj.asInstanceOf[CustomRouteView]
  }
}

