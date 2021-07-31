package typings.mapsjs.anon

import typings.mapsjs.mod.envelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bounds extends StObject {
  
  var Bounds: js.Array[envelope]
  
  var Shapes: js.Array[js.Any]
  
  var Values: js.Array[js.Any]
}
object Bounds {
  
  @scala.inline
  def apply(Bounds: js.Array[envelope], Shapes: js.Array[js.Any], Values: js.Array[js.Any]): Bounds = {
    val __obj = js.Dynamic.literal(Bounds = Bounds.asInstanceOf[js.Any], Shapes = Shapes.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
  
  @scala.inline
  implicit class BoundsMutableBuilder[Self <: Bounds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: js.Array[envelope]): Self = StObject.set(x, "Bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsVarargs(value: envelope*): Self = StObject.set(x, "Bounds", js.Array(value :_*))
    
    @scala.inline
    def setShapes(value: js.Array[js.Any]): Self = StObject.set(x, "Shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapesVarargs(value: js.Any*): Self = StObject.set(x, "Shapes", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
