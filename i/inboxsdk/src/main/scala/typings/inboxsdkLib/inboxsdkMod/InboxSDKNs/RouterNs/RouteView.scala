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
    getParams: js.Function0[RouteParams],
    getRouteID: js.Function0[java.lang.String],
    getRouteType: js.Function0[RouteTypes],
    on_destroy: js.Function2[inboxsdkLib.inboxsdkLibStrings.destroy, js.Function0[scala.Unit], scala.Unit]
  ): RouteView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed, getParams = getParams, getRouteID = getRouteID, getRouteType = getRouteType)
    __obj.updateDynamic("on")(on_destroy)
    __obj.asInstanceOf[RouteView]
  }
}

