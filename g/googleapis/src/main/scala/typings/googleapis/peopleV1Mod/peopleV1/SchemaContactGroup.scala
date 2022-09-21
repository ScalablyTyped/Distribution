package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContactGroup extends StObject {
  
  /**
    * The group's client data.
    */
  var clientData: js.UndefOr[js.Array[SchemaGroupClientData]] = js.undefined
  
  /**
    * The [HTTP entity tag](https://en.wikipedia.org/wiki/HTTP_ETag) of the resource. Used for web cache validation.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name translated and formatted in the viewer's account locale or the `Accept-Language` HTTP header locale for system groups names. Group names set by the owner are the same as name.
    */
  var formattedName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The contact group type.
    */
  var groupType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The total number of contacts in the group irrespective of max members in specified in the request.
    */
  var memberCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. The list of contact person resource names that are members of the contact group. The field is only populated for GET requests and will only return as many members as `maxMembers` in the get request.
    */
  var memberResourceNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. Metadata about the contact group.
    */
  var metadata: js.UndefOr[SchemaContactGroupMetadata] = js.undefined
  
  /**
    * The contact group name set by the group owner or a system provided name for system groups. For [`contactGroups.create`](/people/api/rest/v1/contactGroups/create) or [`contactGroups.update`](/people/api/rest/v1/contactGroups/update) the name must be unique to the users contact groups. Attempting to create a group with a duplicate name will return a HTTP 409 error.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name for the contact group, assigned by the server. An ASCII string, in the form of `contactGroups/{contact_group_id\}`.
    */
  var resourceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaContactGroup {
  
  inline def apply(): SchemaContactGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContactGroup]
  }
  
  extension [Self <: SchemaContactGroup](x: Self) {
    
    inline def setClientData(value: js.Array[SchemaGroupClientData]): Self = StObject.set(x, "clientData", value.asInstanceOf[js.Any])
    
    inline def setClientDataUndefined: Self = StObject.set(x, "clientData", js.undefined)
    
    inline def setClientDataVarargs(value: SchemaGroupClientData*): Self = StObject.set(x, "clientData", js.Array(value*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setFormattedName(value: String): Self = StObject.set(x, "formattedName", value.asInstanceOf[js.Any])
    
    inline def setFormattedNameNull: Self = StObject.set(x, "formattedName", null)
    
    inline def setFormattedNameUndefined: Self = StObject.set(x, "formattedName", js.undefined)
    
    inline def setGroupType(value: String): Self = StObject.set(x, "groupType", value.asInstanceOf[js.Any])
    
    inline def setGroupTypeNull: Self = StObject.set(x, "groupType", null)
    
    inline def setGroupTypeUndefined: Self = StObject.set(x, "groupType", js.undefined)
    
    inline def setMemberCount(value: Double): Self = StObject.set(x, "memberCount", value.asInstanceOf[js.Any])
    
    inline def setMemberCountNull: Self = StObject.set(x, "memberCount", null)
    
    inline def setMemberCountUndefined: Self = StObject.set(x, "memberCount", js.undefined)
    
    inline def setMemberResourceNames(value: js.Array[String]): Self = StObject.set(x, "memberResourceNames", value.asInstanceOf[js.Any])
    
    inline def setMemberResourceNamesNull: Self = StObject.set(x, "memberResourceNames", null)
    
    inline def setMemberResourceNamesUndefined: Self = StObject.set(x, "memberResourceNames", js.undefined)
    
    inline def setMemberResourceNamesVarargs(value: String*): Self = StObject.set(x, "memberResourceNames", js.Array(value*))
    
    inline def setMetadata(value: SchemaContactGroupMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
