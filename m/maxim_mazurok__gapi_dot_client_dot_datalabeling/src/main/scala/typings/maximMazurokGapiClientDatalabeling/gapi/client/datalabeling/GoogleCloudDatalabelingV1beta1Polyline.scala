package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1Polyline extends StObject {
  
  /** The polyline vertices. */
  var vertices: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1Vertex]] = js.undefined
}
object GoogleCloudDatalabelingV1beta1Polyline {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1Polyline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1Polyline]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1PolylineMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1Polyline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVertices(value: js.Array[GoogleCloudDatalabelingV1beta1Vertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    @scala.inline
    def setVerticesVarargs(value: GoogleCloudDatalabelingV1beta1Vertex*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
