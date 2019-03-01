package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlsParam extends js.Object {
  var controls: scala.Boolean
}

object ControlsParam {
  @scala.inline
  def apply(controls: scala.Boolean): ControlsParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("controls")(controls)
    __obj.asInstanceOf[ControlsParam]
  }
}

