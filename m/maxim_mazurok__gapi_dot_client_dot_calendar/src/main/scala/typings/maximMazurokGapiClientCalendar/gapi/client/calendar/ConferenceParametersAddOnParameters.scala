package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConferenceParametersAddOnParameters extends StObject {
  
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCalendar.maximMazurokGapiClientCalendarStrings.ConferenceParametersAddOnParameters with TopLevel[js.Any]
  ] = js.native
}
object ConferenceParametersAddOnParameters {
  
  @scala.inline
  def apply(): ConferenceParametersAddOnParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceParametersAddOnParameters]
  }
  
  @scala.inline
  implicit class ConferenceParametersAddOnParametersMutableBuilder[Self <: ConferenceParametersAddOnParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCalendar.maximMazurokGapiClientCalendarStrings.ConferenceParametersAddOnParameters with TopLevel[js.Any]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
