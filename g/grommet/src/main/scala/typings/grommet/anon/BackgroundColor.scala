package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColor extends StObject {
  
  var background: js.UndefOr[ColorType | `3`] = js.undefined
  
  var color: js.UndefOr[ColorType] = js.undefined
}
object BackgroundColor {
  
  inline def apply(): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundColor] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: ColorType | `3`): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
