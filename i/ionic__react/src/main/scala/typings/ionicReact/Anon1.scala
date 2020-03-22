package typings.ionicReact

import typings.ionicReact.createOverlayComponentMod.OverlayElement
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1[OverlayType /* <: OverlayElement */] extends js.Object {
  var forwardedRef: js.UndefOr[RefObject[OverlayType]] = js.undefined
}

object Anon1 {
  @scala.inline
  def apply[OverlayType /* <: OverlayElement */](forwardedRef: RefObject[OverlayType] = null): Anon1[OverlayType] = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1[OverlayType]]
  }
}

