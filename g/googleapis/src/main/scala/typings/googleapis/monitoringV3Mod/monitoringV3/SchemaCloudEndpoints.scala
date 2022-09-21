package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudEndpoints extends StObject {
  
  /**
    * The name of the Cloud Endpoints service underlying this service. Corresponds to the service resource label in the api monitored resource (https://cloud.google.com/monitoring/api/resources#tag_api).
    */
  var service: js.UndefOr[String | Null] = js.undefined
}
object SchemaCloudEndpoints {
  
  inline def apply(): SchemaCloudEndpoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudEndpoints]
  }
  
  extension [Self <: SchemaCloudEndpoints](x: Self) {
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
