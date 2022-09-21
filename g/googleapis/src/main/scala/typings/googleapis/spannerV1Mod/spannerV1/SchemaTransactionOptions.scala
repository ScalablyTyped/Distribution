package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTransactionOptions extends StObject {
  
  /**
    * Partitioned DML transaction. Authorization to begin a Partitioned DML transaction requires `spanner.databases.beginPartitionedDmlTransaction` permission on the `session` resource.
    */
  var partitionedDml: js.UndefOr[SchemaPartitionedDml] = js.undefined
  
  /**
    * Transaction will not write. Authorization to begin a read-only transaction requires `spanner.databases.beginReadOnlyTransaction` permission on the `session` resource.
    */
  var readOnly: js.UndefOr[SchemaReadOnly] = js.undefined
  
  /**
    * Transaction may write. Authorization to begin a read-write transaction requires `spanner.databases.beginOrRollbackReadWriteTransaction` permission on the `session` resource.
    */
  var readWrite: js.UndefOr[SchemaReadWrite] = js.undefined
}
object SchemaTransactionOptions {
  
  inline def apply(): SchemaTransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransactionOptions]
  }
  
  extension [Self <: SchemaTransactionOptions](x: Self) {
    
    inline def setPartitionedDml(value: SchemaPartitionedDml): Self = StObject.set(x, "partitionedDml", value.asInstanceOf[js.Any])
    
    inline def setPartitionedDmlUndefined: Self = StObject.set(x, "partitionedDml", js.undefined)
    
    inline def setReadOnly(value: SchemaReadOnly): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setReadWrite(value: SchemaReadWrite): Self = StObject.set(x, "readWrite", value.asInstanceOf[js.Any])
    
    inline def setReadWriteUndefined: Self = StObject.set(x, "readWrite", js.undefined)
  }
}
