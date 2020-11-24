package typings.ionicReact.createOverlayComponentMod

import typings.ionicReact.anon.`0`
import typings.ionicReact.anon.`1`
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/react/dist/types/components/createOverlayComponent", "createOverlayComponent")
@js.native
object createOverlayComponent extends js.Object {
  
  def apply[OverlayComponent /* <: js.Object */, OverlayType /* <: OverlayElement */](displayName: String, controller: `0`[OverlayType]): ForwardRefExoticComponent[
    (PropsWithoutRef[OverlayComponent with ReactOverlayProps with `1`[OverlayType]]) with RefAttributes[OverlayType]
  ] = js.native
}
