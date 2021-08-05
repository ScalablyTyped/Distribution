package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Thickness extends StObject {
  
  var color: js.UndefOr[String | Transform] = js.undefined
  
  var thickness: js.UndefOr[String | Transform] = js.undefined
  
  var x: js.UndefOr[String] = js.undefined
  
  var y: js.UndefOr[String] = js.undefined
}
object Thickness {
  
  inline def apply(): Thickness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thickness]
  }
  
  extension [Self <: Thickness](x: Self) {
    
    inline def setColor(value: String | Transform): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setThickness(value: String | Transform): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
