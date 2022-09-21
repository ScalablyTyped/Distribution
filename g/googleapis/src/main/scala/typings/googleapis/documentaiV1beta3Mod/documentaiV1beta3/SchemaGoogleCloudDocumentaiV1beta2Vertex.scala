package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta2Vertex extends StObject {
  
  /**
    * X coordinate.
    */
  var x: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Y coordinate (starts from the top of the image).
    */
  var y: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta2Vertex {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta2Vertex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta2Vertex]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta2Vertex](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXNull: Self = StObject.set(x, "x", null)
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYNull: Self = StObject.set(x, "y", null)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
