package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information returned for each partition returned in a PartitionResponse.
  */
@js.native
trait SchemaPartition extends js.Object {
  
  /**
    * This token can be passed to Read, StreamingRead, ExecuteSql, or
    * ExecuteStreamingSql requests to restrict the results to those identified
    * by this partition token.
    */
  var partitionToken: js.UndefOr[String] = js.native
}
object SchemaPartition {
  
  @scala.inline
  def apply(): SchemaPartition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartition]
  }
  
  @scala.inline
  implicit class SchemaPartitionOps[Self <: SchemaPartition] (val x: Self) extends AnyVal {
    
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
    def setPartitionToken(value: String): Self = this.set("partitionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionToken: Self = this.set("partitionToken", js.undefined)
  }
}
