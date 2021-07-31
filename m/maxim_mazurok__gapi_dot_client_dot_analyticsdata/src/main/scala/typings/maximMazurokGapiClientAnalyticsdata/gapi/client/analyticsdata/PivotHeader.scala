package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotHeader extends StObject {
  
  /** The size is the same as the cardinality of the corresponding dimension combinations. */
  var pivotDimensionHeaders: js.UndefOr[js.Array[PivotDimensionHeader]] = js.undefined
  
  /**
    * The cardinality of the pivot as if offset = 0 and limit = -1. The total number of rows for this pivot's fields regardless of how the parameters offset and limit are specified in the
    * request.
    */
  var rowCount: js.UndefOr[Double] = js.undefined
}
object PivotHeader {
  
  @scala.inline
  def apply(): PivotHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotHeader]
  }
  
  @scala.inline
  implicit class PivotHeaderMutableBuilder[Self <: PivotHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPivotDimensionHeaders(value: js.Array[PivotDimensionHeader]): Self = StObject.set(x, "pivotDimensionHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotDimensionHeadersUndefined: Self = StObject.set(x, "pivotDimensionHeaders", js.undefined)
    
    @scala.inline
    def setPivotDimensionHeadersVarargs(value: PivotDimensionHeader*): Self = StObject.set(x, "pivotDimensionHeaders", js.Array(value :_*))
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
  }
}
