package typings.graphqlDashExtensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtensionsEnabledBoolean extends js.Object {
  var _extensionsEnabled: js.UndefOr[Boolean] = js.undefined
}

object Anon_ExtensionsEnabledBoolean {
  @scala.inline
  def apply(_extensionsEnabled: js.UndefOr[Boolean] = js.undefined): Anon_ExtensionsEnabledBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_extensionsEnabled)) __obj.updateDynamic("_extensionsEnabled")(_extensionsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExtensionsEnabledBoolean]
  }
}

