package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position2 extends StObject {
  
  var character: Double
  
  var line: Double
}
object Position2 {
  
  inline def apply(character: Double, line: Double): Position2 = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position2]
  }
  
  extension [Self <: Position2](x: Self) {
    
    inline def setCharacter(value: Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
