package typings.atIonicReact.distTypesComponentsCreateControllerComponentMod

import typings.atIonicReact.Anon_Create
import typings.atIonicReact.Anon_ForwardedRefOverlayType
import typings.react.reactMod.ForwardRefExoticComponent
import typings.react.reactMod.PropsWithoutRef
import typings.react.reactMod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/createControllerComponent", "createControllerComponent")
@js.native
object createControllerComponent extends js.Object {
  def apply[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */](displayName: String, controller: Anon_Create[OptionsType, OverlayType]): ForwardRefExoticComponent[
    (PropsWithoutRef[
      OptionsType with ReactControllerProps with Anon_ForwardedRefOverlayType[OverlayType]
    ]) with RefAttributes[OverlayType]
  ] = js.native
}

