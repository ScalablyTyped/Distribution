package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedConfigurationsForUserListResponse extends StObject {
  
  /** A managed configuration for an app for a specific user. */
  var managedConfigurationForUser: js.UndefOr[js.Array[ManagedConfiguration]] = js.undefined
}
object ManagedConfigurationsForUserListResponse {
  
  @scala.inline
  def apply(): ManagedConfigurationsForUserListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedConfigurationsForUserListResponse]
  }
  
  @scala.inline
  implicit class ManagedConfigurationsForUserListResponseMutableBuilder[Self <: ManagedConfigurationsForUserListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagedConfigurationForUser(value: js.Array[ManagedConfiguration]): Self = StObject.set(x, "managedConfigurationForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedConfigurationForUserUndefined: Self = StObject.set(x, "managedConfigurationForUser", js.undefined)
    
    @scala.inline
    def setManagedConfigurationForUserVarargs(value: ManagedConfiguration*): Self = StObject.set(x, "managedConfigurationForUser", js.Array(value :_*))
  }
}
