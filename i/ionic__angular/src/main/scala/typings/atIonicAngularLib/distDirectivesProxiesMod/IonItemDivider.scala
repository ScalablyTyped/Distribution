package typings
package atIonicAngularLib.distDirectivesProxiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonItemDivider")
@js.native
class IonItemDivider protected ()
  extends atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonItemDivider {
  def this(c: atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef, r: atAngularCoreLib.atAngularCoreMod.ElementRef[_], z: atAngularCoreLib.atAngularCoreMod.NgZone) = this()
  var el: stdLib.HTMLElement = js.native
  /**
    * When it's set to `true`, the item-divider will stay visible when it reaches the top of the viewport until the next `ion-item-divider` replaces it.  This feature relies in `position:sticky`: https://caniuse.com/#feat=css-sticky
    */
  /* CompleteClass */
  override var sticky: scala.Boolean = js.native
  var z: atAngularCoreLib.atAngularCoreMod.NgZone = js.native
}

