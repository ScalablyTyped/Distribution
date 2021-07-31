package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigConnectorConfig extends StObject {
  
  /** Whether Cloud Connector is enabled for this cluster. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object ConfigConnectorConfig {
  
  @scala.inline
  def apply(): ConfigConnectorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigConnectorConfig]
  }
  
  @scala.inline
  implicit class ConfigConnectorConfigMutableBuilder[Self <: ConfigConnectorConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
