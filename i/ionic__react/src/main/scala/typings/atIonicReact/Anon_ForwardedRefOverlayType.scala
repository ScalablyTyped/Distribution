package typings.atIonicReact

import typings.atIonicReact.distTypesComponentsCreateControllerComponentMod.OverlayBase
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForwardedRefOverlayType[OverlayType /* <: OverlayBase */] extends js.Object {
  var forwardedRef: js.UndefOr[RefObject[OverlayType]] = js.undefined
}

object Anon_ForwardedRefOverlayType {
  @scala.inline
  def apply[OverlayType /* <: OverlayBase */](forwardedRef: RefObject[OverlayType] = null): Anon_ForwardedRefOverlayType[OverlayType] = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ForwardedRefOverlayType[OverlayType]]
  }
}

