package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTransactionOptions extends StObject {
  
  /**
    * The transaction can only be used for read operations.
    */
  var readOnly: js.UndefOr[SchemaReadOnly] = js.undefined
  
  /**
    * The transaction can be used for both read and write operations.
    */
  var readWrite: js.UndefOr[SchemaReadWrite] = js.undefined
}
object SchemaTransactionOptions {
  
  inline def apply(): SchemaTransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransactionOptions]
  }
  
  extension [Self <: SchemaTransactionOptions](x: Self) {
    
    inline def setReadOnly(value: SchemaReadOnly): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setReadWrite(value: SchemaReadWrite): Self = StObject.set(x, "readWrite", value.asInstanceOf[js.Any])
    
    inline def setReadWriteUndefined: Self = StObject.set(x, "readWrite", js.undefined)
  }
}
