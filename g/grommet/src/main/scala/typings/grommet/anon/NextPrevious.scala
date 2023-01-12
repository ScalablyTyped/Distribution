package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextPrevious extends StObject {
  
  var next: js.UndefOr[Any] = js.undefined
  
  var previous: js.UndefOr[Any] = js.undefined
  
  var small: js.UndefOr[Previous] = js.undefined
}
object NextPrevious {
  
  inline def apply(): NextPrevious = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NextPrevious]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NextPrevious] (val x: Self) extends AnyVal {
    
    inline def setNext(value: Any): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setPrevious(value: Any): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setSmall(value: Previous): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
  }
}
