package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1alpha1LabelImagePolylineOperationMetadata extends StObject {
  
  /**
    * Basic human annotation config used in labeling request.
    */
  var basicConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1alpha1HumanAnnotationConfig] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1alpha1LabelImagePolylineOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1alpha1LabelImagePolylineOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1alpha1LabelImagePolylineOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1alpha1LabelImagePolylineOperationMetadata](x: Self) {
    
    inline def setBasicConfig(value: SchemaGoogleCloudDatalabelingV1alpha1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    inline def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
  }
}
