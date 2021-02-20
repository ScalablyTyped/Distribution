package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options shared by read requests.
  */
@js.native
trait SchemaReadOptions extends StObject {
  
  /**
    * The non-transactional read consistency to use. Cannot be set to `STRONG`
    * for global queries.
    */
  var readConsistency: js.UndefOr[String] = js.native
  
  /**
    * The identifier of the transaction in which to read. A transaction
    * identifier is returned by a call to Datastore.BeginTransaction.
    */
  var transaction: js.UndefOr[String] = js.native
}
object SchemaReadOptions {
  
  @scala.inline
  def apply(): SchemaReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadOptions]
  }
  
  @scala.inline
  implicit class SchemaReadOptionsMutableBuilder[Self <: SchemaReadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadConsistency(value: String): Self = StObject.set(x, "readConsistency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadConsistencyUndefined: Self = StObject.set(x, "readConsistency", js.undefined)
    
    @scala.inline
    def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
