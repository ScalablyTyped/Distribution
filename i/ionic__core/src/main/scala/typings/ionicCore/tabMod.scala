package typings.ionicCore

import typings.ionicCore.componentsMod._Global_.HTMLIonTabElement
import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.mod.FrameworkDelegate
import typings.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/tab/tab", JSImport.Namespace)
@js.native
object tabMod extends js.Object {
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

