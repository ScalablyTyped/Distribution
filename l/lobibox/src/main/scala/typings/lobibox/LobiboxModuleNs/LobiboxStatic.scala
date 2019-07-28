package typings.lobibox.LobiboxModuleNs

import typings.lobibox.Anon_DEFAULTS
import typings.lobibox.Anon_DEFAULTSOPTIONS
import typings.lobibox.Anon_DEFAULTSOptions
import typings.lobibox.Anon_DEFAULTSOptionsConfirmOptions
import typings.lobibox.Anon_DEFAULTSOptionsMessageBoxesDefault
import typings.lobibox.Anon_DEFAULTSOptionsMessageBoxesDefaultT
import typings.lobibox.Anon_DEFAULTSOptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LobiboxStatic extends js.Object {
  @JSName("alert")
  var alert_Original: Anon_DEFAULTSOptions = js.native
  var base: Anon_DEFAULTS = js.native
  @JSName("confirm")
  var confirm_Original: Anon_DEFAULTSOptionsConfirmOptions = js.native
  @JSName("notify")
  var notify_Original: Anon_DEFAULTSOPTIONS = js.native
  @JSName("progress")
  var progress_Original: Anon_DEFAULTSOptionsMessageBoxesDefault = js.native
  @JSName("prompt")
  var prompt_Original: Anon_DEFAULTSOptionsType = js.native
  @JSName("window")
  var window_Original: Anon_DEFAULTSOptionsMessageBoxesDefaultT = js.native
  def alert[T /* <: MessageBoxesDefault */](`type`: String): LobiboxStatic = js.native
  def alert[T /* <: MessageBoxesDefault */](`type`: String, options: T): LobiboxStatic = js.native
  def confirm[T /* <: MessageBoxesDefault */](): T = js.native
  def confirm[T /* <: MessageBoxesDefault */](options: ConfirmOptions): T = js.native
  def notify[T /* <: NotifyDefault */](`type`: String): T = js.native
  def notify[T /* <: NotifyDefault */](`type`: String, options: NotifyOptions): T = js.native
  def progress[T /* <: MessageBoxesDefault */](options: ProgressOptions): T = js.native
  def prompt[T /* <: MessageBoxesDefault */](`type`: String): LobiboxStatic = js.native
  def prompt[T /* <: MessageBoxesDefault */](`type`: String, options: T): LobiboxStatic = js.native
  def window[T /* <: MessageBoxesDefault */](options: WindowOptions): T = js.native
}

