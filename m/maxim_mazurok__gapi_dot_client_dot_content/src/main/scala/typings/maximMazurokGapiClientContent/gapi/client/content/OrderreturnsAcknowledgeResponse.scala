package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderreturnsAcknowledgeResponse extends StObject {
  
  /** The status of the execution. Acceptable values are: - "`duplicate`" - "`executed`" */
  var executionStatus: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#orderreturnsAcknowledgeResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object OrderreturnsAcknowledgeResponse {
  
  @scala.inline
  def apply(): OrderreturnsAcknowledgeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreturnsAcknowledgeResponse]
  }
  
  @scala.inline
  implicit class OrderreturnsAcknowledgeResponseMutableBuilder[Self <: OrderreturnsAcknowledgeResponse] (val x: Self) extends AnyVal {
    
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
