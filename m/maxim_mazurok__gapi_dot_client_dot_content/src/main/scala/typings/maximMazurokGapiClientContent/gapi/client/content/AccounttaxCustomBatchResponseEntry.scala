package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccounttaxCustomBatchResponseEntry extends StObject {
  
  /** The retrieved or updated account tax settings. */
  var accountTax: js.UndefOr[AccountTax] = js.undefined
  
  /** The ID of the request entry this entry responds to. */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /** A list of errors for failed custombatch entries. *Note:* Schema errors fail the whole request. */
  var errors: js.UndefOr[Errors] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#accounttaxCustomBatchResponseEntry`" */
  var kind: js.UndefOr[String] = js.undefined
}
object AccounttaxCustomBatchResponseEntry {
  
  inline def apply(): AccounttaxCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccounttaxCustomBatchResponseEntry]
  }
  
  extension [Self <: AccounttaxCustomBatchResponseEntry](x: Self) {
    
    inline def setAccountTax(value: AccountTax): Self = StObject.set(x, "accountTax", value.asInstanceOf[js.Any])
    
    inline def setAccountTaxUndefined: Self = StObject.set(x, "accountTax", js.undefined)
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
