package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters for web detection request.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1WebDetectionParams extends StObject {
  
  /**
    * Whether to include results derived from the geo information in the image.
    */
  var includeGeoResults: js.UndefOr[Boolean] = js.native
}
object SchemaGoogleCloudVisionV1p1beta1WebDetectionParams {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1WebDetectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1WebDetectionParams]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1WebDetectionParamsMutableBuilder[Self <: SchemaGoogleCloudVisionV1p1beta1WebDetectionParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeGeoResults(value: Boolean): Self = StObject.set(x, "includeGeoResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeGeoResultsUndefined: Self = StObject.set(x, "includeGeoResults", js.undefined)
  }
}
