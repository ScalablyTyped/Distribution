package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivatingEventUIParam extends StObject {
  
  /**
    * Used to get reference to this igToolbarButton.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ActivatingEventUIParam {
  
  inline def apply(): ActivatingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivatingEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActivatingEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
