package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpConfig extends StObject {
  
  /** If enabled, allows devices to use DeviceService via the HTTP protocol. Otherwise, any requests to DeviceService will fail for this registry. */
  var httpEnabledState: js.UndefOr[String] = js.native
}
object HttpConfig {
  
  @scala.inline
  def apply(): HttpConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpConfig]
  }
  
  @scala.inline
  implicit class HttpConfigMutableBuilder[Self <: HttpConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpEnabledState(value: String): Self = StObject.set(x, "httpEnabledState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpEnabledStateUndefined: Self = StObject.set(x, "httpEnabledState", js.undefined)
  }
}
