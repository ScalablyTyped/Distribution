package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConferenceParameters extends StObject {
  
  /** Additional add-on specific data. */
  var addOnParameters: js.UndefOr[ConferenceParametersAddOnParameters] = js.undefined
}
object ConferenceParameters {
  
  inline def apply(): ConferenceParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceParameters]
  }
  
  extension [Self <: ConferenceParameters](x: Self) {
    
    inline def setAddOnParameters(value: ConferenceParametersAddOnParameters): Self = StObject.set(x, "addOnParameters", value.asInstanceOf[js.Any])
    
    inline def setAddOnParametersUndefined: Self = StObject.set(x, "addOnParameters", js.undefined)
  }
}
