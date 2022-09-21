package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBeginTransactionResponse extends StObject {
  
  /**
    * The transaction identifier (always present).
    */
  var transaction: js.UndefOr[String | Null] = js.undefined
}
object SchemaBeginTransactionResponse {
  
  inline def apply(): SchemaBeginTransactionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBeginTransactionResponse]
  }
  
  extension [Self <: SchemaBeginTransactionResponse](x: Self) {
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
