package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadWrite extends StObject {
  
  /** The transaction identifier of the transaction being retried. */
  var previousTransaction: js.UndefOr[String] = js.undefined
}
object ReadWrite {
  
  inline def apply(): ReadWrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadWrite]
  }
  
  extension [Self <: ReadWrite](x: Self) {
    
    inline def setPreviousTransaction(value: String): Self = StObject.set(x, "previousTransaction", value.asInstanceOf[js.Any])
    
    inline def setPreviousTransactionUndefined: Self = StObject.set(x, "previousTransaction", js.undefined)
  }
}
