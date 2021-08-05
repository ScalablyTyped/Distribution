package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters for web detection request.
  */
trait SchemaWebDetectionParams extends StObject {
  
  /**
    * Whether to include results derived from the geo information in the image.
    */
  var includeGeoResults: js.UndefOr[Boolean] = js.undefined
}
object SchemaWebDetectionParams {
  
  inline def apply(): SchemaWebDetectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebDetectionParams]
  }
  
  extension [Self <: SchemaWebDetectionParams](x: Self) {
    
    inline def setIncludeGeoResults(value: Boolean): Self = StObject.set(x, "includeGeoResults", value.asInstanceOf[js.Any])
    
    inline def setIncludeGeoResultsUndefined: Self = StObject.set(x, "includeGeoResults", js.undefined)
  }
}
