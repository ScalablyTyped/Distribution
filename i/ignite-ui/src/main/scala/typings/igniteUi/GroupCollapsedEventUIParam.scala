package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupCollapsedEventUIParam extends StObject {
  
  /**
    * Gets the column object for the current group that is collapsed.
    */
  var column: js.UndefOr[Any] = js.undefined
  
  /**
    * Get a reference to the jQuery object for the column being collapsed (th).
    */
  var element: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the reference to the GridMultiColumnHeaders widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object GroupCollapsedEventUIParam {
  
  inline def apply(): GroupCollapsedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupCollapsedEventUIParam]
  }
  
  extension [Self <: GroupCollapsedEventUIParam](x: Self) {
    
    inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
