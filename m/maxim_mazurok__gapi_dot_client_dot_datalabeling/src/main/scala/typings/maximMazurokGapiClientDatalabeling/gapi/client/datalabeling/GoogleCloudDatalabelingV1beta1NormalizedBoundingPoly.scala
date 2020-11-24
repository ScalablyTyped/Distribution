package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1NormalizedBoundingPoly extends js.Object {
  
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
  implicit class GoogleCloudDatalabelingV1beta1NormalizedBoundingPolyOps[Self <: GoogleCloudDatalabelingV1beta1NormalizedBoundingPoly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNormalizedVerticesVarargs(value: GoogleCloudDatalabelingV1beta1NormalizedVertex*): Self = this.set("normalizedVertices", js.Array(value :_*))
    
    @scala.inline
    def setNormalizedVertices(value: js.Array[GoogleCloudDatalabelingV1beta1NormalizedVertex]): Self = this.set("normalizedVertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizedVertices: Self = this.set("normalizedVertices", js.undefined)
  }
}
