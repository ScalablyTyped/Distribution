package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowResizingEventUIParam extends StObject {
  
  /**
    * Gets reference to the igZoombar.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object WindowResizingEventUIParam {
  
  inline def apply(): WindowResizingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowResizingEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowResizingEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
