package typings.atIonicCore

import typings.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod.NavOutletElement
import typings.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod.RouteID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ids extends js.Object {
  var ids: js.Array[RouteID]
  var outlet: js.UndefOr[NavOutletElement] = js.undefined
}

object Anon_Ids {
  @scala.inline
  def apply(ids: js.Array[RouteID], outlet: NavOutletElement = null): Anon_Ids = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    if (outlet != null) __obj.updateDynamic("outlet")(outlet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Ids]
  }
}

