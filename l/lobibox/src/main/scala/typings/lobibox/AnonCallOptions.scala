package typings.lobibox

import typings.lobibox.LobiboxModule.ConfirmOptions
import typings.lobibox.LobiboxModule.MessageBoxesDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallOptions extends js.Object {
  var DEFAULTS: ConfirmOptions = js.native
  def apply[T /* <: MessageBoxesDefault */](): T = js.native
  def apply[T /* <: MessageBoxesDefault */](options: ConfirmOptions): T = js.native
}

