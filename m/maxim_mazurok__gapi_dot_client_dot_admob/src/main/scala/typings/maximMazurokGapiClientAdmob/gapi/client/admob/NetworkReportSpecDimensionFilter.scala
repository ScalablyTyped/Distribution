package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkReportSpecDimensionFilter extends StObject {
  
  /** Applies the filter criterion to the specified dimension. */
  var dimension: js.UndefOr[String] = js.undefined
  
  /** Matches a row if its value for the specified dimension is in one of the values specified in this condition. */
  var matchesAny: js.UndefOr[StringList] = js.undefined
}
object NetworkReportSpecDimensionFilter {
  
  inline def apply(): NetworkReportSpecDimensionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkReportSpecDimensionFilter]
  }
  
  extension [Self <: NetworkReportSpecDimensionFilter](x: Self) {
    
    inline def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setMatchesAny(value: StringList): Self = StObject.set(x, "matchesAny", value.asInstanceOf[js.Any])
    
    inline def setMatchesAnyUndefined: Self = StObject.set(x, "matchesAny", js.undefined)
  }
}
