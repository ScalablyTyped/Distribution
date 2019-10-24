package typings.atIonicAngular.distDirectivesProxiesMod

import typings.atAngularCore.atAngularCoreMod.ChangeDetectorRef
import typings.atAngularCore.atAngularCoreMod.ElementRef
import typings.atAngularCore.atAngularCoreMod.NgZone
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonList")
@js.native
class IonList protected ()
  extends typings.atIonicCore.distTypesComponentsMod.Components.IonList {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  /**
    * If `true`, the list will have margin around it and rounded corners.
    */
  /* CompleteClass */
  override var inset: Boolean = js.native
  var z: NgZone = js.native
  /**
    * If `ion-item-sliding` are used inside the list, this method closes any open sliding item.  Returns `true` if an actual `ion-item-sliding` is closed.
    */
  /* CompleteClass */
  override def closeSlidingItems(): js.Promise[Boolean] = js.native
}

