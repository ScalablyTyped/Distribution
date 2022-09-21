package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPersonMetadata extends StObject {
  
  /**
    * Output only. True if the person resource has been deleted. Populated only for `people.connections.list` and `otherContacts.list` sync requests.
    */
  var deleted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Resource names of people linked to this resource.
    */
  var linkedPeopleResourceNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. **DEPRECATED** (Please use `person.metadata.sources.profileMetadata.objectType` instead) The type of the person object.
    */
  var objectType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Any former resource names this person has had. Populated only for `people.connections.list` requests that include a sync token. The resource name may change when adding or removing fields that link a contact and profile such as a verified email, verified phone number, or profile URL.
    */
  var previousResourceNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The sources of data for the person.
    */
  var sources: js.UndefOr[js.Array[SchemaSource]] = js.undefined
}
object SchemaPersonMetadata {
  
  inline def apply(): SchemaPersonMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPersonMetadata]
  }
  
  extension [Self <: SchemaPersonMetadata](x: Self) {
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedNull: Self = StObject.set(x, "deleted", null)
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setLinkedPeopleResourceNames(value: js.Array[String]): Self = StObject.set(x, "linkedPeopleResourceNames", value.asInstanceOf[js.Any])
    
    inline def setLinkedPeopleResourceNamesNull: Self = StObject.set(x, "linkedPeopleResourceNames", null)
    
    inline def setLinkedPeopleResourceNamesUndefined: Self = StObject.set(x, "linkedPeopleResourceNames", js.undefined)
    
    inline def setLinkedPeopleResourceNamesVarargs(value: String*): Self = StObject.set(x, "linkedPeopleResourceNames", js.Array(value*))
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeNull: Self = StObject.set(x, "objectType", null)
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    inline def setPreviousResourceNames(value: js.Array[String]): Self = StObject.set(x, "previousResourceNames", value.asInstanceOf[js.Any])
    
    inline def setPreviousResourceNamesNull: Self = StObject.set(x, "previousResourceNames", null)
    
    inline def setPreviousResourceNamesUndefined: Self = StObject.set(x, "previousResourceNames", js.undefined)
    
    inline def setPreviousResourceNamesVarargs(value: String*): Self = StObject.set(x, "previousResourceNames", js.Array(value*))
    
    inline def setSources(value: js.Array[SchemaSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: SchemaSource*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
