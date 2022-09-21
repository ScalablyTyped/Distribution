package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1BoundingPoly extends StObject {
  
  /**
    * The bounding polygon vertices.
    */
  var vertices: js.UndefOr[js.Array[SchemaGoogleCloudDatalabelingV1beta1Vertex]] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1BoundingPoly {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1BoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1BoundingPoly]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1BoundingPoly](x: Self) {
    
    inline def setVertices(value: js.Array[SchemaGoogleCloudDatalabelingV1beta1Vertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    inline def setVerticesVarargs(value: SchemaGoogleCloudDatalabelingV1beta1Vertex*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
