package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountsCustomBatchResponseEntry extends StObject {
  
  /**
    * The retrieved, created, or updated account. Not defined if the method was `delete`, `claimwebsite` or `link`.
    */
  var account: js.UndefOr[SchemaAccount] = js.undefined
  
  /**
    * The ID of the request entry this entry responds to.
    */
  var batchId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A list of errors defined if and only if the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#accountsCustomBatchResponseEntry`"
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated. This field is never set. Acceptable values are: - "`active`" - "`inactive`" - "`pending`"
    */
  var linkStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountsCustomBatchResponseEntry {
  
  inline def apply(): SchemaAccountsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsCustomBatchResponseEntry]
  }
  
  extension [Self <: SchemaAccountsCustomBatchResponseEntry](x: Self) {
    
    inline def setAccount(value: SchemaAccount): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdNull: Self = StObject.set(x, "batchId", null)
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setErrors(value: SchemaErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLinkStatus(value: String): Self = StObject.set(x, "linkStatus", value.asInstanceOf[js.Any])
    
    inline def setLinkStatusNull: Self = StObject.set(x, "linkStatus", null)
    
    inline def setLinkStatusUndefined: Self = StObject.set(x, "linkStatus", js.undefined)
  }
}
