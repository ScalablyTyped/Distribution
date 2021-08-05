package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerOptions extends StObject {
  
  var autoBindInjectable: js.UndefOr[Boolean] = js.undefined
  
  var defaultScope: js.UndefOr[BindingScope] = js.undefined
  
  var skipBaseClassChecks: js.UndefOr[Boolean] = js.undefined
}
object ContainerOptions {
  
  inline def apply(): ContainerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerOptions]
  }
  
  extension [Self <: ContainerOptions](x: Self) {
    
    inline def setAutoBindInjectable(value: Boolean): Self = StObject.set(x, "autoBindInjectable", value.asInstanceOf[js.Any])
    
    inline def setAutoBindInjectableUndefined: Self = StObject.set(x, "autoBindInjectable", js.undefined)
    
    inline def setDefaultScope(value: BindingScope): Self = StObject.set(x, "defaultScope", value.asInstanceOf[js.Any])
    
    inline def setDefaultScopeUndefined: Self = StObject.set(x, "defaultScope", js.undefined)
    
    inline def setSkipBaseClassChecks(value: Boolean): Self = StObject.set(x, "skipBaseClassChecks", value.asInstanceOf[js.Any])
    
    inline def setSkipBaseClassChecksUndefined: Self = StObject.set(x, "skipBaseClassChecks", js.undefined)
  }
}
