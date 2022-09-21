package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait And extends StObject {
  
  @JSName("$and")
  var $and: Any
  
  @JSName("$or")
  var $or: Any
}
object And {
  
  inline def apply($and: Any, $or: Any): And = {
    val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any], $or = $or.asInstanceOf[js.Any])
    __obj.asInstanceOf[And]
  }
  
  extension [Self <: And](x: Self) {
    
    inline def set$and(value: Any): Self = StObject.set(x, "$and", value.asInstanceOf[js.Any])
    
    inline def set$or(value: Any): Self = StObject.set(x, "$or", value.asInstanceOf[js.Any])
  }
}
