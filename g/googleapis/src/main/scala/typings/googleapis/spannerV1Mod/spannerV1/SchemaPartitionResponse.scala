package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for PartitionQuery or PartitionRead
  */
@js.native
trait SchemaPartitionResponse extends js.Object {
  
  /**
    * Partitions created by this request.
    */
  var partitions: js.UndefOr[js.Array[SchemaPartition]] = js.native
  
  /**
    * Transaction created by this request.
    */
  var transaction: js.UndefOr[SchemaTransaction] = js.native
}
object SchemaPartitionResponse {
  
  @scala.inline
  def apply(): SchemaPartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartitionResponse]
  }
  
  @scala.inline
  implicit class SchemaPartitionResponseOps[Self <: SchemaPartitionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPartitionsVarargs(value: SchemaPartition*): Self = this.set("partitions", js.Array(value :_*))
    
    @scala.inline
    def setPartitions(value: js.Array[SchemaPartition]): Self = this.set("partitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitions: Self = this.set("partitions", js.undefined)
    
    @scala.inline
    def setTransaction(value: SchemaTransaction): Self = this.set("transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
}
