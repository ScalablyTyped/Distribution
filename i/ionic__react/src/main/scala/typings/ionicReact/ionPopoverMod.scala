package typings.ionicReact

import typings.ionicCore.componentsMod._Global_.HTMLIonPopoverElement
import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.popoverInterfaceMod.PopoverOptions
import typings.ionicReact.createOverlayComponentMod.ReactOverlayProps
import typings.ionicReact.ionicReactStrings.animated
import typings.ionicReact.ionicReactStrings.backdropDismiss
import typings.ionicReact.ionicReactStrings.component
import typings.ionicReact.ionicReactStrings.componentProps
import typings.ionicReact.ionicReactStrings.cssClass
import typings.ionicReact.ionicReactStrings.delegate
import typings.ionicReact.ionicReactStrings.enterAnimation
import typings.ionicReact.ionicReactStrings.event
import typings.ionicReact.ionicReactStrings.id
import typings.ionicReact.ionicReactStrings.keyboardClose
import typings.ionicReact.ionicReactStrings.leaveAnimation
import typings.ionicReact.ionicReactStrings.mode
import typings.ionicReact.ionicReactStrings.showBackdrop
import typings.ionicReact.ionicReactStrings.translucent
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Omit
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/IonPopover", JSImport.Namespace)
@js.native
object ionPopoverMod extends js.Object {
  val IonPopover: ForwardRefExoticComponent[
    AnonChildrenForwardedRefHTMLIonPopoverElement with (Pick[
      PopoverOptions[ComponentRef], 
      id | mode | animated | translucent | cssClass | backdropDismiss | keyboardClose | enterAnimation | leaveAnimation | showBackdrop | delegate | event
    ]) with ReactOverlayProps with RefAttributes[HTMLIonPopoverElement]
  ] = js.native
  type ReactPopoverOptions = (Omit[PopoverOptions[ComponentRef], component | componentProps]) with AnonChildren
}

