package typings.igniteUi

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotGridHeadersRenderedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the igGrid widget, which holds the headers.
    */
  var grid: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the pivot grid.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the headers table DOM element.
    */
  var table: js.UndefOr[Element] = js.undefined
}
object PivotGridHeadersRenderedEventUIParam {
  
  inline def apply(): PivotGridHeadersRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridHeadersRenderedEventUIParam]
  }
  
  extension [Self <: PivotGridHeadersRenderedEventUIParam](x: Self) {
    
    inline def setGrid(value: js.Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setTable(value: Element): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
