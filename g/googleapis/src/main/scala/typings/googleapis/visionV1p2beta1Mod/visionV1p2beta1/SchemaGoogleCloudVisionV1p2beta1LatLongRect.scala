package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rectangle determined by min and max `LatLng` pairs.
  */
trait SchemaGoogleCloudVisionV1p2beta1LatLongRect extends StObject {
  
  /**
    * Max lat/long pair.
    */
  var maxLatLng: js.UndefOr[SchemaLatLng] = js.undefined
  
  /**
    * Min lat/long pair.
    */
  var minLatLng: js.UndefOr[SchemaLatLng] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1LatLongRect {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1LatLongRect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1LatLongRect]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1LatLongRectMutableBuilder[Self <: SchemaGoogleCloudVisionV1p2beta1LatLongRect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxLatLng(value: SchemaLatLng): Self = StObject.set(x, "maxLatLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLatLngUndefined: Self = StObject.set(x, "maxLatLng", js.undefined)
    
    @scala.inline
    def setMinLatLng(value: SchemaLatLng): Self = StObject.set(x, "minLatLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLatLngUndefined: Self = StObject.set(x, "minLatLng", js.undefined)
  }
}
