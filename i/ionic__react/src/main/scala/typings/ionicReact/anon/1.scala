package typings.ionicReact.anon

import typings.ionicReact.createOverlayComponentMod.OverlayElement
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1`[OverlayType /* <: OverlayElement */] extends js.Object {
  var forwardedRef: js.UndefOr[RefObject[OverlayType]] = js.undefined
}

object `1` {
  @scala.inline
  def apply[/* <: typings.ionicReact.createOverlayComponentMod.OverlayElement */ OverlayType](forwardedRef: RefObject[OverlayType] = null): `1`[OverlayType] = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`[OverlayType]]
  }
}

