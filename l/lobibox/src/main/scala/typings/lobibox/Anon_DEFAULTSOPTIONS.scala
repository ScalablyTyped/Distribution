package typings.lobibox

import typings.lobibox.LobiboxModule.AlertOptions
import typings.lobibox.LobiboxModule.LobiboxStatic
import typings.lobibox.LobiboxModule.MessageBoxesDefault
import typings.lobibox.LobiboxModule.NotifyDefault
import typings.lobibox.LobiboxModule.NotifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DEFAULTSOPTIONS extends js.Object {
  var DEFAULTS: js.UndefOr[NotifyDefault] = js.native
  var OPTIONS: js.UndefOr[NotifyOptions] = js.native
  def apply[T /* <: NotifyDefault */](`type`: String): T = js.native
  def apply[T /* <: NotifyDefault */](`type`: String, options: NotifyOptions): T = js.native
}

@js.native
trait Anon_DEFAULTSOptions extends js.Object {
  var DEFAULTS: AlertOptions = js.native
  def apply[T /* <: MessageBoxesDefault */](`type`: String): LobiboxStatic = js.native
  def apply[T /* <: MessageBoxesDefault */](`type`: String, options: T): LobiboxStatic = js.native
}

