package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderRenderingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object HeaderRenderingEventUIParam {
  
  inline def apply(): HeaderRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderRenderingEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeaderRenderingEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
