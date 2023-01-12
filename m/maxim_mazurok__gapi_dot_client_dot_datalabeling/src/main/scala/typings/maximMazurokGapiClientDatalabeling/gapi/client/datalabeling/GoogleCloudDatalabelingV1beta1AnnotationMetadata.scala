package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1AnnotationMetadata extends StObject {
  
  /** Metadata related to human labeling. */
  var operatorMetadata: js.UndefOr[GoogleCloudDatalabelingV1beta1OperatorMetadata] = js.undefined
}
object GoogleCloudDatalabelingV1beta1AnnotationMetadata {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1AnnotationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1AnnotationMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatalabelingV1beta1AnnotationMetadata] (val x: Self) extends AnyVal {
    
    inline def setOperatorMetadata(value: GoogleCloudDatalabelingV1beta1OperatorMetadata): Self = StObject.set(x, "operatorMetadata", value.asInstanceOf[js.Any])
    
    inline def setOperatorMetadataUndefined: Self = StObject.set(x, "operatorMetadata", js.undefined)
  }
}
