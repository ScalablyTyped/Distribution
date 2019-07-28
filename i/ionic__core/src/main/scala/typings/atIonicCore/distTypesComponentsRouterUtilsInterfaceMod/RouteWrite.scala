package typings.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteWrite extends js.Object {
  var changed: Boolean
  var element: js.UndefOr[HTMLElement] = js.undefined
  var markVisible: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
}

object RouteWrite {
  @scala.inline
  def apply(changed: Boolean, element: HTMLElement = null, markVisible: () => Unit | js.Promise[Unit] = null): RouteWrite = {
    val __obj = js.Dynamic.literal(changed = changed)
    if (element != null) __obj.updateDynamic("element")(element)
    if (markVisible != null) __obj.updateDynamic("markVisible")(js.Any.fromFunction0(markVisible))
    __obj.asInstanceOf[RouteWrite]
  }
}

