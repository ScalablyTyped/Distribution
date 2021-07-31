package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterNatLogConfig extends StObject {
  
  /** Indicates whether or not to export logs. This is false by default. */
  var enable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values:
    * - ERRORS_ONLY: Export logs only for connection failures.
    * - TRANSLATIONS_ONLY: Export logs only for successful connections.
    * - ALL: Export logs for all connections, successful and unsuccessful.
    */
  var filter: js.UndefOr[String] = js.undefined
}
object RouterNatLogConfig {
  
  @scala.inline
  def apply(): RouterNatLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterNatLogConfig]
  }
  
  @scala.inline
  implicit class RouterNatLogConfigMutableBuilder[Self <: RouterNatLogConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
