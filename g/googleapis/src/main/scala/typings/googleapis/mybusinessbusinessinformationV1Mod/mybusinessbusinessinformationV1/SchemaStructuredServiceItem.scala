package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStructuredServiceItem extends StObject {
  
  /**
    * Optional. Description of structured service item. The character limit is 300.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The `service_type_id` field is a Google provided unique ID that can be found in `ServiceType`. This information is provided by `BatchGetCategories` rpc service.
    */
  var serviceTypeId: js.UndefOr[String | Null] = js.undefined
}
object SchemaStructuredServiceItem {
  
  inline def apply(): SchemaStructuredServiceItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStructuredServiceItem]
  }
  
  extension [Self <: SchemaStructuredServiceItem](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setServiceTypeId(value: String): Self = StObject.set(x, "serviceTypeId", value.asInstanceOf[js.Any])
    
    inline def setServiceTypeIdNull: Self = StObject.set(x, "serviceTypeId", null)
    
    inline def setServiceTypeIdUndefined: Self = StObject.set(x, "serviceTypeId", js.undefined)
  }
}
