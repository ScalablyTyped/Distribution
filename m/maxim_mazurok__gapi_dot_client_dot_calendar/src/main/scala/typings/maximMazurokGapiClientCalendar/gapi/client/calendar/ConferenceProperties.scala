package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConferenceProperties extends StObject {
  
  /**
    * The types of conference solutions that are supported for this calendar.
    * The possible values are:
    * - "eventHangout"
    * - "eventNamedHangout"
    * - "hangoutsMeet"  Optional.
    */
  var allowedConferenceSolutionTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object ConferenceProperties {
  
  inline def apply(): ConferenceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceProperties]
  }
  
  extension [Self <: ConferenceProperties](x: Self) {
    
    inline def setAllowedConferenceSolutionTypes(value: js.Array[String]): Self = StObject.set(x, "allowedConferenceSolutionTypes", value.asInstanceOf[js.Any])
    
    inline def setAllowedConferenceSolutionTypesUndefined: Self = StObject.set(x, "allowedConferenceSolutionTypes", js.undefined)
    
    inline def setAllowedConferenceSolutionTypesVarargs(value: String*): Self = StObject.set(x, "allowedConferenceSolutionTypes", js.Array(value*))
  }
}
