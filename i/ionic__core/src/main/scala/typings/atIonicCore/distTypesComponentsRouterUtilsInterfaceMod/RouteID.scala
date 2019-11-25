package typings.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteID extends js.Object {
  var element: js.UndefOr[HTMLElement] = js.undefined
  var id: String
  var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object RouteID {
  @scala.inline
  def apply(id: String, element: HTMLElement = null, params: StringDictionary[js.Any] = null): RouteID = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteID]
  }
}

