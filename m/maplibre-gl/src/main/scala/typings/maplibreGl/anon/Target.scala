package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  var data: Any
  
  var target: Any
}
object Target {
  
  inline def apply(data: Any, target: Any): Target = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  extension [Self <: Target](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
