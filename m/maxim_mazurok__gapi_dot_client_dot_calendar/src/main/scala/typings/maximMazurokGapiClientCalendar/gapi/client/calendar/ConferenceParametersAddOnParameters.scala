package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConferenceParametersAddOnParameters extends StObject {
  
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object ConferenceParametersAddOnParameters {
  
  inline def apply(): ConferenceParametersAddOnParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceParametersAddOnParameters]
  }
  
  extension [Self <: ConferenceParametersAddOnParameters](x: Self) {
    
    inline def setParameters(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
