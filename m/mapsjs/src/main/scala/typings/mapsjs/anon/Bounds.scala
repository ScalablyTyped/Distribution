package typings.mapsjs.anon

import typings.mapsjs.mod.envelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bounds extends StObject {
  
  var Bounds: js.Array[envelope]
  
  var Shapes: js.Array[Any]
  
  var Values: js.Array[Any]
}
object Bounds {
  
  inline def apply(Bounds: js.Array[envelope], Shapes: js.Array[Any], Values: js.Array[Any]): Bounds = {
    val __obj = js.Dynamic.literal(Bounds = Bounds.asInstanceOf[js.Any], Shapes = Shapes.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
  
  extension [Self <: Bounds](x: Self) {
    
    inline def setBounds(value: js.Array[envelope]): Self = StObject.set(x, "Bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsVarargs(value: envelope*): Self = StObject.set(x, "Bounds", js.Array(value*))
    
    inline def setShapes(value: js.Array[Any]): Self = StObject.set(x, "Shapes", value.asInstanceOf[js.Any])
    
    inline def setShapesVarargs(value: Any*): Self = StObject.set(x, "Shapes", js.Array(value*))
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
