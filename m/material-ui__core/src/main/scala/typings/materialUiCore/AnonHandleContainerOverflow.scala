package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHandleContainerOverflow extends js.Object {
  var handleContainerOverflow: js.UndefOr[Boolean] = js.native
  var hideSiblingNodes: js.UndefOr[Boolean] = js.native
}

object AnonHandleContainerOverflow {
  @scala.inline
  def apply(
    handleContainerOverflow: js.UndefOr[Boolean] = js.undefined,
    hideSiblingNodes: js.UndefOr[Boolean] = js.undefined
  ): AnonHandleContainerOverflow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(handleContainerOverflow)) __obj.updateDynamic("handleContainerOverflow")(handleContainerOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(hideSiblingNodes)) __obj.updateDynamic("hideSiblingNodes")(hideSiblingNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHandleContainerOverflow]
  }
}

