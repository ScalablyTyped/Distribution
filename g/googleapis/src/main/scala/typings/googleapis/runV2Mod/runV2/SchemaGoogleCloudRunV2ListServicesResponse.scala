package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRunV2ListServicesResponse extends StObject {
  
  /**
    * A token indicating there are more items than page_size. Use it in the next ListServices request to continue.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resulting list of Services.
    */
  var services: js.UndefOr[js.Array[SchemaGoogleCloudRunV2Service]] = js.undefined
}
object SchemaGoogleCloudRunV2ListServicesResponse {
  
  inline def apply(): SchemaGoogleCloudRunV2ListServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRunV2ListServicesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRunV2ListServicesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setServices(value: js.Array[SchemaGoogleCloudRunV2Service]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: SchemaGoogleCloudRunV2Service*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
