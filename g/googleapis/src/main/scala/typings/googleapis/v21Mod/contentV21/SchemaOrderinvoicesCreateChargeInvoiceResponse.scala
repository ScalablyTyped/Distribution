package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderinvoicesCreateChargeInvoiceResponse extends StObject {
  
  /**
    * The status of the execution.
    */
  var executionStatus: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#orderinvoicesCreateChargeInvoiceResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaOrderinvoicesCreateChargeInvoiceResponse {
  
  @scala.inline
  def apply(): SchemaOrderinvoicesCreateChargeInvoiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderinvoicesCreateChargeInvoiceResponse]
  }
  
  @scala.inline
  implicit class SchemaOrderinvoicesCreateChargeInvoiceResponseMutableBuilder[Self <: SchemaOrderinvoicesCreateChargeInvoiceResponse] (val x: Self) extends AnyVal {
    
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
