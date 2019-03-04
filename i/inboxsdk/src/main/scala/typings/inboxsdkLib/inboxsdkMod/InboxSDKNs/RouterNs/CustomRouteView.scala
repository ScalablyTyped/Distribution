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
    getElement: js.Function0[stdLib.HTMLElement],
    getParams: js.Function0[RouteParams],
    getRouteID: js.Function0[java.lang.String],
    getRouteType: js.Function0[RouteTypes],
    on_destroy: js.Function2[inboxsdkLib.inboxsdkLibStrings.destroy, js.Function0[scala.Unit], scala.Unit],
    setFullWidth: js.Function1[scala.Boolean, scala.Unit]
  ): CustomRouteView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed, getElement = getElement, getParams = getParams, getRouteID = getRouteID, getRouteType = getRouteType, setFullWidth = setFullWidth)
    __obj.updateDynamic("on")(on_destroy)
    __obj.asInstanceOf[CustomRouteView]
  }
}

