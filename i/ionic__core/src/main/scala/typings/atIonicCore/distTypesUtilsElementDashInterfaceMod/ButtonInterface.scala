package typings.atIonicCore.distTypesUtilsElementDashInterfaceMod

import typings.atIonicCore.atIonicCoreStrings.button
import typings.atIonicCore.atIonicCoreStrings.reset
import typings.atIonicCore.atIonicCoreStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonInterface extends js.Object {
  var disabled: Boolean
  var `type`: submit | reset | button
}

object ButtonInterface {
  @scala.inline
  def apply(disabled: Boolean, `type`: submit | reset | button): ButtonInterface = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonInterface]
  }
}

