package typings.igniteUi

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderCellRenderedEventUIParam extends StObject {
  
  /**
    * Gets the column key.
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to header cell DOM element.
    */
  var th: js.UndefOr[Element] = js.undefined
}
object HeaderCellRenderedEventUIParam {
  
  inline def apply(): HeaderCellRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderCellRenderedEventUIParam]
  }
  
  extension [Self <: HeaderCellRenderedEventUIParam](x: Self) {
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setTh(value: Element): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
    
    inline def setThUndefined: Self = StObject.set(x, "th", js.undefined)
  }
}
