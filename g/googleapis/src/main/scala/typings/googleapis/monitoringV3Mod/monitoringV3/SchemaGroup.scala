package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGroup extends StObject {
  
  /**
    * A user-assigned name for this group, used only for display purposes.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The filter used to determine which monitored resources belong to this group.
    */
  var filter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, the members of this group are considered to be a cluster. The system can perform additional analysis on groups that are clusters.
    */
  var isCluster: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The name of this group. The format is: projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID] When creating a group, this field is ignored and a new name is created consisting of the project specified in the call to CreateGroup and a unique [GROUP_ID] that is generated automatically.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the group's parent, if it has one. The format is: projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID] For groups with no parent, parent_name is the empty string, "".
    */
  var parentName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGroup {
  
  inline def apply(): SchemaGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroup]
  }
  
  extension [Self <: SchemaGroup](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setIsCluster(value: Boolean): Self = StObject.set(x, "isCluster", value.asInstanceOf[js.Any])
    
    inline def setIsClusterNull: Self = StObject.set(x, "isCluster", null)
    
    inline def setIsClusterUndefined: Self = StObject.set(x, "isCluster", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentName(value: String): Self = StObject.set(x, "parentName", value.asInstanceOf[js.Any])
    
    inline def setParentNameNull: Self = StObject.set(x, "parentName", null)
    
    inline def setParentNameUndefined: Self = StObject.set(x, "parentName", js.undefined)
  }
}
