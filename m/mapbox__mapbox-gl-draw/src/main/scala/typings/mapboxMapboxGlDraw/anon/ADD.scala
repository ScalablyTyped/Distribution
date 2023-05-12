package typings.mapboxMapboxGlDraw.anon

import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.add
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.drag
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.move
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.none
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.pointer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ADD extends StObject {
  
  var ADD: add
  
  var DRAG: drag
  
  var MOVE: move
  
  var NONE: none
  
  var POINTER: pointer
}
object ADD {
  
  inline def apply(): ADD = {
    val __obj = js.Dynamic.literal(ADD = "add", DRAG = "drag", MOVE = "move", NONE = "none", POINTER = "pointer")
    __obj.asInstanceOf[ADD]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ADD] (val x: Self) extends AnyVal {
    
    inline def setADD(value: add): Self = StObject.set(x, "ADD", value.asInstanceOf[js.Any])
    
    inline def setDRAG(value: drag): Self = StObject.set(x, "DRAG", value.asInstanceOf[js.Any])
    
    inline def setMOVE(value: move): Self = StObject.set(x, "MOVE", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: none): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    inline def setPOINTER(value: pointer): Self = StObject.set(x, "POINTER", value.asInstanceOf[js.Any])
  }
}
