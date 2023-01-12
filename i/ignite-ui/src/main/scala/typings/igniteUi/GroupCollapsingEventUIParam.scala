package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupCollapsingEventUIParam extends StObject {
  
  /**
    * Gets the column object for the current group that is collapsing.
    */
  var column: js.UndefOr[Any] = js.undefined
  
  /**
    * Get a reference to the jQuery object for the column being collapsing (th).
    */
  var element: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the reference to the GridMultiColumnHeaders widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object GroupCollapsingEventUIParam {
  
  inline def apply(): GroupCollapsingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupCollapsingEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupCollapsingEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
