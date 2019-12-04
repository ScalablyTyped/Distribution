package typings.atIonicCore

import typings.atIonicCore.atIonicCoreMod.ComponentProps
import typings.atIonicCore.distTypesComponentsNavNavDashInterfaceMod.NavComponent
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/nav-push/nav-push", JSImport.Namespace)
@js.native
object distTypesComponentsNavDashPushNavDashPushMod extends js.Object {
  @js.native
  class NavPush () extends ComponentInterface {
    /**
      * Component to navigate to
      */
    var component: js.UndefOr[NavComponent] = js.native
    /**
      * Data you want to pass to the component as props
      */
    var componentProps: js.UndefOr[ComponentProps[Null]] = js.native
    var el: HTMLElement = js.native
    var push: js.Any = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MNavPush(): Unit = js.native
    @JSName("render")
    def render_MNavPush(): js.Any = js.native
  }
  
}

