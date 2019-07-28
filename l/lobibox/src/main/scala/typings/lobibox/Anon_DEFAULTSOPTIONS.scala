package typings.lobibox

import typings.lobibox.LobiboxModuleNs.AlertOptions
import typings.lobibox.LobiboxModuleNs.LobiboxStatic
import typings.lobibox.LobiboxModuleNs.MessageBoxesDefault
import typings.lobibox.LobiboxModuleNs.NotifyDefault
import typings.lobibox.LobiboxModuleNs.NotifyOptions
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

