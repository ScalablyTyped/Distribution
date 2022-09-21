package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuperAdminPasswordResetEvent extends StObject {
  
  /** email of person whose password was reset */
  var userEmail: js.UndefOr[String] = js.undefined
}
object SuperAdminPasswordResetEvent {
  
  inline def apply(): SuperAdminPasswordResetEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuperAdminPasswordResetEvent]
  }
  
  extension [Self <: SuperAdminPasswordResetEvent](x: Self) {
    
    inline def setUserEmail(value: String): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
    
    inline def setUserEmailUndefined: Self = StObject.set(x, "userEmail", js.undefined)
  }
}
