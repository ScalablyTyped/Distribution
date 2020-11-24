package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ConfusionMatrix extends js.Object {
  
  var row: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1Row]] = js.native
}
object GoogleCloudDatalabelingV1beta1ConfusionMatrix {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ConfusionMatrix]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ConfusionMatrixOps[Self <: GoogleCloudDatalabelingV1beta1ConfusionMatrix] (val x: Self) extends AnyVal {
    
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
    def setRowVarargs(value: GoogleCloudDatalabelingV1beta1Row*): Self = this.set("row", js.Array(value :_*))
    
    @scala.inline
    def setRow(value: js.Array[GoogleCloudDatalabelingV1beta1Row]): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
  }
}
