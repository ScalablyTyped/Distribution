package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosedEventUIParam extends StObject {
  
  /**
    * Used to obtain reference to menu widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ClosedEventUIParam {
  
  inline def apply(): ClosedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClosedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
