package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Box extends StObject {
  
  var box: js.Array[Double]
  
  var offscreen: Boolean
}
object Box {
  
  inline def apply(box: js.Array[Double], offscreen: Boolean): Box = {
    val __obj = js.Dynamic.literal(box = box.asInstanceOf[js.Any], offscreen = offscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Box]
  }
  
  extension [Self <: Box](x: Self) {
    
    inline def setBox(value: js.Array[Double]): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
    
    inline def setBoxVarargs(value: Double*): Self = StObject.set(x, "box", js.Array(value*))
    
    inline def setOffscreen(value: Boolean): Self = StObject.set(x, "offscreen", value.asInstanceOf[js.Any])
  }
}
