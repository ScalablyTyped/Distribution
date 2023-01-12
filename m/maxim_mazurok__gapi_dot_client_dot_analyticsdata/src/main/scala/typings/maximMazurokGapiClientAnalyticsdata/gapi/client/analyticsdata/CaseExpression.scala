package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaseExpression extends StObject {
  
  /** Name of a dimension. The name must refer back to a name in dimensions field of the request. */
  var dimensionName: js.UndefOr[String] = js.undefined
}
object CaseExpression {
  
  inline def apply(): CaseExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaseExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CaseExpression] (val x: Self) extends AnyVal {
    
    inline def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
  }
}
