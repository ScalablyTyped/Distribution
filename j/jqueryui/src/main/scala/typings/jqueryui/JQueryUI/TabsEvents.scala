package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsEvents extends js.Object {
  
  var activate: js.UndefOr[TabsEvent[TabsActivationUIParams]] = js.native
  
  var beforeActivate: js.UndefOr[TabsEvent[TabsActivationUIParams]] = js.native
  
  var beforeLoad: js.UndefOr[TabsEvent[TabsBeforeLoadUIParams]] = js.native
  
  var create: js.UndefOr[TabsEvent[TabsCreateOrLoadUIParams]] = js.native
  
  var load: js.UndefOr[TabsEvent[TabsCreateOrLoadUIParams]] = js.native
}
object TabsEvents {
  
  @scala.inline
  def apply(): TabsEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsEvents]
  }
  
  @scala.inline
  implicit class TabsEventsOps[Self <: TabsEvents] (val x: Self) extends AnyVal {
    
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
    def setActivate(value: (/* event */ JQueryEventObject, TabsActivationUIParams) => Unit): Self = this.set("activate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteActivate: Self = this.set("activate", js.undefined)
    
    @scala.inline
    def setBeforeActivate(value: (/* event */ JQueryEventObject, TabsActivationUIParams) => Unit): Self = this.set("beforeActivate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeActivate: Self = this.set("beforeActivate", js.undefined)
    
    @scala.inline
    def setBeforeLoad(value: (/* event */ JQueryEventObject, TabsBeforeLoadUIParams) => Unit): Self = this.set("beforeLoad", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeLoad: Self = this.set("beforeLoad", js.undefined)
    
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, TabsCreateOrLoadUIParams) => Unit): Self = this.set("create", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setLoad(value: (/* event */ JQueryEventObject, TabsCreateOrLoadUIParams) => Unit): Self = this.set("load", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
  }
}
