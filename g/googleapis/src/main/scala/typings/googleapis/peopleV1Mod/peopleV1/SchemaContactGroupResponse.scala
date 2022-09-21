package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContactGroupResponse extends StObject {
  
  /**
    * The contact group.
    */
  var contactGroup: js.UndefOr[SchemaContactGroup] = js.undefined
  
  /**
    * The original requested resource name.
    */
  var requestedResourceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status of the response.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
}
object SchemaContactGroupResponse {
  
  inline def apply(): SchemaContactGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContactGroupResponse]
  }
  
  extension [Self <: SchemaContactGroupResponse](x: Self) {
    
    inline def setContactGroup(value: SchemaContactGroup): Self = StObject.set(x, "contactGroup", value.asInstanceOf[js.Any])
    
    inline def setContactGroupUndefined: Self = StObject.set(x, "contactGroup", js.undefined)
    
    inline def setRequestedResourceName(value: String): Self = StObject.set(x, "requestedResourceName", value.asInstanceOf[js.Any])
    
    inline def setRequestedResourceNameNull: Self = StObject.set(x, "requestedResourceName", null)
    
    inline def setRequestedResourceNameUndefined: Self = StObject.set(x, "requestedResourceName", js.undefined)
    
    inline def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
