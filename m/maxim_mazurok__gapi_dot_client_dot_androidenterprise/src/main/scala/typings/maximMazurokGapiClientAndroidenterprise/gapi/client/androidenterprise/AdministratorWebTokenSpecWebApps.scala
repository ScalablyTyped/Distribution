package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdministratorWebTokenSpecWebApps extends StObject {
  
  /** Whether the Web Apps page is displayed. Default is true. */
  var enabled: js.UndefOr[Boolean] = js.native
}
object AdministratorWebTokenSpecWebApps {
  
  @scala.inline
  def apply(): AdministratorWebTokenSpecWebApps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministratorWebTokenSpecWebApps]
  }
  
  @scala.inline
  implicit class AdministratorWebTokenSpecWebAppsMutableBuilder[Self <: AdministratorWebTokenSpecWebApps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
