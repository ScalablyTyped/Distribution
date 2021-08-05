package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ClassificationMetadata extends StObject {
  
  /** Whether the classification task is multi-label or not. */
  var isMultiLabel: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ClassificationMetadata {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1ClassificationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ClassificationMetadata]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1ClassificationMetadata](x: Self) {
    
    inline def setIsMultiLabel(value: Boolean): Self = StObject.set(x, "isMultiLabel", value.asInstanceOf[js.Any])
    
    inline def setIsMultiLabelUndefined: Self = StObject.set(x, "isMultiLabel", js.undefined)
  }
}
