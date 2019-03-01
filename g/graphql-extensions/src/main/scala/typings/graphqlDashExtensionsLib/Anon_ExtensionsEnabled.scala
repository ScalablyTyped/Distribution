package typings
package graphqlDashExtensionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtensionsEnabled extends js.Object {
  var _extensionsEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ExtensionsEnabled {
  @scala.inline
  def apply(_extensionsEnabled: js.UndefOr[scala.Boolean] = js.undefined): Anon_ExtensionsEnabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_extensionsEnabled)) __obj.updateDynamic("_extensionsEnabled")(_extensionsEnabled)
    __obj.asInstanceOf[Anon_ExtensionsEnabled]
  }
}

