package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait And extends StObject {
  
  @JSName("$and")
  var $and: js.Any = js.native
  
  @JSName("$or")
  var $or: js.Any = js.native
}
object And {
  
  @scala.inline
  def apply($and: js.Any, $or: js.Any): And = {
    val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any], $or = $or.asInstanceOf[js.Any])
    __obj.asInstanceOf[And]
  }
  
  @scala.inline
  implicit class AndMutableBuilder[Self <: And] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$and(value: js.Any): Self = StObject.set(x, "$and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$or(value: js.Any): Self = StObject.set(x, "$or", value.asInstanceOf[js.Any])
  }
}
