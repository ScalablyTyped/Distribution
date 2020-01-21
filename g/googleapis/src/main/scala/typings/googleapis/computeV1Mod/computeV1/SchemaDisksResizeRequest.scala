package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDisksResizeRequest extends js.Object {
  /**
    * The new size of the persistent disk, which is specified in GB.
    */
  var sizeGb: js.UndefOr[String] = js.native
}

object SchemaDisksResizeRequest {
  @scala.inline
  def apply(sizeGb: String = null): SchemaDisksResizeRequest = {
    val __obj = js.Dynamic.literal()
    if (sizeGb != null) __obj.updateDynamic("sizeGb")(sizeGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDisksResizeRequest]
  }
}

