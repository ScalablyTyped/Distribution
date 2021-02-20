package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for beginning a new transaction.  Transactions can be created
  * explicitly with calls to Datastore.BeginTransaction or implicitly by
  * setting ReadOptions.new_transaction in read requests.
  */
@js.native
trait SchemaTransactionOptions extends StObject {
  
  /**
    * The transaction should only allow reads.
    */
  var readOnly: js.UndefOr[SchemaReadOnly] = js.native
  
  /**
    * The transaction should allow both reads and writes.
    */
  var readWrite: js.UndefOr[SchemaReadWrite] = js.native
}
object SchemaTransactionOptions {
  
  @scala.inline
  def apply(): SchemaTransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransactionOptions]
  }
  
  @scala.inline
  implicit class SchemaTransactionOptionsMutableBuilder[Self <: SchemaTransactionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadOnly(value: SchemaReadOnly): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setReadWrite(value: SchemaReadWrite): Self = StObject.set(x, "readWrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadWriteUndefined: Self = StObject.set(x, "readWrite", js.undefined)
  }
}
