package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadWrite extends StObject {
  
  /** The transaction identifier of the transaction being retried. */
  var previousTransaction: js.UndefOr[String] = js.native
}
object ReadWrite {
  
  @scala.inline
  def apply(): ReadWrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadWrite]
  }
  
  @scala.inline
  implicit class ReadWriteMutableBuilder[Self <: ReadWrite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviousTransaction(value: String): Self = StObject.set(x, "previousTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousTransactionUndefined: Self = StObject.set(x, "previousTransaction", js.undefined)
  }
}
