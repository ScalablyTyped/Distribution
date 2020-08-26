package typings.googleapis.tpuV1Mod.tpuV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for ListNodes.
  */
@js.native
trait SchemaListNodesResponse extends js.Object {
  /**
    * The next page token or empty if none.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The listed nodes.
    */
  var nodes: js.UndefOr[js.Array[SchemaNode]] = js.native
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}

object SchemaListNodesResponse {
  @scala.inline
  def apply(): SchemaListNodesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNodesResponse]
  }
  @scala.inline
  implicit class SchemaListNodesResponseOps[Self <: SchemaListNodesResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setNodesVarargs(value: SchemaNode*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[SchemaNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = this.set("unreachable", js.Array(value :_*))
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = this.set("unreachable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnreachable: Self = this.set("unreachable", js.undefined)
  }
  
}

