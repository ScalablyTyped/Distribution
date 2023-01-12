package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GcpFilestoreCsiDriverConfig extends StObject {
  
  /** Whether the GCP Filestore CSI driver is enabled for this cluster. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object GcpFilestoreCsiDriverConfig {
  
  inline def apply(): GcpFilestoreCsiDriverConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcpFilestoreCsiDriverConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GcpFilestoreCsiDriverConfig] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
