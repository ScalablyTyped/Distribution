package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateRangeValues extends StObject {
  
  /** The values of each pivot region. */
  var pivotValueRegions: js.UndefOr[js.Array[PivotValueRegion]] = js.undefined
  
  /** Each value corresponds to each Metric in the request. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object DateRangeValues {
  
  inline def apply(): DateRangeValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangeValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateRangeValues] (val x: Self) extends AnyVal {
    
    inline def setPivotValueRegions(value: js.Array[PivotValueRegion]): Self = StObject.set(x, "pivotValueRegions", value.asInstanceOf[js.Any])
    
    inline def setPivotValueRegionsUndefined: Self = StObject.set(x, "pivotValueRegions", js.undefined)
    
    inline def setPivotValueRegionsVarargs(value: PivotValueRegion*): Self = StObject.set(x, "pivotValueRegions", js.Array(value*))
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
