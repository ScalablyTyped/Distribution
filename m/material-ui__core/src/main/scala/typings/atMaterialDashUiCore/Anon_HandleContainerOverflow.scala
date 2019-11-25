package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandleContainerOverflow extends js.Object {
  var handleContainerOverflow: js.UndefOr[Boolean] = js.undefined
  var hideSiblingNodes: js.UndefOr[Boolean] = js.undefined
}

object Anon_HandleContainerOverflow {
  @scala.inline
  def apply(
    handleContainerOverflow: js.UndefOr[Boolean] = js.undefined,
    hideSiblingNodes: js.UndefOr[Boolean] = js.undefined
  ): Anon_HandleContainerOverflow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(handleContainerOverflow)) __obj.updateDynamic("handleContainerOverflow")(handleContainerOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(hideSiblingNodes)) __obj.updateDynamic("hideSiblingNodes")(hideSiblingNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HandleContainerOverflow]
  }
}

