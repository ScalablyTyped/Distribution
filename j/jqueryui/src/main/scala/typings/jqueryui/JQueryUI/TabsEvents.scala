package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsEvents extends StObject {
  
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
  implicit class TabsEventsMutableBuilder[Self <: TabsEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: (/* event */ JQueryEventObject, TabsActivationUIParams) => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    @scala.inline
    def setBeforeActivate(value: (/* event */ JQueryEventObject, TabsActivationUIParams) => Unit): Self = StObject.set(x, "beforeActivate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeActivateUndefined: Self = StObject.set(x, "beforeActivate", js.undefined)
    
    @scala.inline
    def setBeforeLoad(value: (/* event */ JQueryEventObject, TabsBeforeLoadUIParams) => Unit): Self = StObject.set(x, "beforeLoad", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeLoadUndefined: Self = StObject.set(x, "beforeLoad", js.undefined)
    
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, TabsCreateOrLoadUIParams) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setLoad(value: (/* event */ JQueryEventObject, TabsCreateOrLoadUIParams) => Unit): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
  }
}
