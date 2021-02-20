package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageResult extends Result {
  
  var trace: Trace = js.native
  
  var values: js.Any = js.native
}
object MessageResult {
  
  @scala.inline
  def apply(trace: Trace, `type`: String, values: js.Any): MessageResult = {
    val __obj = js.Dynamic.literal(trace = trace.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageResult]
  }
  
  @scala.inline
  implicit class MessageResultMutableBuilder[Self <: MessageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrace(value: Trace): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
