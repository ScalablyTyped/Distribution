package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReadWrite extends StObject {
  
  /**
    * An optional transaction to retry.
    */
  var retryTransaction: js.UndefOr[String | Null] = js.undefined
}
object SchemaReadWrite {
  
  inline def apply(): SchemaReadWrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadWrite]
  }
  
  extension [Self <: SchemaReadWrite](x: Self) {
    
    inline def setRetryTransaction(value: String): Self = StObject.set(x, "retryTransaction", value.asInstanceOf[js.Any])
    
    inline def setRetryTransactionNull: Self = StObject.set(x, "retryTransaction", null)
    
    inline def setRetryTransactionUndefined: Self = StObject.set(x, "retryTransaction", js.undefined)
  }
}
