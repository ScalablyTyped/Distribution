package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowDragStartedEventUIParam extends StObject {
  
  /**
    * Gets reference to the igZoombar.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object WindowDragStartedEventUIParam {
  
  inline def apply(): WindowDragStartedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowDragStartedEventUIParam]
  }
  
  extension [Self <: WindowDragStartedEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
