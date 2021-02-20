package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ClassificationMetadata extends StObject {
  
  /** Whether the classification task is multi-label or not. */
  var isMultiLabel: js.UndefOr[Boolean] = js.native
}
object GoogleCloudDatalabelingV1beta1ClassificationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ClassificationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ClassificationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ClassificationMetadataMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ClassificationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsMultiLabel(value: Boolean): Self = StObject.set(x, "isMultiLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMultiLabelUndefined: Self = StObject.set(x, "isMultiLabel", js.undefined)
  }
}
