package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1p2alpha1LabelVideoEventOperationMetadata extends StObject {
  
  /** Basic human annotation config used in labeling request. */
  var basicConfig: js.UndefOr[GoogleCloudDatalabelingV1p2alpha1HumanAnnotationConfig] = js.native
}
object GoogleCloudDatalabelingV1p2alpha1LabelVideoEventOperationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1p2alpha1LabelVideoEventOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1p2alpha1LabelVideoEventOperationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1p2alpha1LabelVideoEventOperationMetadataMutableBuilder[Self <: GoogleCloudDatalabelingV1p2alpha1LabelVideoEventOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasicConfig(value: GoogleCloudDatalabelingV1p2alpha1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
  }
}
