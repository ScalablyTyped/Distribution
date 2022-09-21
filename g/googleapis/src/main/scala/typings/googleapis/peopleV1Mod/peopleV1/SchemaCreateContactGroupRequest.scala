package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateContactGroupRequest extends StObject {
  
  /**
    * Required. The contact group to create.
    */
  var contactGroup: js.UndefOr[SchemaContactGroup] = js.undefined
  
  /**
    * Optional. A field mask to restrict which fields on the group are returned. Defaults to `metadata`, `groupType`, and `name` if not set or set to empty. Valid fields are: * clientData * groupType * metadata * name
    */
  var readGroupFields: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateContactGroupRequest {
  
  inline def apply(): SchemaCreateContactGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateContactGroupRequest]
  }
  
  extension [Self <: SchemaCreateContactGroupRequest](x: Self) {
    
    inline def setContactGroup(value: SchemaContactGroup): Self = StObject.set(x, "contactGroup", value.asInstanceOf[js.Any])
    
    inline def setContactGroupUndefined: Self = StObject.set(x, "contactGroup", js.undefined)
    
    inline def setReadGroupFields(value: String): Self = StObject.set(x, "readGroupFields", value.asInstanceOf[js.Any])
    
    inline def setReadGroupFieldsNull: Self = StObject.set(x, "readGroupFields", null)
    
    inline def setReadGroupFieldsUndefined: Self = StObject.set(x, "readGroupFields", js.undefined)
  }
}
