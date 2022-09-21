package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionInstanceGroupsListInstancesRequest extends StObject {
  
  /**
    * Instances in which state should be returned. Valid options are: 'ALL', 'RUNNING'. By default, it lists all instances.
    */
  var instanceState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of port user is interested in. It is optional. If it is set, only information about this ports will be returned. If it is not set, all the named ports will be returned. Always lists all instances.
    */
  var portName: js.UndefOr[String | Null] = js.undefined
}
object SchemaRegionInstanceGroupsListInstancesRequest {
  
  inline def apply(): SchemaRegionInstanceGroupsListInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupsListInstancesRequest]
  }
  
  extension [Self <: SchemaRegionInstanceGroupsListInstancesRequest](x: Self) {
    
    inline def setInstanceState(value: String): Self = StObject.set(x, "instanceState", value.asInstanceOf[js.Any])
    
    inline def setInstanceStateNull: Self = StObject.set(x, "instanceState", null)
    
    inline def setInstanceStateUndefined: Self = StObject.set(x, "instanceState", js.undefined)
    
    inline def setPortName(value: String): Self = StObject.set(x, "portName", value.asInstanceOf[js.Any])
    
    inline def setPortNameNull: Self = StObject.set(x, "portName", null)
    
    inline def setPortNameUndefined: Self = StObject.set(x, "portName", js.undefined)
  }
}
