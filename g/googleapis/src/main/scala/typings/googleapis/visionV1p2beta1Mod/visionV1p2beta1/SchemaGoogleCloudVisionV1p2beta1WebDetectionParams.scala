package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters for web detection request.
  */
trait SchemaGoogleCloudVisionV1p2beta1WebDetectionParams extends StObject {
  
  /**
    * Whether to include results derived from the geo information in the image.
    */
  var includeGeoResults: js.UndefOr[Boolean] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1WebDetectionParams {
  
  inline def apply(): SchemaGoogleCloudVisionV1p2beta1WebDetectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1WebDetectionParams]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p2beta1WebDetectionParams](x: Self) {
    
    inline def setIncludeGeoResults(value: Boolean): Self = StObject.set(x, "includeGeoResults", value.asInstanceOf[js.Any])
    
    inline def setIncludeGeoResultsUndefined: Self = StObject.set(x, "includeGeoResults", js.undefined)
  }
}
