package typings.atIonicReact.distTypesComponentsCreateOverlayComponentMod

import typings.atIonicReact.Anon_CreateOptions
import typings.atIonicReact.Anon_ForwardedRefOverlayTypeRefObject
import typings.react.reactMod.ForwardRefExoticComponent
import typings.react.reactMod.PropsWithoutRef
import typings.react.reactMod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/createOverlayComponent", "createOverlayComponent")
@js.native
object createOverlayComponent extends js.Object {
  def apply[OverlayComponent /* <: js.Object */, OverlayType /* <: OverlayElement */](displayName: String, controller: Anon_CreateOptions[OverlayType]): ForwardRefExoticComponent[
    (PropsWithoutRef[
      OverlayComponent with ReactOverlayProps with Anon_ForwardedRefOverlayTypeRefObject[OverlayType]
    ]) with RefAttributes[OverlayType]
  ] = js.native
}

