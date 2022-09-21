package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAssignment extends StObject {
  
  /**
    * Targets instances matching at least one of these label sets. This allows an assignment to target disparate groups, for example "env=prod or env=staging".
    */
  var groupLabels: js.UndefOr[js.Array[SchemaAssignmentGroupLabel]] = js.undefined
  
  /**
    * Targets VM instances whose name starts with one of these prefixes. Like labels, this is another way to group VM instances when targeting configs, for example prefix="prod-". Only supported for project-level policies.
    */
  var instanceNamePrefixes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Targets any of the instances specified. Instances are specified by their URI in the form `zones/[ZONE]/instances/[INSTANCE_NAME]`. Instance targeting is uncommon and is supported to facilitate the management of changes by the instance or to target specific VM instances for development and testing. Only supported for project-level policies and must reference instances within this project.
    */
  var instances: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Targets VM instances matching at least one of the following OS types. VM instances must match all supplied criteria for a given OsType to be included.
    */
  var osTypes: js.UndefOr[js.Array[SchemaAssignmentOsType]] = js.undefined
  
  /**
    * Targets instances in any of these zones. Leave empty to target instances in any zone. Zonal targeting is uncommon and is supported to facilitate the management of changes by zone.
    */
  var zones: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaAssignment {
  
  inline def apply(): SchemaAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssignment]
  }
  
  extension [Self <: SchemaAssignment](x: Self) {
    
    inline def setGroupLabels(value: js.Array[SchemaAssignmentGroupLabel]): Self = StObject.set(x, "groupLabels", value.asInstanceOf[js.Any])
    
    inline def setGroupLabelsUndefined: Self = StObject.set(x, "groupLabels", js.undefined)
    
    inline def setGroupLabelsVarargs(value: SchemaAssignmentGroupLabel*): Self = StObject.set(x, "groupLabels", js.Array(value*))
    
    inline def setInstanceNamePrefixes(value: js.Array[String]): Self = StObject.set(x, "instanceNamePrefixes", value.asInstanceOf[js.Any])
    
    inline def setInstanceNamePrefixesNull: Self = StObject.set(x, "instanceNamePrefixes", null)
    
    inline def setInstanceNamePrefixesUndefined: Self = StObject.set(x, "instanceNamePrefixes", js.undefined)
    
    inline def setInstanceNamePrefixesVarargs(value: String*): Self = StObject.set(x, "instanceNamePrefixes", js.Array(value*))
    
    inline def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesNull: Self = StObject.set(x, "instances", null)
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setOsTypes(value: js.Array[SchemaAssignmentOsType]): Self = StObject.set(x, "osTypes", value.asInstanceOf[js.Any])
    
    inline def setOsTypesUndefined: Self = StObject.set(x, "osTypes", js.undefined)
    
    inline def setOsTypesVarargs(value: SchemaAssignmentOsType*): Self = StObject.set(x, "osTypes", js.Array(value*))
    
    inline def setZones(value: js.Array[String]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    
    inline def setZonesNull: Self = StObject.set(x, "zones", null)
    
    inline def setZonesUndefined: Self = StObject.set(x, "zones", js.undefined)
    
    inline def setZonesVarargs(value: String*): Self = StObject.set(x, "zones", js.Array(value*))
  }
}
