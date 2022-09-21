package typings.igniteUi

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionRenderedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the caption container.
    */
  var captionContainer: js.UndefOr[Element] = js.undefined
  
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object CaptionRenderedEventUIParam {
  
  inline def apply(): CaptionRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionRenderedEventUIParam]
  }
  
  extension [Self <: CaptionRenderedEventUIParam](x: Self) {
    
    inline def setCaptionContainer(value: Element): Self = StObject.set(x, "captionContainer", value.asInstanceOf[js.Any])
    
    inline def setCaptionContainerUndefined: Self = StObject.set(x, "captionContainer", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
