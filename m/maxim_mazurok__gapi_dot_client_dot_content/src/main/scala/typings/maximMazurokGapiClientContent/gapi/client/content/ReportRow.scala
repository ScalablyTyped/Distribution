package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportRow extends StObject {
  
  /** Metrics requested by the merchant in the query. Metric values are only set for metrics requested explicitly in the query. */
  var metrics: js.UndefOr[Metrics] = js.undefined
  
  /**
    * Product fields requested by the merchant in the query. Field values are only set if the merchant queries `ProductView`. `product_view` field is available only to allowlisted users
    * who can query the `ProductView` table.
    */
  var productView: js.UndefOr[ProductView] = js.undefined
  
  /** Segmentation dimensions requested by the merchant in the query. Dimension values are only set for dimensions requested explicitly in the query. */
  var segments: js.UndefOr[Segments] = js.undefined
}
object ReportRow {
  
  inline def apply(): ReportRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportRow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportRow] (val x: Self) extends AnyVal {
    
    inline def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setProductView(value: ProductView): Self = StObject.set(x, "productView", value.asInstanceOf[js.Any])
    
    inline def setProductViewUndefined: Self = StObject.set(x, "productView", js.undefined)
    
    inline def setSegments(value: Segments): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
  }
}
