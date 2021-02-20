package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstanceGroupManagersListManagedInstancesResponse extends StObject {
  
  /**
    * [Output Only] The list of instances in the managed instance group.
    */
  var managedInstances: js.UndefOr[js.Array[SchemaManagedInstance]] = js.native
}
object SchemaInstanceGroupManagersListManagedInstancesResponse {
  
  @scala.inline
  def apply(): SchemaInstanceGroupManagersListManagedInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersListManagedInstancesResponse]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupManagersListManagedInstancesResponseMutableBuilder[Self <: SchemaInstanceGroupManagersListManagedInstancesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagedInstances(value: js.Array[SchemaManagedInstance]): Self = StObject.set(x, "managedInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedInstancesUndefined: Self = StObject.set(x, "managedInstances", js.undefined)
    
    @scala.inline
    def setManagedInstancesVarargs(value: SchemaManagedInstance*): Self = StObject.set(x, "managedInstances", js.Array(value :_*))
  }
}
