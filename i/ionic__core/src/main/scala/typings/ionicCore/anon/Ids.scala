package typings.ionicCore.anon

import typings.ionicCore.interfaceMod.NavOutletElement
import typings.ionicCore.interfaceMod.RouteID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ids extends js.Object {
  var ids: js.Array[RouteID]
  var outlet: js.UndefOr[NavOutletElement] = js.undefined
}

object Ids {
  @scala.inline
  def apply(ids: js.Array[RouteID], outlet: NavOutletElement = null): Ids = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    if (outlet != null) __obj.updateDynamic("outlet")(outlet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ids]
  }
}

