package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotValueRegion extends StObject {
  
  /** The values of the metrics in each of the pivot regions. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object PivotValueRegion {
  
  inline def apply(): PivotValueRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotValueRegion]
  }
  
  extension [Self <: PivotValueRegion](x: Self) {
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
