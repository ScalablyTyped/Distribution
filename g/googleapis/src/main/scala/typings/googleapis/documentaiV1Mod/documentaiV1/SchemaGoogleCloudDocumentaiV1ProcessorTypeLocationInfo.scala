package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1ProcessorTypeLocationInfo extends StObject {
  
  /**
    * The location id, currently must be one of [us, eu].
    */
  var locationId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1ProcessorTypeLocationInfo {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1ProcessorTypeLocationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1ProcessorTypeLocationInfo]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1ProcessorTypeLocationInfo](x: Self) {
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdNull: Self = StObject.set(x, "locationId", null)
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
  }
}
