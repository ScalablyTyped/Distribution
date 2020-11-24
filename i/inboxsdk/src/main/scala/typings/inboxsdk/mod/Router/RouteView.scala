package typings.inboxsdk.mod.Router

import typings.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteView extends js.Object {
  
  var destroyed: Boolean = js.native
  
  def getParams(): RouteParams = js.native
  
  def getRouteID(): String = js.native
  
  def getRouteType(): RouteTypes = js.native
  
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
}
object RouteView {
  
  @scala.inline
  def apply(
    destroyed: Boolean,
    getParams: () => RouteParams,
    getRouteID: () => String,
    getRouteType: () => RouteTypes,
    on: (destroy, js.Function0[Unit]) => Unit
  ): RouteView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any], getParams = js.Any.fromFunction0(getParams), getRouteID = js.Any.fromFunction0(getRouteID), getRouteType = js.Any.fromFunction0(getRouteType), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[RouteView]
  }
  
  @scala.inline
  implicit class RouteViewOps[Self <: RouteView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestroyed(value: Boolean): Self = this.set("destroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetParams(value: () => RouteParams): Self = this.set("getParams", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRouteID(value: () => String): Self = this.set("getRouteID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRouteType(value: () => RouteTypes): Self = this.set("getRouteType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOn(value: (destroy, js.Function0[Unit]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
  }
}
