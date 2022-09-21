package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1alpha1OutputConfig extends StObject {
  
  /**
    * Output to a file in Cloud Storage. Should be used for labeling output other than image segmentation.
    */
  var gcsDestination: js.UndefOr[SchemaGoogleCloudDatalabelingV1alpha1GcsDestination] = js.undefined
  
  /**
    * Output to a folder in Cloud Storage. Should be used for image segmentation or document de-identification labeling outputs.
    */
  var gcsFolderDestination: js.UndefOr[SchemaGoogleCloudDatalabelingV1alpha1GcsFolderDestination] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1alpha1OutputConfig {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1alpha1OutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1alpha1OutputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1alpha1OutputConfig](x: Self) {
    
    inline def setGcsDestination(value: SchemaGoogleCloudDatalabelingV1alpha1GcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
    
    inline def setGcsFolderDestination(value: SchemaGoogleCloudDatalabelingV1alpha1GcsFolderDestination): Self = StObject.set(x, "gcsFolderDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsFolderDestinationUndefined: Self = StObject.set(x, "gcsFolderDestination", js.undefined)
  }
}
