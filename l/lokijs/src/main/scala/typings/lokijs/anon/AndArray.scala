package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndArray extends StObject {
  
  @JSName("$and")
  var $and: js.Array[Any]
}
object AndArray {
  
  inline def apply($and: js.Array[Any]): AndArray = {
    val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndArray]
  }
  
  extension [Self <: AndArray](x: Self) {
    
    inline def set$and(value: js.Array[Any]): Self = StObject.set(x, "$and", value.asInstanceOf[js.Any])
    
    inline def set$andVarargs(value: Any*): Self = StObject.set(x, "$and", js.Array(value*))
  }
}
