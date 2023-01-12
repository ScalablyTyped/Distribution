package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotHeader extends StObject {
  
  /** The size is the same as the cardinality of the corresponding dimension combinations. */
  var pivotDimensionHeaders: js.UndefOr[js.Array[PivotDimensionHeader]] = js.undefined
  
  /** The cardinality of the pivot. The total number of rows for this pivot's fields regardless of how the parameters `offset` and `limit` are specified in the request. */
  var rowCount: js.UndefOr[Double] = js.undefined
}
object PivotHeader {
  
  inline def apply(): PivotHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotHeader] (val x: Self) extends AnyVal {
    
    inline def setPivotDimensionHeaders(value: js.Array[PivotDimensionHeader]): Self = StObject.set(x, "pivotDimensionHeaders", value.asInstanceOf[js.Any])
    
    inline def setPivotDimensionHeadersUndefined: Self = StObject.set(x, "pivotDimensionHeaders", js.undefined)
    
    inline def setPivotDimensionHeadersVarargs(value: PivotDimensionHeader*): Self = StObject.set(x, "pivotDimensionHeaders", js.Array(value*))
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
  }
}
