package typings.grommet.anon

import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.strong
import typings.grommet.grommetStrings.weak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorOpacity extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[weak | medium | strong | Boolean | Double] = js.undefined
}
object ColorOpacity {
  
  inline def apply(): ColorOpacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorOpacity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorOpacity] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setOpacity(value: weak | medium | strong | Boolean | Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
