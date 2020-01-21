package typings.ionicReact.createControllerComponentMod

import typings.ionicReact.AnonCreate
import typings.ionicReact.AnonForwardedRefOverlayType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/createControllerComponent", "createControllerComponent")
@js.native
object createControllerComponent extends js.Object {
  def apply[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */](displayName: String, controller: AnonCreate[OptionsType, OverlayType]): ForwardRefExoticComponent[
    (PropsWithoutRef[
      OptionsType with ReactControllerProps with AnonForwardedRefOverlayType[OverlayType]
    ]) with RefAttributes[OverlayType]
  ] = js.native
}

