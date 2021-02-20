package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderpaymentsNotifyAuthDeclinedResponse extends StObject {
  
  /**
    * The status of the execution.
    */
  var executionStatus: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#orderpaymentsNotifyAuthDeclinedResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaOrderpaymentsNotifyAuthDeclinedResponse {
  
  @scala.inline
  def apply(): SchemaOrderpaymentsNotifyAuthDeclinedResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderpaymentsNotifyAuthDeclinedResponse]
  }
  
  @scala.inline
  implicit class SchemaOrderpaymentsNotifyAuthDeclinedResponseMutableBuilder[Self <: SchemaOrderpaymentsNotifyAuthDeclinedResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionStatus(value: String): Self = StObject.set(x, "executionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionStatusUndefined: Self = StObject.set(x, "executionStatus", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
