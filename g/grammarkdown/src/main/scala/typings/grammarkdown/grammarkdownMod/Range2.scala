package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range2 extends StObject {
  
  var end: Position2
  
  var start: Position2
}
object Range2 {
  
  inline def apply(end: Position2, start: Position2): Range2 = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range2]
  }
  
  extension [Self <: Range2](x: Self) {
    
    inline def setEnd(value: Position2): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Position2): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
