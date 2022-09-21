package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1AnnotationMetadata extends StObject {
  
  /**
    * Metadata related to human labeling.
    */
  var operatorMetadata: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1OperatorMetadata] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1AnnotationMetadata {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1AnnotationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1AnnotationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1AnnotationMetadata](x: Self) {
    
    inline def setOperatorMetadata(value: SchemaGoogleCloudDatalabelingV1beta1OperatorMetadata): Self = StObject.set(x, "operatorMetadata", value.asInstanceOf[js.Any])
    
    inline def setOperatorMetadataUndefined: Self = StObject.set(x, "operatorMetadata", js.undefined)
  }
}
