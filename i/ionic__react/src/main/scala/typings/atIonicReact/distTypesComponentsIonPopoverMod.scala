package typings.atIonicReact

import org.scalablytyped.runtime.Instantiable1
import typings.atIonicCore.distTypesComponentsPopoverPopoverDashInterfaceMod.PopoverOptions
import typings.atIonicCore.distTypesInterfaceMod.ComponentRef
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
import typings.react.reactMod.Context
import typings.std.Omit
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/IonPopover", JSImport.Namespace)
@js.native
object distTypesComponentsIonPopoverMod extends js.Object {
  @js.native
  class IonPopover protected () extends Anon_AnimatedBackdropDismiss {
    def this(props: (Pick[
            PopoverOptions[ComponentRef], 
            id | mode | animated | translucent | showBackdrop | backdropDismiss | cssClass | delegate | keyboardClose | enterAnimation | leaveAnimation | event
          ]) with Anon_ChildrenReactNode with ReactOverlayProps) = this()
  }
  
  @js.native
  object IonPopover extends Instantiable1[
          /* props */ (Pick[
            PopoverOptions[ComponentRef], 
            id | mode | animated | translucent | showBackdrop | backdropDismiss | cssClass | delegate | keyboardClose | enterAnimation | leaveAnimation | event
          ]) with Anon_ChildrenReactNode with ReactOverlayProps, 
          Anon_AnimatedBackdropDismiss
        ] {
    var contextType: js.UndefOr[Context[_]] = js.native
    val displayName: String = js.native
  }
  
  type ReactPopoverOptions = (Omit[PopoverOptions[ComponentRef], component | componentProps]) with Anon_ChildrenReactNode
}

