package typings.lokijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionChange extends StObject {
  
  var name: String = js.native
  
  var obj: js.Any = js.native
  
  var operation: String = js.native
}
object CollectionChange {
  
  @scala.inline
  def apply(name: String, obj: js.Any, operation: String): CollectionChange = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionChange]
  }
  
  @scala.inline
  implicit class CollectionChangeMutableBuilder[Self <: CollectionChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObj(value: js.Any): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
