package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p2beta1Vertex extends StObject {
  
  /**
    * X coordinate.
    */
  var x: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Y coordinate.
    */
  var y: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1Vertex {
  
  inline def apply(): SchemaGoogleCloudVisionV1p2beta1Vertex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1Vertex]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p2beta1Vertex](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXNull: Self = StObject.set(x, "x", null)
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYNull: Self = StObject.set(x, "y", null)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
