package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleApiServiceusageV1Service extends StObject {
  
  /**
    * The service configuration of the available service. Some fields may be filtered out of the configuration in responses to the `ListServices` method. These fields are present only in responses to the `GetService` method.
    */
  var config: js.UndefOr[SchemaGoogleApiServiceusageV1ServiceConfig] = js.undefined
  
  /**
    * The resource name of the consumer and service. A valid name would be: - projects/123/services/serviceusage.googleapis.com
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the consumer. A valid name would be: - projects/123
    */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether or not the service has been enabled for use by the consumer.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleApiServiceusageV1Service {
  
  inline def apply(): SchemaGoogleApiServiceusageV1Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleApiServiceusageV1Service]
  }
  
  extension [Self <: SchemaGoogleApiServiceusageV1Service](x: Self) {
    
    inline def setConfig(value: SchemaGoogleApiServiceusageV1ServiceConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
