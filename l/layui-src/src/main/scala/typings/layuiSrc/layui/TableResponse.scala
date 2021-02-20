package typings.layuiSrc.layui

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableResponse
  extends /* propName */ StringDictionary[js.Any] {
  
  var code: Double = js.native
  
  var count: Double = js.native
  
  var data: js.Any = js.native
  
  var msg: String = js.native
}
object TableResponse {
  
  @scala.inline
  def apply(code: Double, count: Double, data: js.Any, msg: String): TableResponse = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableResponse]
  }
  
  @scala.inline
  implicit class TableResponseMutableBuilder[Self <: TableResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
  }
}
