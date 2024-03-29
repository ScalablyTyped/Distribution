package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outline extends StObject {
  
  var border: js.UndefOr[`5`] = js.undefined
  
  var outline: js.UndefOr[ColorSize] = js.undefined
  
  var shadow: js.UndefOr[String | ColorSize] = js.undefined
}
object Outline {
  
  inline def apply(): Outline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Outline] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: `5`): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setOutline(value: ColorSize): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setShadow(value: String | ColorSize): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
  }
}
