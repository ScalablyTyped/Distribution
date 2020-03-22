package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.NgZone
import typings.ionicCore.mod.Side
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/directives/proxies", "IonItemOptions")
@js.native
class IonItemOptions protected ()
  extends typings.ionicCore.componentsMod.Components.IonItemOptions {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var ionSwipe: EventEmitter[CustomEvent[_]] = js.native
  /**
    * The side the option button should be on. Possible values: `"start"` and `"end"`. If you have multiple `ion-item-options`, a side must be provided for each.
    */
  /* CompleteClass */
  override var side: Side = js.native
  var z: NgZone = js.native
  /* CompleteClass */
  override def fireSwipeEvent(): js.Promise[Unit] = js.native
}

