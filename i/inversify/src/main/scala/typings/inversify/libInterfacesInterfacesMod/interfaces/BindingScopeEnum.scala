package typings.inversify.libInterfacesInterfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingScopeEnum extends StObject {
  
  var Request: BindingScope
  
  var Singleton: BindingScope
  
  var Transient: BindingScope
}
object BindingScopeEnum {
  
  inline def apply(Request: BindingScope, Singleton: BindingScope, Transient: BindingScope): BindingScopeEnum = {
    val __obj = js.Dynamic.literal(Request = Request.asInstanceOf[js.Any], Singleton = Singleton.asInstanceOf[js.Any], Transient = Transient.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingScopeEnum]
  }
  
  extension [Self <: BindingScopeEnum](x: Self) {
    
    inline def setRequest(value: BindingScope): Self = StObject.set(x, "Request", value.asInstanceOf[js.Any])
    
    inline def setSingleton(value: BindingScope): Self = StObject.set(x, "Singleton", value.asInstanceOf[js.Any])
    
    inline def setTransient(value: BindingScope): Self = StObject.set(x, "Transient", value.asInstanceOf[js.Any])
  }
}
