package typings.inboxsdk.inboxsdkMod.Router

import typings.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteView extends js.Object {
  var destroyed: Boolean
  def getParams(): RouteParams
  def getRouteID(): String
  def getRouteType(): RouteTypes
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
}

object RouteView {
  @scala.inline
  def apply(
    destroyed: Boolean,
    getParams: () => RouteParams,
    getRouteID: () => String,
    getRouteType: () => RouteTypes,
    on_destroy: (destroy, js.Function0[Unit]) => Unit
  ): RouteView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed, getParams = js.Any.fromFunction0(getParams), getRouteID = js.Any.fromFunction0(getRouteID), getRouteType = js.Any.fromFunction0(getRouteType))
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_destroy))
    __obj.asInstanceOf[RouteView]
  }
}

