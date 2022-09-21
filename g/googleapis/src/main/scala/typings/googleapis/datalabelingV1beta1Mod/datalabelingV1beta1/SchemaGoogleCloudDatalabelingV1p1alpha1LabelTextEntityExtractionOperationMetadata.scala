package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1p1alpha1LabelTextEntityExtractionOperationMetadata extends StObject {
  
  /**
    * Basic human annotation config used in labeling request.
    */
  var basicConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1p1alpha1HumanAnnotationConfig] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1p1alpha1LabelTextEntityExtractionOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1p1alpha1LabelTextEntityExtractionOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1p1alpha1LabelTextEntityExtractionOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1p1alpha1LabelTextEntityExtractionOperationMetadata](x: Self) {
    
    inline def setBasicConfig(value: SchemaGoogleCloudDatalabelingV1p1alpha1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    inline def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
  }
}
