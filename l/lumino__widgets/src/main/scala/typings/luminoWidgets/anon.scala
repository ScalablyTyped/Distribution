package typings.luminoWidgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@lumino/widgets.@lumino/widgets/types/gridlayout.GridLayout.ICellConfig> */
  trait PartialICellConfig extends StObject {
    
    var column: js.UndefOr[Double] = js.undefined
    
    var columnSpan: js.UndefOr[Double] = js.undefined
    
    var row: js.UndefOr[Double] = js.undefined
    
    var rowSpan: js.UndefOr[Double] = js.undefined
  }
  object PartialICellConfig {
    
    inline def apply(): PartialICellConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialICellConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialICellConfig] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
      
      inline def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
}
