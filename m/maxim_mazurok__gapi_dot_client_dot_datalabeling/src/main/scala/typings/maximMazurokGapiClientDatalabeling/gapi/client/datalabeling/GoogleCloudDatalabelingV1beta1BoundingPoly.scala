package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1BoundingPoly extends StObject {
  
  /** The bounding polygon vertices. */
  var vertices: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1Vertex]] = js.undefined
}
object GoogleCloudDatalabelingV1beta1BoundingPoly {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1BoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1BoundingPoly]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1BoundingPoly](x: Self) {
    
    inline def setVertices(value: js.Array[GoogleCloudDatalabelingV1beta1Vertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    inline def setVerticesVarargs(value: GoogleCloudDatalabelingV1beta1Vertex*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
