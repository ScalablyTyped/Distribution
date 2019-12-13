package typings.atIonicReact

import typings.atIonicReact.distTypesComponentsCreateOverlayComponentMod.OverlayElement
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForwardedRefOverlayTypeRefObject[OverlayType /* <: OverlayElement */] extends js.Object {
  var forwardedRef: js.UndefOr[RefObject[OverlayType]] = js.undefined
}

object Anon_ForwardedRefOverlayTypeRefObject {
  @scala.inline
  def apply[OverlayType /* <: OverlayElement */](forwardedRef: RefObject[OverlayType] = null): Anon_ForwardedRefOverlayTypeRefObject[OverlayType] = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ForwardedRefOverlayTypeRefObject[OverlayType]]
  }
}

