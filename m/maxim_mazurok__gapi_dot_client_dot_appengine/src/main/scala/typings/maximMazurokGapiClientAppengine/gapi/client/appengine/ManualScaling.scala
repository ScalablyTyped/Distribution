package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManualScaling extends StObject {
  
  /**
    * Number of instances to assign to the service at the start. This number can later be altered by using the Modules API
    * (https://cloud.google.com/appengine/docs/python/modules/functions) set_num_instances() function.
    */
  var instances: js.UndefOr[Double] = js.undefined
}
object ManualScaling {
  
  inline def apply(): ManualScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManualScaling]
  }
  
  extension [Self <: ManualScaling](x: Self) {
    
    inline def setInstances(value: Double): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
  }
}
