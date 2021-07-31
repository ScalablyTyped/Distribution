package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdministratorWebTokenSpecStoreBuilder extends StObject {
  
  /** Whether the Organize apps page is displayed. Default is true. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object AdministratorWebTokenSpecStoreBuilder {
  
  @scala.inline
  def apply(): AdministratorWebTokenSpecStoreBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministratorWebTokenSpecStoreBuilder]
  }
  
  @scala.inline
  implicit class AdministratorWebTokenSpecStoreBuilderMutableBuilder[Self <: AdministratorWebTokenSpecStoreBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
