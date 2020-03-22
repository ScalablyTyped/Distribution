package typings.ionicReact

import typings.ionicReact.createControllerComponentMod.OverlayBase
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForwardedRef[OverlayType /* <: OverlayBase */] extends js.Object {
  var forwardedRef: js.UndefOr[RefObject[OverlayType]] = js.undefined
}

object AnonForwardedRef {
  @scala.inline
  def apply[OverlayType /* <: OverlayBase */](forwardedRef: RefObject[OverlayType] = null): AnonForwardedRef[OverlayType] = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForwardedRef[OverlayType]]
  }
}

