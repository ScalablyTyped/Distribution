package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1NormalizedPolyline extends StObject {
  
  /** The normalized polyline vertices. */
  var normalizedVertices: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1NormalizedVertex]] = js.undefined
}
object GoogleCloudDatalabelingV1beta1NormalizedPolyline {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1NormalizedPolyline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1NormalizedPolyline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatalabelingV1beta1NormalizedPolyline] (val x: Self) extends AnyVal {
    
    inline def setNormalizedVertices(value: js.Array[GoogleCloudDatalabelingV1beta1NormalizedVertex]): Self = StObject.set(x, "normalizedVertices", value.asInstanceOf[js.Any])
    
    inline def setNormalizedVerticesUndefined: Self = StObject.set(x, "normalizedVertices", js.undefined)
    
    inline def setNormalizedVerticesVarargs(value: GoogleCloudDatalabelingV1beta1NormalizedVertex*): Self = StObject.set(x, "normalizedVertices", js.Array(value*))
  }
}
