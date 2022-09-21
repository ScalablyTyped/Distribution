package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportRow extends StObject {
  
  /**
    * Metrics requested by the merchant in the query. Metric values are only set for metrics requested explicitly in the query.
    */
  var metrics: js.UndefOr[SchemaMetrics] = js.undefined
  
  /**
    * Product fields requested by the merchant in the query. Field values are only set if the merchant queries `ProductView`. `product_view` field is available only to allowlisted users who can query the `ProductView` table.
    */
  var productView: js.UndefOr[SchemaProductView] = js.undefined
  
  /**
    * Segmentation dimensions requested by the merchant in the query. Dimension values are only set for dimensions requested explicitly in the query.
    */
  var segments: js.UndefOr[SchemaSegments] = js.undefined
}
object SchemaReportRow {
  
  inline def apply(): SchemaReportRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportRow]
  }
  
  extension [Self <: SchemaReportRow](x: Self) {
    
    inline def setMetrics(value: SchemaMetrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setProductView(value: SchemaProductView): Self = StObject.set(x, "productView", value.asInstanceOf[js.Any])
    
    inline def setProductViewUndefined: Self = StObject.set(x, "productView", js.undefined)
    
    inline def setSegments(value: SchemaSegments): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
  }
}
