package typings.atIonicReact

import typings.atIonicCore.atIonicCoreMod.ComponentRef
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonModalElement
import typings.atIonicCore.distTypesComponentsModalModalDashInterfaceMod.ModalOptions
import typings.atIonicReact.atIonicReactStrings.animated
import typings.atIonicReact.atIonicReactStrings.backdropDismiss
import typings.atIonicReact.atIonicReactStrings.component
import typings.atIonicReact.atIonicReactStrings.componentProps
import typings.atIonicReact.atIonicReactStrings.cssClass
import typings.atIonicReact.atIonicReactStrings.delegate
import typings.atIonicReact.atIonicReactStrings.enterAnimation
import typings.atIonicReact.atIonicReactStrings.id
import typings.atIonicReact.atIonicReactStrings.keyboardClose
import typings.atIonicReact.atIonicReactStrings.leaveAnimation
import typings.atIonicReact.atIonicReactStrings.mode
import typings.atIonicReact.atIonicReactStrings.showBackdrop
import typings.atIonicReact.distTypesComponentsCreateOverlayComponentMod.ReactOverlayProps
import typings.react.reactMod.ForwardRefExoticComponent
import typings.react.reactMod.RefAttributes
import typings.std.Omit
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/IonModal", JSImport.Namespace)
@js.native
object distTypesComponentsIonModalMod extends js.Object {
  val IonModal: ForwardRefExoticComponent[
    Anon_ChildrenForwardedRef with (Pick[
      ModalOptions[ComponentRef], 
      id | mode | animated | cssClass | backdropDismiss | keyboardClose | enterAnimation | leaveAnimation | showBackdrop | delegate
    ]) with ReactOverlayProps with RefAttributes[HTMLIonModalElement]
  ] = js.native
  type ReactModalOptions = (Omit[ModalOptions[ComponentRef], component | componentProps]) with Anon_Children
}

