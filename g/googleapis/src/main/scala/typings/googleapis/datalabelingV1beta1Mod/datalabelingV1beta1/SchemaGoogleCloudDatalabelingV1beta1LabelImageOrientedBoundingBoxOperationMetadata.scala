package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1LabelImageOrientedBoundingBoxOperationMetadata extends StObject {
  
  /**
    * Basic human annotation config.
    */
  var basicConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1HumanAnnotationConfig] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1LabelImageOrientedBoundingBoxOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1LabelImageOrientedBoundingBoxOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1LabelImageOrientedBoundingBoxOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1LabelImageOrientedBoundingBoxOperationMetadata](x: Self) {
    
    inline def setBasicConfig(value: SchemaGoogleCloudDatalabelingV1beta1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    inline def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
  }
}
