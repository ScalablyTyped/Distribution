package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A contact group.
  */
@js.native
trait SchemaContactGroup extends js.Object {
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
  implicit class SchemaContactGroupOps[Self <: SchemaContactGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setFormattedName(value: String): Self = this.set("formattedName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedName: Self = this.set("formattedName", js.undefined)
    @scala.inline
    def setGroupType(value: String): Self = this.set("groupType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupType: Self = this.set("groupType", js.undefined)
    @scala.inline
    def setMemberCount(value: Double): Self = this.set("memberCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberCount: Self = this.set("memberCount", js.undefined)
    @scala.inline
    def setMemberResourceNamesVarargs(value: String*): Self = this.set("memberResourceNames", js.Array(value :_*))
    @scala.inline
    def setMemberResourceNames(value: js.Array[String]): Self = this.set("memberResourceNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberResourceNames: Self = this.set("memberResourceNames", js.undefined)
    @scala.inline
    def setMetadata(value: SchemaContactGroupMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
  }
  
}

