package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderinvoicesCreateChargeInvoiceResponse extends StObject {
  
  /**
    * The status of the execution.
    */
  var executionStatus: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#orderinvoicesCreateChargeInvoiceResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaOrderinvoicesCreateChargeInvoiceResponse {
  
  inline def apply(): SchemaOrderinvoicesCreateChargeInvoiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderinvoicesCreateChargeInvoiceResponse]
  }
  
  extension [Self <: SchemaOrderinvoicesCreateChargeInvoiceResponse](x: Self) {
    
    inline def setExecutionStatus(value: String): Self = StObject.set(x, "executionStatus", value.asInstanceOf[js.Any])
    
    inline def setExecutionStatusUndefined: Self = StObject.set(x, "executionStatus", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
