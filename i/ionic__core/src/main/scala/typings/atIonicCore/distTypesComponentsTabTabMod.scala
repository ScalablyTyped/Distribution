package typings.atIonicCore

import typings.atIonicCore.atIonicCoreMod.ComponentRef
import typings.atIonicCore.atIonicCoreMod.FrameworkDelegate
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonTabElement
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/tab/tab", JSImport.Namespace)
@js.native
object distTypesComponentsTabTabMod extends js.Object {
  @js.native
  class Tab () extends ComponentInterface {
    /** @internal */
    var active: Boolean = js.native
    /**
      * The component to display inside of the tab.
      */
    var component: js.UndefOr[ComponentRef] = js.native
    /** @internal */
    var delegate: js.UndefOr[FrameworkDelegate] = js.native
    var el: HTMLIonTabElement = js.native
    var loaded: js.Any = js.native
    var prepareLazyLoaded: js.Any = js.native
    /**
      * A tab id must be provided for each `ion-tab`. It's used internally to reference
      * the selected tab or by the router to switch between them.
      */
    var tab: String = js.native
    @JSName("componentWillLoad")
    def componentWillLoad_MTab(): Unit = js.native
    @JSName("render")
    def render_MTab(): js.Any = js.native
    /** Set the active component for the tab */
    def setActive(): js.Promise[Unit] = js.native
  }
  
}

