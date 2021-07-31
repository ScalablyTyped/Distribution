package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ConfusionMatrix extends StObject {
  
  var row: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1Row]] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ConfusionMatrix {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ConfusionMatrix]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ConfusionMatrixMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ConfusionMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRow(value: js.Array[GoogleCloudDatalabelingV1beta1Row]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    @scala.inline
    def setRowVarargs(value: GoogleCloudDatalabelingV1beta1Row*): Self = StObject.set(x, "row", js.Array(value :_*))
  }
}
