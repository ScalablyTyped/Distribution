package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeSettings extends StObject {
  
  /** The maximum number of nodes that can be created beyond the current size of the node pool during the upgrade process. */
  var maxSurge: js.UndefOr[Double] = js.undefined
  
  /** The maximum number of nodes that can be simultaneously unavailable during the upgrade process. A node is considered available if its status is Ready. */
  var maxUnavailable: js.UndefOr[Double] = js.undefined
}
object UpgradeSettings {
  
  inline def apply(): UpgradeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeSettings]
  }
  
  extension [Self <: UpgradeSettings](x: Self) {
    
    inline def setMaxSurge(value: Double): Self = StObject.set(x, "maxSurge", value.asInstanceOf[js.Any])
    
    inline def setMaxSurgeUndefined: Self = StObject.set(x, "maxSurge", js.undefined)
    
    inline def setMaxUnavailable(value: Double): Self = StObject.set(x, "maxUnavailable", value.asInstanceOf[js.Any])
    
    inline def setMaxUnavailableUndefined: Self = StObject.set(x, "maxUnavailable", js.undefined)
  }
}
