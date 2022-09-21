package typings.hyperformula.anon

import typings.hyperformula.cellMod.SimpleCellAddress_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  var end: SimpleCellAddress_
  
  var start: SimpleCellAddress_
}
object End {
  
  inline def apply(end: SimpleCellAddress_, start: SimpleCellAddress_): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  
  extension [Self <: End](x: Self) {
    
    inline def setEnd(value: SimpleCellAddress_): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: SimpleCellAddress_): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
