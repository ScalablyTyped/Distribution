package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWaterfallChartCustomSubtotal extends StObject {
  
  /**
    * True if the data point at subtotal_index is the subtotal. If false, the subtotal will be computed and appear after the data point.
    */
  var dataIsSubtotal: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A label for the subtotal column.
    */
  var label: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The 0-based index of a data point within the series. If data_is_subtotal is true, the data point at this index is the subtotal. Otherwise, the subtotal appears after the data point with this index. A series can have multiple subtotals at arbitrary indices, but subtotals do not affect the indices of the data points. For example, if a series has three data points, their indices will always be 0, 1, and 2, regardless of how many subtotals exist on the series or what data points they are associated with.
    */
  var subtotalIndex: js.UndefOr[Double | Null] = js.undefined
}
object SchemaWaterfallChartCustomSubtotal {
  
  inline def apply(): SchemaWaterfallChartCustomSubtotal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWaterfallChartCustomSubtotal]
  }
  
  extension [Self <: SchemaWaterfallChartCustomSubtotal](x: Self) {
    
    inline def setDataIsSubtotal(value: Boolean): Self = StObject.set(x, "dataIsSubtotal", value.asInstanceOf[js.Any])
    
    inline def setDataIsSubtotalNull: Self = StObject.set(x, "dataIsSubtotal", null)
    
    inline def setDataIsSubtotalUndefined: Self = StObject.set(x, "dataIsSubtotal", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSubtotalIndex(value: Double): Self = StObject.set(x, "subtotalIndex", value.asInstanceOf[js.Any])
    
    inline def setSubtotalIndexNull: Self = StObject.set(x, "subtotalIndex", null)
    
    inline def setSubtotalIndexUndefined: Self = StObject.set(x, "subtotalIndex", js.undefined)
  }
}
