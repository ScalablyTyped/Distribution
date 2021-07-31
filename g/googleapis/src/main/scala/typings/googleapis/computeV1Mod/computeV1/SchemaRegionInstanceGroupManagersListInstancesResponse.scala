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
  
  @scala.inline
  def apply(): SchemaRegionInstanceGroupManagersListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersListInstancesResponse]
  }
  
  @scala.inline
  implicit class SchemaRegionInstanceGroupManagersListInstancesResponseMutableBuilder[Self <: SchemaRegionInstanceGroupManagersListInstancesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagedInstances(value: js.Array[SchemaManagedInstance]): Self = StObject.set(x, "managedInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedInstancesUndefined: Self = StObject.set(x, "managedInstances", js.undefined)
    
    @scala.inline
    def setManagedInstancesVarargs(value: SchemaManagedInstance*): Self = StObject.set(x, "managedInstances", js.Array(value :_*))
  }
}
