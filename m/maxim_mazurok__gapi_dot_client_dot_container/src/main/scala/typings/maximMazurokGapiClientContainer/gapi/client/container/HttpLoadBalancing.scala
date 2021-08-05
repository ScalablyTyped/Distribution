package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpLoadBalancing extends StObject {
  
  /** Whether the HTTP Load Balancing controller is enabled in the cluster. When enabled, it runs a small pod in the cluster that manages the load balancers. */
  var disabled: js.UndefOr[Boolean] = js.undefined
}
object HttpLoadBalancing {
  
  inline def apply(): HttpLoadBalancing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpLoadBalancing]
  }
  
  extension [Self <: HttpLoadBalancing](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
