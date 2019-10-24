package typings.atIonicAngular.distDirectivesProxiesMod

import typings.atAngularCore.atAngularCoreMod.ChangeDetectorRef
import typings.atAngularCore.atAngularCoreMod.ElementRef
import typings.atAngularCore.atAngularCoreMod.EventEmitter
import typings.atAngularCore.atAngularCoreMod.NgZone
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonBackdrop")
@js.native
class IonBackdrop protected ()
  extends typings.atIonicCore.distTypesComponentsMod.Components.IonBackdrop {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var ionBackdropTap: EventEmitter[CustomEvent[_]] = js.native
  /**
    * If `true`, the backdrop will stop propagation on tap.
    */
  /* CompleteClass */
  override var stopPropagation: Boolean = js.native
  /**
    * If `true`, the backdrop will can be clicked and will emit the `ionBackdropTap` event.
    */
  /* CompleteClass */
  override var tappable: Boolean = js.native
  /**
    * If `true`, the backdrop will be visible.
    */
  /* CompleteClass */
  override var visible: Boolean = js.native
  var z: NgZone = js.native
}

