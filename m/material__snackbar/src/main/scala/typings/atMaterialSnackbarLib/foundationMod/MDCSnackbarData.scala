package typings
package atMaterialSnackbarLib.foundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCSnackbarData extends js.Object {
  @JSName("actionHandler")
  var actionHandler_Original: stdLib.EventListener = js.native
  var actionOnBottom: js.UndefOr[scala.Boolean] = js.native
  var actionText: java.lang.String = js.native
  var message: java.lang.String = js.native
  var multiline: js.UndefOr[scala.Boolean] = js.native
  var timeout: js.UndefOr[scala.Double] = js.native
  def actionHandler(evt: stdLib.Event): scala.Unit = js.native
}

