package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Previous extends StObject {
  
  var next: js.UndefOr[js.Any] = js.undefined
  
  var previous: js.UndefOr[js.Any] = js.undefined
  
  var small: js.UndefOr[Next] = js.undefined
}
object Previous {
  
  inline def apply(): Previous = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Previous]
  }
  
  extension [Self <: Previous](x: Self) {
    
    inline def setNext(value: js.Any): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setPrevious(value: js.Any): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setSmall(value: Next): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
  }
}
