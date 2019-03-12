package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteView extends js.Object {
  var destroyed: scala.Boolean
  def getParams(): RouteParams
  def getRouteID(): java.lang.String
  def getRouteType(): RouteTypes
  @JSName("on")
  def on_destroy(name: inboxsdkLib.inboxsdkLibStrings.destroy, cb: js.Function0[scala.Unit]): scala.Unit
}

object RouteView {
  @scala.inline
  def apply(
    destroyed: scala.Boolean,
    getParams: () => RouteParams,
    getRouteID: () => java.lang.String,
    getRouteType: () => RouteTypes,
    on_destroy: (inboxsdkLib.inboxsdkLibStrings.destroy, js.Function0[scala.Unit]) => scala.Unit
  ): RouteView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed, getParams = js.Any.fromFunction0(getParams), getRouteID = js.Any.fromFunction0(getRouteID), getRouteType = js.Any.fromFunction0(getRouteType))
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_destroy))
    __obj.asInstanceOf[RouteView]
  }
}

