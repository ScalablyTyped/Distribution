package typings.ionicCore

import typings.ionicCore.interfaceMod.NavOutletElement
import typings.ionicCore.interfaceMod.RouteID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIds extends js.Object {
  var ids: js.Array[RouteID]
  var outlet: js.UndefOr[NavOutletElement] = js.undefined
}

object AnonIds {
  @scala.inline
  def apply(ids: js.Array[RouteID], outlet: NavOutletElement = null): AnonIds = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    if (outlet != null) __obj.updateDynamic("outlet")(outlet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIds]
  }
}

