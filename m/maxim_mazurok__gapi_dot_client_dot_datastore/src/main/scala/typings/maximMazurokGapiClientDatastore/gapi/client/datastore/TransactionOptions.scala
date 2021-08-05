package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionOptions extends StObject {
  
  /** The transaction should only allow reads. */
  var readOnly: js.UndefOr[js.Any] = js.undefined
  
  /** The transaction should allow both reads and writes. */
  var readWrite: js.UndefOr[ReadWrite] = js.undefined
}
object TransactionOptions {
  
  inline def apply(): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionOptions]
  }
  
  extension [Self <: TransactionOptions](x: Self) {
    
    inline def setReadOnly(value: js.Any): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setReadWrite(value: ReadWrite): Self = StObject.set(x, "readWrite", value.asInstanceOf[js.Any])
    
    inline def setReadWriteUndefined: Self = StObject.set(x, "readWrite", js.undefined)
  }
}
