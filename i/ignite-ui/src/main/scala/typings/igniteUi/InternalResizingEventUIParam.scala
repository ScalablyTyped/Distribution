package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalResizingEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the layout manager performing resizing.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object InternalResizingEventUIParam {
  
  inline def apply(): InternalResizingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalResizingEventUIParam]
  }
  
  extension [Self <: InternalResizingEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
