package typings.libp2p.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricsConfig extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object MetricsConfig {
  
  inline def apply(): MetricsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricsConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricsConfig] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
