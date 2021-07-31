package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1NormalizedVertex extends StObject {
  
  /** X coordinate. */
  var x: js.UndefOr[Double] = js.undefined
  
  /** Y coordinate. */
  var y: js.UndefOr[Double] = js.undefined
}
object GoogleCloudDatalabelingV1beta1NormalizedVertex {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1NormalizedVertex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1NormalizedVertex]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1NormalizedVertexMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1NormalizedVertex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
