package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppSettingsChanged extends StObject {
  
  /** Any other associated alert details, for example, AlertConfiguration. */
  var alertDetails: js.UndefOr[String] = js.undefined
  
  /** Rule name */
  var name: js.UndefOr[String] = js.undefined
}
object AppSettingsChanged {
  
  inline def apply(): AppSettingsChanged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppSettingsChanged]
  }
  
  extension [Self <: AppSettingsChanged](x: Self) {
    
    inline def setAlertDetails(value: String): Self = StObject.set(x, "alertDetails", value.asInstanceOf[js.Any])
    
    inline def setAlertDetailsUndefined: Self = StObject.set(x, "alertDetails", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
