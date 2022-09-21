package typings.hapiJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionFlag extends StObject {
  
  var default: js.UndefOr[Any] = js.undefined
  
  var setter: js.UndefOr[String] = js.undefined
}
object ExtensionFlag {
  
  inline def apply(): ExtensionFlag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionFlag]
  }
  
  extension [Self <: ExtensionFlag](x: Self) {
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setSetter(value: String): Self = StObject.set(x, "setter", value.asInstanceOf[js.Any])
    
    inline def setSetterUndefined: Self = StObject.set(x, "setter", js.undefined)
  }
}
