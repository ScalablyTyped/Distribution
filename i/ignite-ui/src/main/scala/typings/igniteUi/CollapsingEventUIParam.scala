package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapsingEventUIParam extends StObject {
  
  /**
    * Used to get a reference the igSplitButton.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object CollapsingEventUIParam {
  
  inline def apply(): CollapsingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsingEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollapsingEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
