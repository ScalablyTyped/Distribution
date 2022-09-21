package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ObjectDetectionMetrics extends StObject {
  
  /**
    * Precision-recall curve.
    */
  var prCurve: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1PrCurve] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ObjectDetectionMetrics {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ObjectDetectionMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ObjectDetectionMetrics]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ObjectDetectionMetrics](x: Self) {
    
    inline def setPrCurve(value: SchemaGoogleCloudDatalabelingV1beta1PrCurve): Self = StObject.set(x, "prCurve", value.asInstanceOf[js.Any])
    
    inline def setPrCurveUndefined: Self = StObject.set(x, "prCurve", js.undefined)
  }
}
