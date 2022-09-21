package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalResizedEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the layout manager performing resizing.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object InternalResizedEventUIParam {
  
  inline def apply(): InternalResizedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalResizedEventUIParam]
  }
  
  extension [Self <: InternalResizedEventUIParam](x: Self) {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
