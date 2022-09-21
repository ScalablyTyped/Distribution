package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedConfigurationsForUserListResponse extends StObject {
  
  /** A managed configuration for an app for a specific user. */
  var managedConfigurationForUser: js.UndefOr[js.Array[ManagedConfiguration]] = js.undefined
}
object ManagedConfigurationsForUserListResponse {
  
  inline def apply(): ManagedConfigurationsForUserListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedConfigurationsForUserListResponse]
  }
  
  extension [Self <: ManagedConfigurationsForUserListResponse](x: Self) {
    
    inline def setManagedConfigurationForUser(value: js.Array[ManagedConfiguration]): Self = StObject.set(x, "managedConfigurationForUser", value.asInstanceOf[js.Any])
    
    inline def setManagedConfigurationForUserUndefined: Self = StObject.set(x, "managedConfigurationForUser", js.undefined)
    
    inline def setManagedConfigurationForUserVarargs(value: ManagedConfiguration*): Self = StObject.set(x, "managedConfigurationForUser", js.Array(value*))
  }
}
