package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowDraggingEventUIParam extends StObject {
  
  /**
    * Gets reference to the igZoombar.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object WindowDraggingEventUIParam {
  
  inline def apply(): WindowDraggingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowDraggingEventUIParam]
  }
  
  extension [Self <: WindowDraggingEventUIParam](x: Self) {
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
