package typings
package intercomDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var intercomSettings: intercomDashWebLib.IntercomUnderscoreNs.IntercomSettings
}

object Window {
  @scala.inline
  def apply(intercomSettings: intercomDashWebLib.IntercomUnderscoreNs.IntercomSettings): Window = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("intercomSettings")(intercomSettings)
    __obj.asInstanceOf[Window]
  }
}

