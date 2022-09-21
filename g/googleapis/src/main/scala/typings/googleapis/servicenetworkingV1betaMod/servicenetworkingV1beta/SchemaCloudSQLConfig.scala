package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudSQLConfig extends StObject {
  
  /**
    * Peering service used for peering with the Cloud SQL project.
    */
  var service: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the umbrella network in the Cloud SQL umbrella project.
    */
  var umbrellaNetwork: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The project number of the Cloud SQL umbrella project.
    */
  var umbrellaProject: js.UndefOr[String | Null] = js.undefined
}
object SchemaCloudSQLConfig {
  
  inline def apply(): SchemaCloudSQLConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudSQLConfig]
  }
  
  extension [Self <: SchemaCloudSQLConfig](x: Self) {
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setUmbrellaNetwork(value: String): Self = StObject.set(x, "umbrellaNetwork", value.asInstanceOf[js.Any])
    
    inline def setUmbrellaNetworkNull: Self = StObject.set(x, "umbrellaNetwork", null)
    
    inline def setUmbrellaNetworkUndefined: Self = StObject.set(x, "umbrellaNetwork", js.undefined)
    
    inline def setUmbrellaProject(value: String): Self = StObject.set(x, "umbrellaProject", value.asInstanceOf[js.Any])
    
    inline def setUmbrellaProjectNull: Self = StObject.set(x, "umbrellaProject", null)
    
    inline def setUmbrellaProjectUndefined: Self = StObject.set(x, "umbrellaProject", js.undefined)
  }
}
