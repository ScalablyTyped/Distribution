package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegrationAddDetails extends js.Object {
  var enableArgs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var root: java.lang.String
}

object IntegrationAddDetails {
  @scala.inline
  def apply(root: java.lang.String, enableArgs: js.Array[java.lang.String] = null): IntegrationAddDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("root")(root)
    if (enableArgs != null) __obj.updateDynamic("enableArgs")(enableArgs)
    __obj.asInstanceOf[IntegrationAddDetails]
  }
}

