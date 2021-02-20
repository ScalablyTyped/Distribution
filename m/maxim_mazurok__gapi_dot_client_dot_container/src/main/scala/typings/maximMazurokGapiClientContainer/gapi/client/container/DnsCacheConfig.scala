package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DnsCacheConfig extends StObject {
  
  /** Whether NodeLocal DNSCache is enabled for this cluster. */
  var enabled: js.UndefOr[Boolean] = js.native
}
object DnsCacheConfig {
  
  @scala.inline
  def apply(): DnsCacheConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsCacheConfig]
  }
  
  @scala.inline
  implicit class DnsCacheConfigMutableBuilder[Self <: DnsCacheConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
