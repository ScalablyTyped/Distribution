package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotDimensionHeader extends StObject {
  
  /** Values of multiple dimensions in a pivot. */
  var dimensionValues: js.UndefOr[js.Array[DimensionValue]] = js.undefined
}
object PivotDimensionHeader {
  
  inline def apply(): PivotDimensionHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotDimensionHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotDimensionHeader] (val x: Self) extends AnyVal {
    
    inline def setDimensionValues(value: js.Array[DimensionValue]): Self = StObject.set(x, "dimensionValues", value.asInstanceOf[js.Any])
    
    inline def setDimensionValuesUndefined: Self = StObject.set(x, "dimensionValues", js.undefined)
    
    inline def setDimensionValuesVarargs(value: DimensionValue*): Self = StObject.set(x, "dimensionValues", js.Array(value*))
  }
}
