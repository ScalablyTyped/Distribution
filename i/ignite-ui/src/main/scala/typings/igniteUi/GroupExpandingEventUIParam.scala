package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupExpandingEventUIParam extends StObject {
  
  /**
    * Gets the column object for the current group that is expanding.
    */
  var column: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the jQuery object for the column being expanded (th).
    */
  var element: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the reference to the GridMultiColumnHeaders widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object GroupExpandingEventUIParam {
  
  inline def apply(): GroupExpandingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupExpandingEventUIParam]
  }
  
  extension [Self <: GroupExpandingEventUIParam](x: Self) {
    
    inline def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
