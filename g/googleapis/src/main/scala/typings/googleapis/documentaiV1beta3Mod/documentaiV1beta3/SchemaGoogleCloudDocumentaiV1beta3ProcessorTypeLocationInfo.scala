package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3ProcessorTypeLocationInfo extends StObject {
  
  /**
    * The location id, currently must be one of [us, eu].
    */
  var locationId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3ProcessorTypeLocationInfo {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3ProcessorTypeLocationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3ProcessorTypeLocationInfo]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3ProcessorTypeLocationInfo](x: Self) {
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdNull: Self = StObject.set(x, "locationId", null)
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
  }
}
