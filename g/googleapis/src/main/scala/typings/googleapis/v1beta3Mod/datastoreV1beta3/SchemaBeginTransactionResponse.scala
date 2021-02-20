package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for Datastore.BeginTransaction.
  */
@js.native
trait SchemaBeginTransactionResponse extends StObject {
  
  /**
    * The transaction identifier (always present).
    */
  var transaction: js.UndefOr[String] = js.native
}
object SchemaBeginTransactionResponse {
  
  @scala.inline
  def apply(): SchemaBeginTransactionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBeginTransactionResponse]
  }
  
  @scala.inline
  implicit class SchemaBeginTransactionResponseMutableBuilder[Self <: SchemaBeginTransactionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
