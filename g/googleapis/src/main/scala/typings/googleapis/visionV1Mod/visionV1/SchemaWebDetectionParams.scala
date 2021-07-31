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
  
  @scala.inline
  def apply(): SchemaWebDetectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebDetectionParams]
  }
  
  @scala.inline
  implicit class SchemaWebDetectionParamsMutableBuilder[Self <: SchemaWebDetectionParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeGeoResults(value: Boolean): Self = StObject.set(x, "includeGeoResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeGeoResultsUndefined: Self = StObject.set(x, "includeGeoResults", js.undefined)
  }
}
