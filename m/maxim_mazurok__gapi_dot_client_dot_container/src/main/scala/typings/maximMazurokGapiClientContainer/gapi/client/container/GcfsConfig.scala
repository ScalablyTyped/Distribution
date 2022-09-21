package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GcfsConfig extends StObject {
  
  /** Whether to use GCFS. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object GcfsConfig {
  
  inline def apply(): GcfsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcfsConfig]
  }
  
  extension [Self <: GcfsConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
