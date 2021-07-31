package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotValueRegion extends StObject {
  
  /** The values of the metrics in each of the pivot regions. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object PivotValueRegion {
  
  @scala.inline
  def apply(): PivotValueRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotValueRegion]
  }
  
  @scala.inline
  implicit class PivotValueRegionMutableBuilder[Self <: PivotValueRegion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
