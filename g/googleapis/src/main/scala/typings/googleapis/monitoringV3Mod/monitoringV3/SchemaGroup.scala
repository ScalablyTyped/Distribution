package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The description of a dynamic collection of monitored resources. Each group
  * has a filter that is matched against monitored resources and their
  * associated metadata. If a group&#39;s filter matches an available monitored
  * resource, then that resource is a member of that group. Groups can contain
  * any number of monitored resources, and each monitored resource can be a
  * member of any number of groups.Groups can be nested in parent-child
  * hierarchies. The parentName field identifies an optional parent for each
  * group. If a group has a parent, then the only monitored resources available
  * to be matched by the group&#39;s filter are the resources contained in the
  * parent group. In other words, a group contains the monitored resources that
  * match its filter and the filters of all the group&#39;s ancestors. A group
  * without a parent can contain any monitored resource.For example, consider
  * an infrastructure running a set of instances with two user-defined tags:
  * &quot;environment&quot; and &quot;role&quot;. A parent group has a filter,
  * environment=&quot;production&quot;. A child of that parent group has a
  * filter, role=&quot;transcoder&quot;. The parent group contains all
  * instances in the production environment, regardless of their roles. The
  * child group contains instances that have the transcoder role and are in the
  * production environment.The monitored resources contained in a group can
  * change at any moment, depending on what resources exist and what filters
  * are associated with the group and its ancestors.
  */
@js.native
trait SchemaGroup extends js.Object {
  /**
    * A user-assigned name for this group, used only for display purposes.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The filter used to determine which monitored resources belong to this
    * group.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * If true, the members of this group are considered to be a cluster. The
    * system can perform additional analysis on groups that are clusters.
    */
  var isCluster: js.UndefOr[Boolean] = js.native
  /**
    * Output only. The name of this group. The format is
    * &quot;projects/{project_id_or_number}/groups/{group_id}&quot;. When
    * creating a group, this field is ignored and a new name is created
    * consisting of the project specified in the call to CreateGroup and a
    * unique {group_id} that is generated automatically.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The name of the group&#39;s parent, if it has one. The format is
    * &quot;projects/{project_id_or_number}/groups/{group_id}&quot;. For groups
    * with no parent, parentName is the empty string, &quot;&quot;.
    */
  var parentName: js.UndefOr[String] = js.native
}

object SchemaGroup {
  @scala.inline
  def apply(): SchemaGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroup]
  }
  @scala.inline
  implicit class SchemaGroupOps[Self <: SchemaGroup] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setIsCluster(value: Boolean): Self = this.set("isCluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCluster: Self = this.set("isCluster", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParentName(value: String): Self = this.set("parentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentName: Self = this.set("parentName", js.undefined)
  }
  
}

