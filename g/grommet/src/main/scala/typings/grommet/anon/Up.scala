package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Up extends StObject {
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var down: js.UndefOr[Any] = js.undefined
  
  var up: js.UndefOr[Any] = js.undefined
}
object Up {
  
  inline def apply(): Up = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Up]
  }
  
  extension [Self <: Up](x: Self) {
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDown(value: Any): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    inline def setUp(value: Any): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
  }
}
