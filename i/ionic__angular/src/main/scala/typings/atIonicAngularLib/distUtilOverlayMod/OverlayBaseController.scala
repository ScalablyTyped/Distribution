package typings
package atIonicAngularLib.distUtilOverlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/util/overlay", "OverlayBaseController")
@js.native
class OverlayBaseController[Opts, Overlay] protected () extends ControllerShape[Opts, Overlay] {
  def this(ctrl: ControllerShape[Opts, Overlay]) = this()
  var ctrl: js.Any = js.native
  /**
    * Creates a new overlay
    */
  def create(): js.Promise[Overlay] = js.native
}

