package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1p2alpha1OutputConfig extends StObject {
  
  /** Output to a file in Cloud Storage. Should be used for labeling output other than image segmentation. */
  var gcsDestination: js.UndefOr[GoogleCloudDatalabelingV1p2alpha1GcsDestination] = js.native
  
  /** Output to a folder in Cloud Storage. Should be used for image segmentation or document de-identification labeling outputs. */
  var gcsFolderDestination: js.UndefOr[GoogleCloudDatalabelingV1p2alpha1GcsFolderDestination] = js.native
}
object GoogleCloudDatalabelingV1p2alpha1OutputConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1p2alpha1OutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1p2alpha1OutputConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1p2alpha1OutputConfigMutableBuilder[Self <: GoogleCloudDatalabelingV1p2alpha1OutputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcsDestination(value: GoogleCloudDatalabelingV1p2alpha1GcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
    
    @scala.inline
    def setGcsFolderDestination(value: GoogleCloudDatalabelingV1p2alpha1GcsFolderDestination): Self = StObject.set(x, "gcsFolderDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsFolderDestinationUndefined: Self = StObject.set(x, "gcsFolderDestination", js.undefined)
  }
}
