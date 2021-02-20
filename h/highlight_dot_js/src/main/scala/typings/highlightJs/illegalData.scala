package typings.highlightJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait illegalData extends StObject {
  
  var context: String = js.native
  
  var mode: CompiledMode = js.native
  
  var msg: String = js.native
}
object illegalData {
  
  @scala.inline
  def apply(context: String, mode: CompiledMode, msg: String): illegalData = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[illegalData]
  }
  
  @scala.inline
  implicit class illegalDataMutableBuilder[Self <: illegalData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: CompiledMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
  }
}
