package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateRangeValues extends StObject {
  
  /** The values of each pivot region. */
  var pivotValueRegions: js.UndefOr[js.Array[PivotValueRegion]] = js.native
  
  /** Each value corresponds to each Metric in the request. */
  var values: js.UndefOr[js.Array[String]] = js.native
}
object DateRangeValues {
  
  @scala.inline
  def apply(): DateRangeValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangeValues]
  }
  
  @scala.inline
  implicit class DateRangeValuesMutableBuilder[Self <: DateRangeValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPivotValueRegions(value: js.Array[PivotValueRegion]): Self = StObject.set(x, "pivotValueRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotValueRegionsUndefined: Self = StObject.set(x, "pivotValueRegions", js.undefined)
    
    @scala.inline
    def setPivotValueRegionsVarargs(value: PivotValueRegion*): Self = StObject.set(x, "pivotValueRegions", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
