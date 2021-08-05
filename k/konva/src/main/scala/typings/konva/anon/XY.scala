package typings.konva.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XY extends StObject {
  
  var x: js.Any
  
  var y: js.Any
}
object XY {
  
  inline def apply(x: js.Any, y: js.Any): XY = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XY]
  }
  
  extension [Self <: XY](x: Self) {
    
    inline def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: js.Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
