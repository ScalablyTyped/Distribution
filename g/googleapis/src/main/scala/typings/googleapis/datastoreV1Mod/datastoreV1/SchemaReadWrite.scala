package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options specific to read / write transactions.
  */
trait SchemaReadWrite extends StObject {
  
  /**
    * The transaction identifier of the transaction being retried.
    */
  var previousTransaction: js.UndefOr[String] = js.undefined
}
object SchemaReadWrite {
  
  inline def apply(): SchemaReadWrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadWrite]
  }
  
  extension [Self <: SchemaReadWrite](x: Self) {
    
    inline def setPreviousTransaction(value: String): Self = StObject.set(x, "previousTransaction", value.asInstanceOf[js.Any])
    
    inline def setPreviousTransactionUndefined: Self = StObject.set(x, "previousTransaction", js.undefined)
  }
}
