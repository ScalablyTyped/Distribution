package typings.atIonicReact.atIonicReactMod

import org.scalablytyped.runtime.Instantiable1
import typings.atIonicReact.Anon_AnimatedBackdropDismiss
import typings.atIonicReact.Anon_ChildrenReactNode
import typings.atIonicReact.atIonicReactStrings.animated
import typings.atIonicReact.atIonicReactStrings.backdropDismiss
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
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react", "IonPopover")
@js.native
class IonPopover protected () extends Anon_AnimatedBackdropDismiss {
  def this(props: (Pick[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PopoverOptions<imported_core.ComponentRef> */ _, 
        id | mode | animated | translucent | showBackdrop | backdropDismiss | cssClass | delegate | keyboardClose | enterAnimation | leaveAnimation | event
      ]) with Anon_ChildrenReactNode with ReactOverlayProps) = this()
}

@JSImport("@ionic/react", "IonPopover")
@js.native
object IonPopover
  extends Instantiable1[
      /* props */ (Pick[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PopoverOptions<imported_core.ComponentRef> */ _, 
        id | mode | animated | translucent | showBackdrop | backdropDismiss | cssClass | delegate | keyboardClose | enterAnimation | leaveAnimation | event
      ]) with Anon_ChildrenReactNode with ReactOverlayProps, 
      Anon_AnimatedBackdropDismiss
    ] {
  var contextType: js.UndefOr[Context[_]] = js.native
  val displayName: String = js.native
}

