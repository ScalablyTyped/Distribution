package typings
package atIonicAngularLib.distDirectivesProxiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonBackdrop")
@js.native
class IonBackdrop protected ()
  extends atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonBackdrop {
  def this(c: atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef, r: atAngularCoreLib.atAngularCoreMod.ElementRef[_], z: atAngularCoreLib.atAngularCoreMod.NgZone) = this()
  var el: stdLib.HTMLElement = js.native
  var ionBackdropTap: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  /**
    * If `true`, the backdrop will stop propagation on tap.
    */
  /* CompleteClass */
  override var stopPropagation: scala.Boolean = js.native
  /**
    * If `true`, the backdrop will can be clicked and will emit the `ionBackdropTap` event.
    */
  /* CompleteClass */
  override var tappable: scala.Boolean = js.native
  /**
    * If `true`, the backdrop will be visible.
    */
  /* CompleteClass */
  override var visible: scala.Boolean = js.native
  var z: atAngularCoreLib.atAngularCoreMod.NgZone = js.native
}

