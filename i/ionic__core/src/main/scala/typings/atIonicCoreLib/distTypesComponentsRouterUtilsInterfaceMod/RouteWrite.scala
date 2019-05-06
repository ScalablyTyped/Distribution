package typings
package atIonicCoreLib.distTypesComponentsRouterUtilsInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteWrite extends js.Object {
  var changed: scala.Boolean
  var element: js.UndefOr[stdLib.HTMLElement]
  var markVisible: js.UndefOr[js.Function0[scala.Unit | js.Promise[scala.Unit]]] = js.undefined
}

object RouteWrite {
  @scala.inline
  def apply(
    changed: scala.Boolean,
    element: stdLib.HTMLElement = null,
    markVisible: () => scala.Unit | js.Promise[scala.Unit] = null
  ): RouteWrite = {
    val __obj = js.Dynamic.literal(changed = changed)
    if (element != null) __obj.updateDynamic("element")(element)
    if (markVisible != null) __obj.updateDynamic("markVisible")(js.Any.fromFunction0(markVisible))
    __obj.asInstanceOf[RouteWrite]
  }
}

