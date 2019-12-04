package typings.atIonicCore

import typings.atIonicCore.atIonicCoreStrings.bottom
import typings.atIonicCore.atIonicCoreStrings.end
import typings.atIonicCore.atIonicCoreStrings.start
import typings.atIonicCore.atIonicCoreStrings.top
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonFabElement
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/fab-list/fab-list", JSImport.Namespace)
@js.native
object distTypesComponentsFabDashListFabDashListMod extends js.Object {
  @js.native
  class FabList () extends ComponentInterface {
    /**
      * If `true`, the fab list will show all fab buttons in the list.
      */
    var activated: Boolean = js.native
    var el: HTMLIonFabElement = js.native
    /**
      * The side the fab list will show on relative to the main fab button.
      */
    var side: start | end | top | bottom = js.native
    /* protected */ def activatedChanged(activated: Boolean): Unit = js.native
    @JSName("render")
    def render_MFabList(): js.Any = js.native
  }
  
}

