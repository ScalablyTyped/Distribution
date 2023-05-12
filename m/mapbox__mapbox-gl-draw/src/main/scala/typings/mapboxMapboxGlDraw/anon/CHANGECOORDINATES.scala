package typings.mapboxMapboxGlDraw.anon

import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.change_coordinates
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.move
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CHANGECOORDINATES extends StObject {
  
  var CHANGE_COORDINATES: change_coordinates
  
  var MOVE: move
}
object CHANGECOORDINATES {
  
  inline def apply(): CHANGECOORDINATES = {
    val __obj = js.Dynamic.literal(CHANGE_COORDINATES = "change_coordinates", MOVE = "move")
    __obj.asInstanceOf[CHANGECOORDINATES]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CHANGECOORDINATES] (val x: Self) extends AnyVal {
    
    inline def setCHANGE_COORDINATES(value: change_coordinates): Self = StObject.set(x, "CHANGE_COORDINATES", value.asInstanceOf[js.Any])
    
    inline def setMOVE(value: move): Self = StObject.set(x, "MOVE", value.asInstanceOf[js.Any])
  }
}
