package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudRunRewrite extends StObject {
  
  /**
    * Optional. User-provided region where the Cloud Run service is hosted. Defaults to `us-central1` if not supplied.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. User-defined ID of the Cloud Run service.
    */
  var serviceId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCloudRunRewrite {
  
  inline def apply(): SchemaCloudRunRewrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudRunRewrite]
  }
  
  extension [Self <: SchemaCloudRunRewrite](x: Self) {
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdNull: Self = StObject.set(x, "serviceId", null)
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
  }
}
