package typings
package atIonicCliDashFrameworkLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceLocateOptions extends js.Object {
  var useAliases: js.UndefOr[scala.Boolean] = js.undefined
}

object NamespaceLocateOptions {
  @scala.inline
  def apply(useAliases: js.UndefOr[scala.Boolean] = js.undefined): NamespaceLocateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useAliases)) __obj.updateDynamic("useAliases")(useAliases)
    __obj.asInstanceOf[NamespaceLocateOptions]
  }
}

