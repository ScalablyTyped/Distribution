package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for a transaction that can be used to read and write documents.
  */
trait SchemaReadWrite extends StObject {
  
  /**
    * An optional transaction to retry.
    */
  var retryTransaction: js.UndefOr[String] = js.undefined
}
object SchemaReadWrite {
  
  @scala.inline
  def apply(): SchemaReadWrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadWrite]
  }
  
  @scala.inline
  implicit class SchemaReadWriteMutableBuilder[Self <: SchemaReadWrite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetryTransaction(value: String): Self = StObject.set(x, "retryTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryTransactionUndefined: Self = StObject.set(x, "retryTransaction", js.undefined)
  }
}
