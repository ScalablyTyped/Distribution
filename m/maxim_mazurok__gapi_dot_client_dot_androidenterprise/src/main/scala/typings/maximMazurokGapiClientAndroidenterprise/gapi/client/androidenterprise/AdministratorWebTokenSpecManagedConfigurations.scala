package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdministratorWebTokenSpecManagedConfigurations extends StObject {
  
  /** Whether the Managed Configuration page is displayed. Default is true. */
  var enabled: js.UndefOr[Boolean] = js.native
}
object AdministratorWebTokenSpecManagedConfigurations {
  
  @scala.inline
  def apply(): AdministratorWebTokenSpecManagedConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministratorWebTokenSpecManagedConfigurations]
  }
  
  @scala.inline
  implicit class AdministratorWebTokenSpecManagedConfigurationsMutableBuilder[Self <: AdministratorWebTokenSpecManagedConfigurations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
