package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectIntegration extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object ProjectIntegration {
  @scala.inline
  def apply(enabled: js.UndefOr[scala.Boolean] = js.undefined, root: java.lang.String = null): ProjectIntegration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[ProjectIntegration]
  }
}

