package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterNatLogConfig extends StObject {
  
  /** Indicates whether or not to export logs. This is false by default. */
  var enable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values: -
    * ERRORS_ONLY: Export logs only for connection failures. - TRANSLATIONS_ONLY: Export logs only for successful connections. - ALL: Export logs for all connections, successful and
    * unsuccessful.
    */
  var filter: js.UndefOr[String] = js.undefined
}
object RouterNatLogConfig {
  
  inline def apply(): RouterNatLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterNatLogConfig]
  }
  
  extension [Self <: RouterNatLogConfig](x: Self) {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
