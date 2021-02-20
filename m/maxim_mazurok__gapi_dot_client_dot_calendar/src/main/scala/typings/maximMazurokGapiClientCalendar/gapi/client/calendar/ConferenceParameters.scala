package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConferenceParameters extends StObject {
  
  /** Additional add-on specific data. */
  var addOnParameters: js.UndefOr[ConferenceParametersAddOnParameters] = js.native
}
object ConferenceParameters {
  
  @scala.inline
  def apply(): ConferenceParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceParameters]
  }
  
  @scala.inline
  implicit class ConferenceParametersMutableBuilder[Self <: ConferenceParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOnParameters(value: ConferenceParametersAddOnParameters): Self = StObject.set(x, "addOnParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddOnParametersUndefined: Self = StObject.set(x, "addOnParameters", js.undefined)
  }
}
