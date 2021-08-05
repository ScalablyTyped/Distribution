package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionInstanceGroupsListInstancesRequest extends StObject {
  
  /** Instances in which state should be returned. Valid options are: 'ALL', 'RUNNING'. By default, it lists all instances. */
  var instanceState: js.UndefOr[String] = js.undefined
  
  /**
    * Name of port user is interested in. It is optional. If it is set, only information about this ports will be returned. If it is not set, all the named ports will be returned. Always
    * lists all instances.
    */
  var portName: js.UndefOr[String] = js.undefined
}
object RegionInstanceGroupsListInstancesRequest {
  
  inline def apply(): RegionInstanceGroupsListInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionInstanceGroupsListInstancesRequest]
  }
  
  extension [Self <: RegionInstanceGroupsListInstancesRequest](x: Self) {
    
    inline def setInstanceState(value: String): Self = StObject.set(x, "instanceState", value.asInstanceOf[js.Any])
    
    inline def setInstanceStateUndefined: Self = StObject.set(x, "instanceState", js.undefined)
    
    inline def setPortName(value: String): Self = StObject.set(x, "portName", value.asInstanceOf[js.Any])
    
    inline def setPortNameUndefined: Self = StObject.set(x, "portName", js.undefined)
  }
}
