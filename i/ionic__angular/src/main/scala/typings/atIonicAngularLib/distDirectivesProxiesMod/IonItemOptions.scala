package typings
package atIonicAngularLib.distDirectivesProxiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonItemOptions")
@js.native
class IonItemOptions protected ()
  extends atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonItemOptions {
  def this(c: atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef, r: atAngularCoreLib.atAngularCoreMod.ElementRef[_]) = this()
  var el: stdLib.HTMLElement = js.native
  var ionSwipe: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  /**
    * The side the option button should be on. Possible values: `"start"` and `"end"`. If you have multiple `ion-item-options`, a side must be provided for each.
    */
  /* CompleteClass */
  override var side: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Side */ js.Any = js.native
  /* CompleteClass */
  override def fireSwipeEvent(): js.Promise[scala.Unit] = js.native
}

