package typings.atIonicReact.distTypesComponentsIonModalMod

import org.scalablytyped.runtime.Instantiable1
import typings.atIonicReact.Anon_Animated
import typings.atIonicReact.Anon_ChildrenReactNode
import typings.atIonicReact.atIonicReactStrings.animated
import typings.atIonicReact.atIonicReactStrings.backdropDismiss
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
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/IonModal", "IonModal")
@js.native
class IonModal protected () extends Anon_Animated {
  def this(props: (Pick[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ModalOptions<imported_core.ComponentRef> */ _, 
        id | mode | animated | backdropDismiss | cssClass | enterAnimation | keyboardClose | leaveAnimation | showBackdrop | delegate
      ]) with Anon_ChildrenReactNode with ReactOverlayProps) = this()
}

@JSImport("@ionic/react/dist/types/components/IonModal", "IonModal")
@js.native
object IonModal
  extends Instantiable1[
      /* props */ (Pick[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ModalOptions<imported_core.ComponentRef> */ _, 
        id | mode | animated | backdropDismiss | cssClass | enterAnimation | keyboardClose | leaveAnimation | showBackdrop | delegate
      ]) with Anon_ChildrenReactNode with ReactOverlayProps, 
      Anon_Animated
    ] {
  var contextType: js.UndefOr[Context[_]] = js.native
  val displayName: String = js.native
}

