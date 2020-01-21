package typings.lobibox.LobiboxModule

import typings.lobibox.AnonDEFAULTS
import typings.lobibox.AnonDEFAULTSOptions
import typings.lobibox.AnonDEFAULTSOptionsConfirmOptions
import typings.lobibox.AnonDEFAULTSOptionsMessageBoxesDefault
import typings.lobibox.AnonDEFAULTSOptionsMessageBoxesDefaultT
import typings.lobibox.AnonDEFAULTSOptionsType
import typings.lobibox.Anon_DEFAULTSOPTIONS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LobiboxStatic extends js.Object {
  @JSName("alert")
  var alert_Original: AnonDEFAULTSOptions = js.native
  var base: AnonDEFAULTS = js.native
  @JSName("confirm")
  var confirm_Original: AnonDEFAULTSOptionsConfirmOptions = js.native
  @JSName("notify")
  var notify_Original: Anon_DEFAULTSOPTIONS = js.native
  @JSName("progress")
  var progress_Original: AnonDEFAULTSOptionsMessageBoxesDefault = js.native
  @JSName("prompt")
  var prompt_Original: AnonDEFAULTSOptionsType = js.native
  @JSName("window")
  var window_Original: AnonDEFAULTSOptionsMessageBoxesDefaultT = js.native
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

