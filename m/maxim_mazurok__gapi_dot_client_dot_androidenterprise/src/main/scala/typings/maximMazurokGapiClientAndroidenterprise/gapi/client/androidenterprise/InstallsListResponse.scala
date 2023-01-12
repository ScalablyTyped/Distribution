package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallsListResponse extends StObject {
  
  /** An installation of an app for a user on a specific device. The existence of an install implies that the user must have an entitlement to the app. */
  var install: js.UndefOr[js.Array[Install]] = js.undefined
}
object InstallsListResponse {
  
  inline def apply(): InstallsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallsListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstallsListResponse] (val x: Self) extends AnyVal {
    
    inline def setInstall(value: js.Array[Install]): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
    
    inline def setInstallUndefined: Self = StObject.set(x, "install", js.undefined)
    
    inline def setInstallVarargs(value: Install*): Self = StObject.set(x, "install", js.Array(value*))
  }
}
