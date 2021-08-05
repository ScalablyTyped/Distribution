package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for Datastore.BeginTransaction.
  */
trait SchemaBeginTransactionRequest extends StObject {
  
  /**
    * Options for a new transaction.
    */
  var transactionOptions: js.UndefOr[SchemaTransactionOptions] = js.undefined
}
object SchemaBeginTransactionRequest {
  
  inline def apply(): SchemaBeginTransactionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBeginTransactionRequest]
  }
  
  extension [Self <: SchemaBeginTransactionRequest](x: Self) {
    
    inline def setTransactionOptions(value: SchemaTransactionOptions): Self = StObject.set(x, "transactionOptions", value.asInstanceOf[js.Any])
    
    inline def setTransactionOptionsUndefined: Self = StObject.set(x, "transactionOptions", js.undefined)
  }
}
