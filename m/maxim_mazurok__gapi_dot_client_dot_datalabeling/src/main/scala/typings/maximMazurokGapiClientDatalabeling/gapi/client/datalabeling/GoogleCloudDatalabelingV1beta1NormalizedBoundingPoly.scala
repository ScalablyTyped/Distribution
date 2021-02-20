package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1NormalizedBoundingPoly extends StObject {
  
  /** The bounding polygon normalized vertices. */
  var normalizedVertices: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1NormalizedVertex]] = js.native
}
object GoogleCloudDatalabelingV1beta1NormalizedBoundingPoly {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1NormalizedBoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1NormalizedBoundingPoly]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1NormalizedBoundingPolyMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1NormalizedBoundingPoly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNormalizedVertices(value: js.Array[GoogleCloudDatalabelingV1beta1NormalizedVertex]): Self = StObject.set(x, "normalizedVertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedVerticesUndefined: Self = StObject.set(x, "normalizedVertices", js.undefined)
    
    @scala.inline
    def setNormalizedVerticesVarargs(value: GoogleCloudDatalabelingV1beta1NormalizedVertex*): Self = StObject.set(x, "normalizedVertices", js.Array(value :_*))
  }
}
