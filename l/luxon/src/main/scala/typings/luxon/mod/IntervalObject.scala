package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntervalObject extends StObject {
  
  var end: js.UndefOr[DateTime] = js.undefined
  
  var start: js.UndefOr[DateTime] = js.undefined
}
object IntervalObject {
  
  inline def apply(): IntervalObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntervalObject]
  }
  
  extension [Self <: IntervalObject](x: Self) {
    
    inline def setEnd(value: DateTime): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: DateTime): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
