package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupsListInstancesRequest extends StObject {
  
  /**
    * A filter for the state of the instances in the instance group. Valid options are ALL or RUNNING. If you do not specify this parameter the list includes all instances regardless of their state.
    */
  var instanceState: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceGroupsListInstancesRequest {
  
  inline def apply(): SchemaInstanceGroupsListInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupsListInstancesRequest]
  }
  
  extension [Self <: SchemaInstanceGroupsListInstancesRequest](x: Self) {
    
    inline def setInstanceState(value: String): Self = StObject.set(x, "instanceState", value.asInstanceOf[js.Any])
    
    inline def setInstanceStateNull: Self = StObject.set(x, "instanceState", null)
    
    inline def setInstanceStateUndefined: Self = StObject.set(x, "instanceState", js.undefined)
  }
}
