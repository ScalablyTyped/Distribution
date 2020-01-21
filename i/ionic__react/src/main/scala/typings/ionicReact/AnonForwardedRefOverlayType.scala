package typings.ionicReact

import typings.ionicReact.createControllerComponentMod.OverlayBase
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForwardedRefOverlayType[OverlayType /* <: OverlayBase */] extends js.Object {
  var forwardedRef: js.UndefOr[RefObject[OverlayType]] = js.undefined
}

object AnonForwardedRefOverlayType {
  @scala.inline
  def apply[OverlayType /* <: OverlayBase */](forwardedRef: RefObject[OverlayType] = null): AnonForwardedRefOverlayType[OverlayType] = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForwardedRefOverlayType[OverlayType]]
  }
}

