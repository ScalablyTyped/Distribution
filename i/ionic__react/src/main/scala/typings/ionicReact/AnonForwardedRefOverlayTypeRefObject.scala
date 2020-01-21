package typings.ionicReact

import typings.ionicReact.createOverlayComponentMod.OverlayElement
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForwardedRefOverlayTypeRefObject[OverlayType /* <: OverlayElement */] extends js.Object {
  var forwardedRef: js.UndefOr[RefObject[OverlayType]] = js.undefined
}

object AnonForwardedRefOverlayTypeRefObject {
  @scala.inline
  def apply[OverlayType /* <: OverlayElement */](forwardedRef: RefObject[OverlayType] = null): AnonForwardedRefOverlayTypeRefObject[OverlayType] = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForwardedRefOverlayTypeRefObject[OverlayType]]
  }
}

