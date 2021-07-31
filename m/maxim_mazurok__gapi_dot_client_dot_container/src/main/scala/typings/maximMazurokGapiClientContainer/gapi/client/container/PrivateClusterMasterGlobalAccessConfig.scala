package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateClusterMasterGlobalAccessConfig extends StObject {
  
  /** Whenever master is accessible globally or not. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object PrivateClusterMasterGlobalAccessConfig {
  
  @scala.inline
  def apply(): PrivateClusterMasterGlobalAccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateClusterMasterGlobalAccessConfig]
  }
  
  @scala.inline
  implicit class PrivateClusterMasterGlobalAccessConfigMutableBuilder[Self <: PrivateClusterMasterGlobalAccessConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
