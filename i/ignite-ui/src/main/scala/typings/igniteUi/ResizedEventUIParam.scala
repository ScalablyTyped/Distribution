package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizedEventUIParam extends StObject {
  
  /**
    * Used to obtain reference to igScroll.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ResizedEventUIParam {
  
  inline def apply(): ResizedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizedEventUIParam]
  }
  
  extension [Self <: ResizedEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
