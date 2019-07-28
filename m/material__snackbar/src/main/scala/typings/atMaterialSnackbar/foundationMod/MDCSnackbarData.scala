package typings.atMaterialSnackbar.foundationMod

import typings.std.Event
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCSnackbarData extends js.Object {
  @JSName("actionHandler")
  var actionHandler_Original: EventListener = js.native
  var actionOnBottom: js.UndefOr[Boolean] = js.native
  var actionText: String = js.native
  var message: String = js.native
  var multiline: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  def actionHandler(evt: Event): Unit = js.native
}

