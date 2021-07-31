package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range2 extends StObject {
  
  var end: Position2
  
  var start: Position2
}
object Range2 {
  
  @scala.inline
  def apply(end: Position2, start: Position2): Range2 = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range2]
  }
  
  @scala.inline
  implicit class Range2MutableBuilder[Self <: Range2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Position2): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Position2): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
