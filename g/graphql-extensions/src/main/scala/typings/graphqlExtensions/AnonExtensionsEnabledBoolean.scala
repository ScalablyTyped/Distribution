package typings.graphqlExtensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtensionsEnabledBoolean extends js.Object {
  var _extensionsEnabled: js.UndefOr[Boolean] = js.undefined
}

object AnonExtensionsEnabledBoolean {
  @scala.inline
  def apply(_extensionsEnabled: js.UndefOr[Boolean] = js.undefined): AnonExtensionsEnabledBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_extensionsEnabled)) __obj.updateDynamic("_extensionsEnabled")(_extensionsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtensionsEnabledBoolean]
  }
}

