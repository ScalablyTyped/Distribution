package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupExpandedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the jQuery object for the column being expanded (th).
    */
  var element: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the reference to the GridMultiColumnHeaders widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object GroupExpandedEventUIParam {
  
  inline def apply(): GroupExpandedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupExpandedEventUIParam]
  }
  
  extension [Self <: GroupExpandedEventUIParam](x: Self) {
    
    inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
