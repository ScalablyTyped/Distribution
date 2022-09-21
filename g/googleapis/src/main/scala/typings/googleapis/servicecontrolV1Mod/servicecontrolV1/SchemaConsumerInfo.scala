package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConsumerInfo extends StObject {
  
  /**
    * The consumer identity number, can be Google cloud project number, folder number or organization number e.g. 1234567890. A value of 0 indicates no consumer number is found.
    */
  var consumerNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Google cloud project number, e.g. 1234567890. A value of 0 indicates no project number is found. NOTE: This field is deprecated after Chemist support flexible consumer id. New code should not depend on this field anymore.
    */
  var projectNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the consumer which should have been defined in [Google Resource Manager](https://cloud.google.com/resource-manager/).
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaConsumerInfo {
  
  inline def apply(): SchemaConsumerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConsumerInfo]
  }
  
  extension [Self <: SchemaConsumerInfo](x: Self) {
    
    inline def setConsumerNumber(value: String): Self = StObject.set(x, "consumerNumber", value.asInstanceOf[js.Any])
    
    inline def setConsumerNumberNull: Self = StObject.set(x, "consumerNumber", null)
    
    inline def setConsumerNumberUndefined: Self = StObject.set(x, "consumerNumber", js.undefined)
    
    inline def setProjectNumber(value: String): Self = StObject.set(x, "projectNumber", value.asInstanceOf[js.Any])
    
    inline def setProjectNumberNull: Self = StObject.set(x, "projectNumber", null)
    
    inline def setProjectNumberUndefined: Self = StObject.set(x, "projectNumber", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
