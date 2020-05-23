package typings.ionicReact.anon

import typings.ionicReact.createControllerComponentMod.OverlayBase
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardedRef[OverlayType /* <: OverlayBase */] extends js.Object {
  var forwardedRef: js.UndefOr[RefObject[OverlayType]] = js.undefined
}

object ForwardedRef {
  @scala.inline
  def apply[OverlayType](forwardedRef: RefObject[OverlayType] = null): ForwardedRef[OverlayType] = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardedRef[OverlayType]]
  }
}

