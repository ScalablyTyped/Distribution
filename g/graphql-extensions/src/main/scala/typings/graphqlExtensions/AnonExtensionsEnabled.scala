package typings.graphqlExtensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtensionsEnabled extends js.Object {
  var _extensionsEnabled: js.UndefOr[Boolean] = js.undefined
}

object AnonExtensionsEnabled {
  @scala.inline
  def apply(_extensionsEnabled: js.UndefOr[Boolean] = js.undefined): AnonExtensionsEnabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_extensionsEnabled)) __obj.updateDynamic("_extensionsEnabled")(_extensionsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtensionsEnabled]
  }
}

