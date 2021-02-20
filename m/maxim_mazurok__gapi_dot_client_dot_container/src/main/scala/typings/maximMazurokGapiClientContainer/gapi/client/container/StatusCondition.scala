package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusCondition extends StObject {
  
  /** Machine-friendly representation of the condition */
  var code: js.UndefOr[String] = js.native
  
  /** Human-friendly representation of the condition */
  var message: js.UndefOr[String] = js.native
}
object StatusCondition {
  
  @scala.inline
  def apply(): StatusCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusCondition]
  }
  
  @scala.inline
  implicit class StatusConditionMutableBuilder[Self <: StatusCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
