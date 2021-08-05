package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabsEvents extends StObject {
  
  var activate: js.UndefOr[TabsEvent[TabsActivationUIParams]] = js.undefined
  
  var beforeActivate: js.UndefOr[TabsEvent[TabsActivationUIParams]] = js.undefined
  
  var beforeLoad: js.UndefOr[TabsEvent[TabsBeforeLoadUIParams]] = js.undefined
  
  var create: js.UndefOr[TabsEvent[TabsCreateOrLoadUIParams]] = js.undefined
  
  var load: js.UndefOr[TabsEvent[TabsCreateOrLoadUIParams]] = js.undefined
}
object TabsEvents {
  
  inline def apply(): TabsEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsEvents]
  }
  
  extension [Self <: TabsEvents](x: Self) {
    
    inline def setActivate(value: (/* event */ JQueryEventObject, TabsActivationUIParams) => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction2(value))
    
    inline def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    inline def setBeforeActivate(value: (/* event */ JQueryEventObject, TabsActivationUIParams) => Unit): Self = StObject.set(x, "beforeActivate", js.Any.fromFunction2(value))
    
    inline def setBeforeActivateUndefined: Self = StObject.set(x, "beforeActivate", js.undefined)
    
    inline def setBeforeLoad(value: (/* event */ JQueryEventObject, TabsBeforeLoadUIParams) => Unit): Self = StObject.set(x, "beforeLoad", js.Any.fromFunction2(value))
    
    inline def setBeforeLoadUndefined: Self = StObject.set(x, "beforeLoad", js.undefined)
    
    inline def setCreate(value: (/* event */ JQueryEventObject, TabsCreateOrLoadUIParams) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setLoad(value: (/* event */ JQueryEventObject, TabsCreateOrLoadUIParams) => Unit): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
  }
}
