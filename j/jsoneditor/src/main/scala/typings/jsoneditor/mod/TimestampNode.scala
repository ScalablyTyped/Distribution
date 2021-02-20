package typings.jsoneditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimestampNode extends StObject {
  
  var field: String = js.native
  
  var path: js.Array[String] = js.native
  
  var value: String = js.native
}
object TimestampNode {
  
  @scala.inline
  def apply(field: String, path: js.Array[String], value: String): TimestampNode = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestampNode]
  }
  
  @scala.inline
  implicit class TimestampNodeMutableBuilder[Self <: TimestampNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
