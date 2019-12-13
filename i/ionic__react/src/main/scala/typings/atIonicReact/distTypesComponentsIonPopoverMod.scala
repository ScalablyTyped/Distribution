package typings.atIonicReact

import typings.atIonicCore.atIonicCoreMod.ComponentRef
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonPopoverElement
import typings.atIonicCore.distTypesComponentsPopoverPopoverDashInterfaceMod.PopoverOptions
import typings.atIonicReact.atIonicReactStrings.animated
import typings.atIonicReact.atIonicReactStrings.backdropDismiss
import typings.atIonicReact.atIonicReactStrings.component
import typings.atIonicReact.atIonicReactStrings.componentProps
import typings.atIonicReact.atIonicReactStrings.cssClass
import typings.atIonicReact.atIonicReactStrings.delegate
import typings.atIonicReact.atIonicReactStrings.enterAnimation
import typings.atIonicReact.atIonicReactStrings.event
import typings.atIonicReact.atIonicReactStrings.id
import typings.atIonicReact.atIonicReactStrings.keyboardClose
import typings.atIonicReact.atIonicReactStrings.leaveAnimation
import typings.atIonicReact.atIonicReactStrings.mode
import typings.atIonicReact.atIonicReactStrings.showBackdrop
import typings.atIonicReact.atIonicReactStrings.translucent
import typings.atIonicReact.distTypesComponentsCreateOverlayComponentMod.ReactOverlayProps
import typings.react.reactMod.ForwardRefExoticComponent
import typings.react.reactMod.RefAttributes
import typings.std.Omit
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/IonPopover", JSImport.Namespace)
@js.native
object distTypesComponentsIonPopoverMod extends js.Object {
  val IonPopover: ForwardRefExoticComponent[
    Anon_ChildrenForwardedRefHTMLIonPopoverElement with (Pick[
      PopoverOptions[ComponentRef], 
      id | mode | animated | translucent | cssClass | backdropDismiss | keyboardClose | enterAnimation | leaveAnimation | showBackdrop | delegate | event
    ]) with ReactOverlayProps with RefAttributes[HTMLIonPopoverElement]
  ] = js.native
  type ReactPopoverOptions = (Omit[PopoverOptions[ComponentRef], component | componentProps]) with Anon_Children
}

