package typings.googleapis.tpuV1Mod.tpuV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for ReimageNode.
  */
@js.native
trait SchemaReimageNodeRequest extends js.Object {
  /**
    * The version for reimage to create.
    */
  var tensorflowVersion: js.UndefOr[String] = js.native
}

object SchemaReimageNodeRequest {
  @scala.inline
  def apply(tensorflowVersion: String = null): SchemaReimageNodeRequest = {
    val __obj = js.Dynamic.literal()
    if (tensorflowVersion != null) __obj.updateDynamic("tensorflowVersion")(tensorflowVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReimageNodeRequest]
  }
}

