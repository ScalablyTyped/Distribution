package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for BeginTransaction.
  */
trait SchemaBeginTransactionRequest extends StObject {
  
  /**
    * Required. Options for the new transaction.
    */
  var options: js.UndefOr[SchemaTransactionOptions] = js.undefined
}
object SchemaBeginTransactionRequest {
  
  inline def apply(): SchemaBeginTransactionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBeginTransactionRequest]
  }
  
  extension [Self <: SchemaBeginTransactionRequest](x: Self) {
    
    inline def setOptions(value: SchemaTransactionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
