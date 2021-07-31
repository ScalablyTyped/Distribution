package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicScaling extends StObject {
  
  /** Duration of time after the last request that an instance must wait before the instance is shut down. */
  var idleTimeout: js.UndefOr[String] = js.undefined
  
  /** Maximum number of instances to create for this version. */
  var maxInstances: js.UndefOr[Double] = js.undefined
}
object BasicScaling {
  
  @scala.inline
  def apply(): BasicScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicScaling]
  }
  
  @scala.inline
  implicit class BasicScalingMutableBuilder[Self <: BasicScaling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdleTimeout(value: String): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
    
    @scala.inline
    def setMaxInstances(value: Double): Self = StObject.set(x, "maxInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxInstancesUndefined: Self = StObject.set(x, "maxInstances", js.undefined)
  }
}
