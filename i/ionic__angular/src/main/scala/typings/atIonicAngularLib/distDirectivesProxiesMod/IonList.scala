package typings
package atIonicAngularLib.distDirectivesProxiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonList")
@js.native
class IonList protected ()
  extends atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonList {
  def this(c: atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef, r: atAngularCoreLib.atAngularCoreMod.ElementRef[_]) = this()
  var el: stdLib.HTMLElement = js.native
  /**
    * If `true`, the list will have margin around it and rounded corners.
    */
  /* CompleteClass */
  override var inset: scala.Boolean = js.native
  /**
    * If `ion-item-sliding` are used inside the list, this method closes any open sliding item.  Returns `true` if an actual `ion-item-sliding` is closed.
    */
  /* CompleteClass */
  override def closeSlidingItems(): js.Promise[scala.Boolean] = js.native
}

