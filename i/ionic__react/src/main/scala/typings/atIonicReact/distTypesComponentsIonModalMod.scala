package typings.atIonicReact

import org.scalablytyped.runtime.Instantiable1
import typings.atIonicCore.atIonicCoreMod.ComponentRef
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
import typings.react.reactMod.Context
import typings.std.Omit
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/IonModal", JSImport.Namespace)
@js.native
object distTypesComponentsIonModalMod extends js.Object {
  @js.native
  class IonModal protected () extends Anon_Animated {
    def this(props: (Pick[
            ModalOptions[ComponentRef], 
            id | mode | animated | showBackdrop | backdropDismiss | cssClass | delegate | keyboardClose | enterAnimation | leaveAnimation
          ]) with Anon_ChildrenReactNode with ReactOverlayProps) = this()
  }
  
  @js.native
  object IonModal extends Instantiable1[
          /* props */ (Pick[
            ModalOptions[ComponentRef], 
            id | mode | animated | showBackdrop | backdropDismiss | cssClass | delegate | keyboardClose | enterAnimation | leaveAnimation
          ]) with Anon_ChildrenReactNode with ReactOverlayProps, 
          Anon_Animated
        ] {
    var contextType: js.UndefOr[Context[_]] = js.native
    val displayName: String = js.native
  }
  
  type ReactModalOptions = (Omit[
    ModalOptions[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentRef */ _
    ], 
    component | componentProps
  ]) with Anon_ChildrenReactNode
}

