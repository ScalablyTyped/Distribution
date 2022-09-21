package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancel extends StObject {
  
  var cancel: String
  
  var down: String
  
  var move: String
  
  var out: String
  
  var over: String
  
  var up: String
}
object Cancel {
  
  inline def apply(cancel: String, down: String, move: String, out: String, over: String, up: String): Cancel = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], down = down.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any], over = over.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  
  extension [Self <: Cancel](x: Self) {
    
    inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setDown(value: String): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    inline def setMove(value: String): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    inline def setOver(value: String): Self = StObject.set(x, "over", value.asInstanceOf[js.Any])
    
    inline def setUp(value: String): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
  }
}
