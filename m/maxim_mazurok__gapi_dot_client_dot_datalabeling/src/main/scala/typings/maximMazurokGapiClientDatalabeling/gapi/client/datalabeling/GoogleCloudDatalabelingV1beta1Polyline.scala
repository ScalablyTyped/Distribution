package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1Polyline extends js.Object {
  
  /** The polyline vertices. */
  var vertices: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1Vertex]] = js.native
}
object GoogleCloudDatalabelingV1beta1Polyline {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1Polyline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1Polyline]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1PolylineOps[Self <: GoogleCloudDatalabelingV1beta1Polyline] (val x: Self) extends AnyVal {
    
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
    def setVerticesVarargs(value: GoogleCloudDatalabelingV1beta1Vertex*): Self = this.set("vertices", js.Array(value :_*))
    
    @scala.inline
    def setVertices(value: js.Array[GoogleCloudDatalabelingV1beta1Vertex]): Self = this.set("vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertices: Self = this.set("vertices", js.undefined)
  }
}
