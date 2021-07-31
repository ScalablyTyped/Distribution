package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndArray extends StObject {
  
  @JSName("$and")
  var $and: js.Array[js.Any]
}
object AndArray {
  
  @scala.inline
  def apply($and: js.Array[js.Any]): AndArray = {
    val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndArray]
  }
  
  @scala.inline
  implicit class AndArrayMutableBuilder[Self <: AndArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$and(value: js.Array[js.Any]): Self = StObject.set(x, "$and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$andVarargs(value: js.Any*): Self = StObject.set(x, "$and", js.Array(value :_*))
  }
}
