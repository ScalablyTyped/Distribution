package typings.knockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options_ extends js.Object {
  
  var createChildContextWithAs: Boolean = js.native
  
  var deferUpdates: Boolean = js.native
  
  var foreachHidesDestroyed: Boolean = js.native
  
  var useOnlyNativeEvents: Boolean = js.native
}
object Options_ {
  
  @scala.inline
  def apply(
    createChildContextWithAs: Boolean,
    deferUpdates: Boolean,
    foreachHidesDestroyed: Boolean,
    useOnlyNativeEvents: Boolean
  ): Options_ = {
    val __obj = js.Dynamic.literal(createChildContextWithAs = createChildContextWithAs.asInstanceOf[js.Any], deferUpdates = deferUpdates.asInstanceOf[js.Any], foreachHidesDestroyed = foreachHidesDestroyed.asInstanceOf[js.Any], useOnlyNativeEvents = useOnlyNativeEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options_]
  }
  
  @scala.inline
  implicit class Options_Ops[Self <: Options_] (val x: Self) extends AnyVal {
    
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
    def setCreateChildContextWithAs(value: Boolean): Self = this.set("createChildContextWithAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUpdates(value: Boolean): Self = this.set("deferUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeachHidesDestroyed(value: Boolean): Self = this.set("foreachHidesDestroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseOnlyNativeEvents(value: Boolean): Self = this.set("useOnlyNativeEvents", value.asInstanceOf[js.Any])
  }
}
