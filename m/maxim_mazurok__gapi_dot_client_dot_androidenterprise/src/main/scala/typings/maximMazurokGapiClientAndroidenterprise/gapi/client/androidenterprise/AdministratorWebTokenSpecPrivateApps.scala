package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdministratorWebTokenSpecPrivateApps extends StObject {
  
  /** Whether the Private Apps page is displayed. Default is true. */
  var enabled: js.UndefOr[Boolean] = js.native
}
object AdministratorWebTokenSpecPrivateApps {
  
  @scala.inline
  def apply(): AdministratorWebTokenSpecPrivateApps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministratorWebTokenSpecPrivateApps]
  }
  
  @scala.inline
  implicit class AdministratorWebTokenSpecPrivateAppsMutableBuilder[Self <: AdministratorWebTokenSpecPrivateApps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
