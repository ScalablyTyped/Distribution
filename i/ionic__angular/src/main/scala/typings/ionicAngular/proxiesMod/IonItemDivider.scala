package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/directives/proxies", "IonItemDivider")
@js.native
class IonItemDivider protected ()
  extends typings.ionicCore.componentsMod.Components.IonItemDivider {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  /**
    * When it's set to `true`, the item-divider will stay visible when it reaches the top of the viewport until the next `ion-item-divider` replaces it.  This feature relies in `position:sticky`: https://caniuse.com/#feat=css-sticky
    */
  /* CompleteClass */
  override var sticky: Boolean = js.native
  var z: NgZone = js.native
}

