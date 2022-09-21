package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoomChangingEventUIParam extends StObject {
  
  /**
    * Gets reference to igZoombar.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ZoomChangingEventUIParam {
  
  inline def apply(): ZoomChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomChangingEventUIParam]
  }
  
  extension [Self <: ZoomChangingEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
