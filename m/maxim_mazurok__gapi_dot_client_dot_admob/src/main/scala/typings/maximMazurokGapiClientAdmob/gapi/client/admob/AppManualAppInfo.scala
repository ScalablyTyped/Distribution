package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppManualAppInfo extends StObject {
  
  /** The display name of the app as shown in the AdMob UI, which is provided by the user. The maximum length allowed is 80 characters. */
  var displayName: js.UndefOr[String] = js.undefined
}
object AppManualAppInfo {
  
  inline def apply(): AppManualAppInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppManualAppInfo]
  }
  
  extension [Self <: AppManualAppInfo](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
