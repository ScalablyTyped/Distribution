package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ClassificationMetadata extends StObject {
  
  /**
    * Whether the classification task is multi-label or not.
    */
  var isMultiLabel: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ClassificationMetadata {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ClassificationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ClassificationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ClassificationMetadata](x: Self) {
    
    inline def setIsMultiLabel(value: Boolean): Self = StObject.set(x, "isMultiLabel", value.asInstanceOf[js.Any])
    
    inline def setIsMultiLabelNull: Self = StObject.set(x, "isMultiLabel", null)
    
    inline def setIsMultiLabelUndefined: Self = StObject.set(x, "isMultiLabel", js.undefined)
  }
}
