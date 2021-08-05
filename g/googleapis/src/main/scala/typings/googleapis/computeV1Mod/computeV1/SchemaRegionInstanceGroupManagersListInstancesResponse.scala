package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionInstanceGroupManagersListInstancesResponse extends StObject {
  
  /**
    * A list of managed instances.
    */
  var managedInstances: js.UndefOr[js.Array[SchemaManagedInstance]] = js.undefined
}
object SchemaRegionInstanceGroupManagersListInstancesResponse {
  
  inline def apply(): SchemaRegionInstanceGroupManagersListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersListInstancesResponse]
  }
  
  extension [Self <: SchemaRegionInstanceGroupManagersListInstancesResponse](x: Self) {
    
    inline def setManagedInstances(value: js.Array[SchemaManagedInstance]): Self = StObject.set(x, "managedInstances", value.asInstanceOf[js.Any])
    
    inline def setManagedInstancesUndefined: Self = StObject.set(x, "managedInstances", js.undefined)
    
    inline def setManagedInstancesVarargs(value: SchemaManagedInstance*): Self = StObject.set(x, "managedInstances", js.Array(value :_*))
  }
}
