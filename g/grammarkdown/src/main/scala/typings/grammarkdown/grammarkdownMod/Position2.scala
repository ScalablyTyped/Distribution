package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Position2 extends StObject {
  
  var character: Double = js.native
  
  var line: Double = js.native
}
object Position2 {
  
  @scala.inline
  def apply(character: Double, line: Double): Position2 = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position2]
  }
  
  @scala.inline
  implicit class Position2MutableBuilder[Self <: Position2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacter(value: Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
