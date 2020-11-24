package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1NormalizedPolyline extends js.Object {
  
  /** The normalized polyline vertices. */
  var normalizedVertices: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1NormalizedVertex]] = js.native
}
object GoogleCloudDatalabelingV1beta1NormalizedPolyline {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1NormalizedPolyline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1NormalizedPolyline]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1NormalizedPolylineOps[Self <: GoogleCloudDatalabelingV1beta1NormalizedPolyline] (val x: Self) extends AnyVal {
    
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
