package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detected entity location information.
  */
trait SchemaGoogleCloudVisionV1p4beta1LocationInfo extends StObject {
  
  /**
    * lat/long location coordinates.
    */
  var latLng: js.UndefOr[SchemaLatLng] = js.undefined
}
object SchemaGoogleCloudVisionV1p4beta1LocationInfo {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1LocationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1LocationInfo]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1LocationInfoMutableBuilder[Self <: SchemaGoogleCloudVisionV1p4beta1LocationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatLng(value: SchemaLatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
  }
}
