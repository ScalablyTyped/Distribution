package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyImage
  extends StObject
     with DataTextureImage {
  
  var data: Null
  
  var height: Double
  
  var width: Double
}
object EmptyImage {
  
  inline def apply(data: Null, height: Double, width: Double): EmptyImage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyImage]
  }
  
  extension [Self <: EmptyImage](x: Self) {
    
    inline def setData(value: Null): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
