package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListNodePoolsResponse is the result of ListNodePoolsRequest.
  */
@js.native
trait SchemaListNodePoolsResponse extends js.Object {
  /**
    * A list of node pools for a cluster.
    */
  var nodePools: js.UndefOr[js.Array[SchemaNodePool]] = js.native
}

object SchemaListNodePoolsResponse {
  @scala.inline
  def apply(): SchemaListNodePoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNodePoolsResponse]
  }
  @scala.inline
  implicit class SchemaListNodePoolsResponseOps[Self <: SchemaListNodePoolsResponse] (val x: Self) extends AnyVal {
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
    def setNodePoolsVarargs(value: SchemaNodePool*): Self = this.set("nodePools", js.Array(value :_*))
    @scala.inline
    def setNodePools(value: js.Array[SchemaNodePool]): Self = this.set("nodePools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodePools: Self = this.set("nodePools", js.undefined)
  }
  
}

