package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait SchemaGroup extends StObject {
  
  /**
    * A user-assigned name for this group, used only for display purposes.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The filter used to determine which monitored resources belong to this
    * group.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * If true, the members of this group are considered to be a cluster. The
    * system can perform additional analysis on groups that are clusters.
    */
  var isCluster: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output only. The name of this group. The format is
    * &quot;projects/{project_id_or_number}/groups/{group_id}&quot;. When
    * creating a group, this field is ignored and a new name is created
    * consisting of the project specified in the call to CreateGroup and a
    * unique {group_id} that is generated automatically.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the group&#39;s parent, if it has one. The format is
    * &quot;projects/{project_id_or_number}/groups/{group_id}&quot;. For groups
    * with no parent, parentName is the empty string, &quot;&quot;.
    */
  var parentName: js.UndefOr[String] = js.undefined
}
object SchemaGroup {
  
  @scala.inline
  def apply(): SchemaGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroup]
  }
  
  @scala.inline
  implicit class SchemaGroupMutableBuilder[Self <: SchemaGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setIsCluster(value: Boolean): Self = StObject.set(x, "isCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsClusterUndefined: Self = StObject.set(x, "isCluster", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParentName(value: String): Self = StObject.set(x, "parentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNameUndefined: Self = StObject.set(x, "parentName", js.undefined)
  }
}
