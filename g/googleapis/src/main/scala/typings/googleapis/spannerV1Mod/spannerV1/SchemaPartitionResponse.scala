package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for PartitionQuery or PartitionRead
  */
trait SchemaPartitionResponse extends StObject {
  
  /**
    * Partitions created by this request.
    */
  var partitions: js.UndefOr[js.Array[SchemaPartition]] = js.undefined
  
  /**
    * Transaction created by this request.
    */
  var transaction: js.UndefOr[SchemaTransaction] = js.undefined
}
object SchemaPartitionResponse {
  
  @scala.inline
  def apply(): SchemaPartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartitionResponse]
  }
  
  @scala.inline
  implicit class SchemaPartitionResponseMutableBuilder[Self <: SchemaPartitionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartitions(value: js.Array[SchemaPartition]): Self = StObject.set(x, "partitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionsUndefined: Self = StObject.set(x, "partitions", js.undefined)
    
    @scala.inline
    def setPartitionsVarargs(value: SchemaPartition*): Self = StObject.set(x, "partitions", js.Array(value :_*))
    
    @scala.inline
    def setTransaction(value: SchemaTransaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
