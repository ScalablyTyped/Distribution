package typings
package atIonicAngularLib.distDirectivesProxiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonFab")
@js.native
class IonFab protected ()
  extends atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonFab {
  def this(c: atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef, r: atAngularCoreLib.atAngularCoreMod.ElementRef[_]) = this()
  /**
    * If `true`, both the `ion-fab-button` and all `ion-fab-list` inside `ion-fab` will become active. That means `ion-fab-button` will become a `close` icon and `ion-fab-list` will become visible.
    */
  /* CompleteClass */
  override var activated: scala.Boolean = js.native
  /**
    * If `true`, the fab will display on the edge of the header if `vertical` is `"top"`, and on the edge of the footer if it is `"bottom"`. Should be used with a `fixed` slot.
    */
  /* CompleteClass */
  override var edge: scala.Boolean = js.native
  var el: stdLib.HTMLElement = js.native
  /**
    * Close an active FAB list container.
    */
  /* CompleteClass */
  override def close(): js.Promise[scala.Unit] = js.native
}

