package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1LabelImageBoundingBoxOperationMetadata extends StObject {
  
  /**
    * Basic human annotation config used in labeling request.
    */
  var basicConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1HumanAnnotationConfig] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1LabelImageBoundingBoxOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1LabelImageBoundingBoxOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1LabelImageBoundingBoxOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1LabelImageBoundingBoxOperationMetadata](x: Self) {
    
    inline def setBasicConfig(value: SchemaGoogleCloudDatalabelingV1beta1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    inline def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
  }
}
