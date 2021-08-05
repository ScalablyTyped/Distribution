package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateClusterMasterGlobalAccessConfig extends StObject {
  
  /** Whenever master is accessible globally or not. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object PrivateClusterMasterGlobalAccessConfig {
  
  inline def apply(): PrivateClusterMasterGlobalAccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateClusterMasterGlobalAccessConfig]
  }
  
  extension [Self <: PrivateClusterMasterGlobalAccessConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
