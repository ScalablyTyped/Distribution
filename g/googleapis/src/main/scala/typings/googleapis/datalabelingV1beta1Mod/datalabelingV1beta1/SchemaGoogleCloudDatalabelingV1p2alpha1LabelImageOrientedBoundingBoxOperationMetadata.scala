package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1p2alpha1LabelImageOrientedBoundingBoxOperationMetadata extends StObject {
  
  /**
    * Basic human annotation config.
    */
  var basicConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1p2alpha1HumanAnnotationConfig] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1p2alpha1LabelImageOrientedBoundingBoxOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1p2alpha1LabelImageOrientedBoundingBoxOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1p2alpha1LabelImageOrientedBoundingBoxOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1p2alpha1LabelImageOrientedBoundingBoxOperationMetadata](x: Self) {
    
    inline def setBasicConfig(value: SchemaGoogleCloudDatalabelingV1p2alpha1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    inline def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
  }
}
