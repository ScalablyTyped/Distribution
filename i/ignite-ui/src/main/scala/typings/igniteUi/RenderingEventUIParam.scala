package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the editor element.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the editor performing rendering.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object RenderingEventUIParam {
  
  inline def apply(): RenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderingEventUIParam]
  }
  
  extension [Self <: RenderingEventUIParam](x: Self) {
    
    inline def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
