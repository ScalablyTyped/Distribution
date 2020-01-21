package typings.ionicReact

import typings.ionicCore.componentsMod._Global_.HTMLIonModalElement
import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.modalInterfaceMod.ModalOptions
import typings.ionicReact.createOverlayComponentMod.ReactOverlayProps
import typings.ionicReact.ionicReactStrings.animated
import typings.ionicReact.ionicReactStrings.backdropDismiss
import typings.ionicReact.ionicReactStrings.component
import typings.ionicReact.ionicReactStrings.componentProps
import typings.ionicReact.ionicReactStrings.cssClass
import typings.ionicReact.ionicReactStrings.delegate
import typings.ionicReact.ionicReactStrings.enterAnimation
import typings.ionicReact.ionicReactStrings.id
import typings.ionicReact.ionicReactStrings.keyboardClose
import typings.ionicReact.ionicReactStrings.leaveAnimation
import typings.ionicReact.ionicReactStrings.mode
import typings.ionicReact.ionicReactStrings.showBackdrop
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Omit
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/IonModal", JSImport.Namespace)
@js.native
object ionModalMod extends js.Object {
  val IonModal: ForwardRefExoticComponent[
    AnonChildrenForwardedRef with (Pick[
      ModalOptions[ComponentRef], 
      id | mode | animated | cssClass | backdropDismiss | keyboardClose | enterAnimation | leaveAnimation | showBackdrop | delegate
    ]) with ReactOverlayProps with RefAttributes[HTMLIonModalElement]
  ] = js.native
  type ReactModalOptions = (Omit[ModalOptions[ComponentRef], component | componentProps]) with AnonChildren
}

