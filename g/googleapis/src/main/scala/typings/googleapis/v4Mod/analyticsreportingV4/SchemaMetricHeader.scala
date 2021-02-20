package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The headers for the metrics.
  */
@js.native
trait SchemaMetricHeader extends StObject {
  
  /**
    * Headers for the metrics in the response.
    */
  var metricHeaderEntries: js.UndefOr[js.Array[SchemaMetricHeaderEntry]] = js.native
  
  /**
    * Headers for the pivots in the response.
    */
  var pivotHeaders: js.UndefOr[js.Array[SchemaPivotHeader]] = js.native
}
object SchemaMetricHeader {
  
  @scala.inline
  def apply(): SchemaMetricHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricHeader]
  }
  
  @scala.inline
  implicit class SchemaMetricHeaderMutableBuilder[Self <: SchemaMetricHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricHeaderEntries(value: js.Array[SchemaMetricHeaderEntry]): Self = StObject.set(x, "metricHeaderEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricHeaderEntriesUndefined: Self = StObject.set(x, "metricHeaderEntries", js.undefined)
    
    @scala.inline
    def setMetricHeaderEntriesVarargs(value: SchemaMetricHeaderEntry*): Self = StObject.set(x, "metricHeaderEntries", js.Array(value :_*))
    
    @scala.inline
    def setPivotHeaders(value: js.Array[SchemaPivotHeader]): Self = StObject.set(x, "pivotHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotHeadersUndefined: Self = StObject.set(x, "pivotHeaders", js.undefined)
    
    @scala.inline
    def setPivotHeadersVarargs(value: SchemaPivotHeader*): Self = StObject.set(x, "pivotHeaders", js.Array(value :_*))
  }
}
