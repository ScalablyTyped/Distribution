package typings.libp2p.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshManagerConfig extends StObject {
  
  var bootDelay: Double
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var interval: Double
}
object RefreshManagerConfig {
  
  inline def apply(bootDelay: Double, interval: Double): RefreshManagerConfig = {
    val __obj = js.Dynamic.literal(bootDelay = bootDelay.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshManagerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefreshManagerConfig] (val x: Self) extends AnyVal {
    
    inline def setBootDelay(value: Double): Self = StObject.set(x, "bootDelay", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
  }
}
