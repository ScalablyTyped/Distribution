package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectIntegrations extends js.Object {
  var capacitor: js.UndefOr[ProjectIntegration] = js.undefined
  var cordova: js.UndefOr[ProjectIntegration] = js.undefined
}

object ProjectIntegrations {
  @scala.inline
  def apply(capacitor: ProjectIntegration = null, cordova: ProjectIntegration = null): ProjectIntegrations = {
    val __obj = js.Dynamic.literal()
    if (capacitor != null) __obj.updateDynamic("capacitor")(capacitor)
    if (cordova != null) __obj.updateDynamic("cordova")(cordova)
    __obj.asInstanceOf[ProjectIntegrations]
  }
}

