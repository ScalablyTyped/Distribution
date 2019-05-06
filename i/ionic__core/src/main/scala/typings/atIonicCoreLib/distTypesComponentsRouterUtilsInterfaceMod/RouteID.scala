package typings
package atIonicCoreLib.distTypesComponentsRouterUtilsInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteID extends js.Object {
  var element: js.UndefOr[stdLib.HTMLElement]
  var id: java.lang.String
  var params: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object RouteID {
  @scala.inline
  def apply(
    id: java.lang.String,
    element: stdLib.HTMLElement = null,
    params: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): RouteID = {
    val __obj = js.Dynamic.literal(id = id)
    if (element != null) __obj.updateDynamic("element")(element)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[RouteID]
  }
}

