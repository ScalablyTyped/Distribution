package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A contact group.
  */
@js.native
trait SchemaContactGroup extends StObject {
  
  /**
    * The [HTTP entity tag](https://en.wikipedia.org/wiki/HTTP_ETag) of the
    * resource. Used for web cache validation.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The read-only name translated and formatted in the viewer&#39;s account
    * locale or the `Accept-Language` HTTP header locale for system groups
    * names. Group names set by the owner are the same as name.
    */
  var formattedName: js.UndefOr[String] = js.native
  
  /**
    * The read-only contact group type.
    */
  var groupType: js.UndefOr[String] = js.native
  
  /**
    * The total number of contacts in the group irrespective of max members in
    * specified in the request.
    */
  var memberCount: js.UndefOr[Double] = js.native
  
  /**
    * The list of contact person resource names that are members of the contact
    * group. The field is not populated for LIST requests and can only be
    * updated through the
    * [ModifyContactGroupMembers](/people/api/rest/v1/contactgroups/members/modify).
    */
  var memberResourceNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Metadata about the contact group.
    */
  var metadata: js.UndefOr[SchemaContactGroupMetadata] = js.native
  
  /**
    * The contact group name set by the group owner or a system provided name
    * for system groups.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The resource name for the contact group, assigned by the server. An ASCII
    * string, in the form of
    * `contactGroups/`&lt;var&gt;contact_group_id&lt;/var&gt;.
    */
  var resourceName: js.UndefOr[String] = js.native
}
object SchemaContactGroup {
  
  @scala.inline
  def apply(): SchemaContactGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContactGroup]
  }
  
  @scala.inline
  implicit class SchemaContactGroupMutableBuilder[Self <: SchemaContactGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setFormattedName(value: String): Self = StObject.set(x, "formattedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedNameUndefined: Self = StObject.set(x, "formattedName", js.undefined)
    
    @scala.inline
    def setGroupType(value: String): Self = StObject.set(x, "groupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupTypeUndefined: Self = StObject.set(x, "groupType", js.undefined)
    
    @scala.inline
    def setMemberCount(value: Double): Self = StObject.set(x, "memberCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberCountUndefined: Self = StObject.set(x, "memberCount", js.undefined)
    
    @scala.inline
    def setMemberResourceNames(value: js.Array[String]): Self = StObject.set(x, "memberResourceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberResourceNamesUndefined: Self = StObject.set(x, "memberResourceNames", js.undefined)
    
    @scala.inline
    def setMemberResourceNamesVarargs(value: String*): Self = StObject.set(x, "memberResourceNames", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(value: SchemaContactGroupMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
