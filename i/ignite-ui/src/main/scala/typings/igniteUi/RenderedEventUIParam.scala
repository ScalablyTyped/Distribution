package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderedEventUIParam extends StObject {
  
  /**
    * Used to get a reference to the main/top combo element.
    */
  var element: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get a reference to the combo performing rendering.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object RenderedEventUIParam {
  
  inline def apply(): RenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderedEventUIParam]
  }
  
  extension [Self <: RenderedEventUIParam](x: Self) {
    
    inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
