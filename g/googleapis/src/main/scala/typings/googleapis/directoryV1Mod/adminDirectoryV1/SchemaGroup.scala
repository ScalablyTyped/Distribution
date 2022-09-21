package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGroup extends StObject {
  
  /**
    * Read-only. Value is `true` if this group was created by an administrator rather than a user.
    */
  var adminCreated: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Read-only. A list of a group's alias email addresses. To add, update, or remove a group's aliases, use the `groups.aliases` methods. If edited in a group's POST or PUT request, the edit is ignored.
    */
  var aliases: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * An extended description to help users determine the purpose of a group. For example, you can include information about who should join the group, the types of messages to send to the group, links to FAQs about the group, or related groups. Maximum length is `4,096` characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of users that are direct members of the group. If a group is a member (child) of this group (the parent), members of the child group are not counted in the `directMembersCount` property of the parent group.
    */
  var directMembersCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The group's email address. If your account has multiple domains, select the appropriate domain for the email address. The `email` must be unique. This property is required when creating a group. Group email addresses are subject to the same character usage rules as usernames, see the [help center](https://support.google.com/a/answer/9193374) for details.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Read-only. The unique ID of a group. A group `id` can be used as a group request URI's `groupKey`.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the API resource. For Groups resources, the value is `admin#directory#group`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The group's display name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Read-only. A list of the group's non-editable alias email addresses that are outside of the account's primary domain or subdomains. These are functioning email addresses used by the group. This is a read-only property returned in the API's response for a group. If edited in a group's POST or PUT request, the edit is ignored.
    */
  var nonEditableAliases: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGroup {
  
  inline def apply(): SchemaGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroup]
  }
  
  extension [Self <: SchemaGroup](x: Self) {
    
    inline def setAdminCreated(value: Boolean): Self = StObject.set(x, "adminCreated", value.asInstanceOf[js.Any])
    
    inline def setAdminCreatedNull: Self = StObject.set(x, "adminCreated", null)
    
    inline def setAdminCreatedUndefined: Self = StObject.set(x, "adminCreated", js.undefined)
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesNull: Self = StObject.set(x, "aliases", null)
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDirectMembersCount(value: String): Self = StObject.set(x, "directMembersCount", value.asInstanceOf[js.Any])
    
    inline def setDirectMembersCountNull: Self = StObject.set(x, "directMembersCount", null)
    
    inline def setDirectMembersCountUndefined: Self = StObject.set(x, "directMembersCount", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNonEditableAliases(value: js.Array[String]): Self = StObject.set(x, "nonEditableAliases", value.asInstanceOf[js.Any])
    
    inline def setNonEditableAliasesNull: Self = StObject.set(x, "nonEditableAliases", null)
    
    inline def setNonEditableAliasesUndefined: Self = StObject.set(x, "nonEditableAliases", js.undefined)
    
    inline def setNonEditableAliasesVarargs(value: String*): Self = StObject.set(x, "nonEditableAliases", js.Array(value*))
  }
}
