package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var end: js.UndefOr[String] = js.undefined
  
  var fromLoc: js.UndefOr[Station | Stop | Location] = js.undefined
  
  var sections: js.UndefOr[js.Array[String]] = js.undefined
  
  var start: js.UndefOr[String] = js.undefined
  
  var toLoc: js.UndefOr[Station | Stop | Location] = js.undefined
}
object Event {
  
  inline def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setFromLoc(value: Station | Stop | Location): Self = StObject.set(x, "fromLoc", value.asInstanceOf[js.Any])
    
    inline def setFromLocUndefined: Self = StObject.set(x, "fromLoc", js.undefined)
    
    inline def setSections(value: js.Array[String]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    inline def setSectionsVarargs(value: String*): Self = StObject.set(x, "sections", js.Array(value*))
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setToLoc(value: Station | Stop | Location): Self = StObject.set(x, "toLoc", value.asInstanceOf[js.Any])
    
    inline def setToLocUndefined: Self = StObject.set(x, "toLoc", js.undefined)
  }
}
