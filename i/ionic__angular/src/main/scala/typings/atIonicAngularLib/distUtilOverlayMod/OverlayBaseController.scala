package typings
package atIonicAngularLib.distUtilOverlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/util/overlay", "OverlayBaseController")
@js.native
class OverlayBaseController[Opts, Overlay] protected () extends js.Object {
  def this(ctrl: java.lang.String, doc: stdLib.Document) = this()
  var ctrl: js.Any = js.native
  var doc: js.Any = js.native
  /**
    * Creates a new overlay
    */
  def create(): js.Promise[Overlay] = js.native
  def create(opts: Opts): js.Promise[Overlay] = js.native
  /**
    * When `id` is not provided, it dismisses the top overlay.
    */
  def dismiss(): js.Promise[scala.Unit] = js.native
  def dismiss(data: js.Any): js.Promise[scala.Unit] = js.native
  def dismiss(data: js.Any, role: java.lang.String): js.Promise[scala.Unit] = js.native
  def dismiss(data: js.Any, role: java.lang.String, id: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Returns the top overlay.
    */
  def getTop(): js.Promise[js.UndefOr[Overlay]] = js.native
}

