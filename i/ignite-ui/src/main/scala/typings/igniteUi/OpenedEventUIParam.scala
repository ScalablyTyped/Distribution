package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenedEventUIParam extends StObject {
  
  /**
    * Used to obtain reference to menu widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object OpenedEventUIParam {
  
  inline def apply(): OpenedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenedEventUIParam]
  }
  
  extension [Self <: OpenedEventUIParam](x: Self) {
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
