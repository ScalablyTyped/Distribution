package typings.jointjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseModelGeometryBoolean extends StObject {
  
  var useModelGeometry: Boolean
}
object UseModelGeometryBoolean {
  
  inline def apply(useModelGeometry: Boolean): UseModelGeometryBoolean = {
    val __obj = js.Dynamic.literal(useModelGeometry = useModelGeometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseModelGeometryBoolean]
  }
  
  extension [Self <: UseModelGeometryBoolean](x: Self) {
    
    inline def setUseModelGeometry(value: Boolean): Self = StObject.set(x, "useModelGeometry", value.asInstanceOf[js.Any])
  }
}
