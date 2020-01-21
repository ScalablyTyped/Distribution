package typings.ionicReact.createOverlayComponentMod

import typings.ionicReact.AnonCreateOptions
import typings.ionicReact.AnonForwardedRefOverlayTypeRefObject
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/createOverlayComponent", "createOverlayComponent")
@js.native
object createOverlayComponent extends js.Object {
  def apply[OverlayComponent /* <: js.Object */, OverlayType /* <: OverlayElement */](displayName: String, controller: AnonCreateOptions[OverlayType]): ForwardRefExoticComponent[
    (PropsWithoutRef[
      OverlayComponent with ReactOverlayProps with AnonForwardedRefOverlayTypeRefObject[OverlayType]
    ]) with RefAttributes[OverlayType]
  ] = js.native
}

