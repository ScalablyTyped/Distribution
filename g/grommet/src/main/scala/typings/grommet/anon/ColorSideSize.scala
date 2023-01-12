package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSideSize extends StObject {
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var side: String
  
  var size: String
}
object ColorSideSize {
  
  inline def apply(side: String, size: String): ColorSideSize = {
    val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSideSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorSideSize] (val x: Self) extends AnyVal {
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
