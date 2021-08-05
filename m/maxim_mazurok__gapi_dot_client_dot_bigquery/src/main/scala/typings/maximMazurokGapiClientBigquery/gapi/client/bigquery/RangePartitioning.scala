package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typings.maximMazurokGapiClientBigquery.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangePartitioning extends StObject {
  
  /** [TrustedTester] [Required] The table is partitioned by this field. The field must be a top-level NULLABLE/REQUIRED field. The only supported type is INTEGER/INT64. */
  var field: js.UndefOr[String] = js.undefined
  
  /** [TrustedTester] [Required] Defines the ranges for range partitioning. */
  var range: js.UndefOr[End] = js.undefined
}
object RangePartitioning {
  
  inline def apply(): RangePartitioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangePartitioning]
  }
  
  extension [Self <: RangePartitioning](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setRange(value: End): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
