package typings
package atIonicAngularLib.distUtilOverlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControllerShape[Opts, HTMLElm] extends js.Object {
  def create(options: Opts): js.Promise[HTMLElm] = js.native
  def dismiss(): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: java.lang.String): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: java.lang.String, id: java.lang.String): js.Promise[scala.Boolean] = js.native
  def getTop(): js.Promise[js.UndefOr[HTMLElm]] = js.native
}

