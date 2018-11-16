package typings
package lobiboxLib.LobiboxModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LobiboxStatic extends js.Object {
  @JSName("alert")
  var alert_Original: lobiboxLib.Anon_TypeOptions = js.native
  var base: lobiboxLib.Anon_OPTIONS = js.native
  @JSName("confirm")
  var confirm_Original: lobiboxLib.Anon_OptionsDEFAULTST = js.native
  @JSName("notify")
  var notify_Original: lobiboxLib.Anon_Type = js.native
  @JSName("progress")
  var progress_Original: lobiboxLib.Anon_OptionsDEFAULTS = js.native
  @JSName("prompt")
  var prompt_Original: lobiboxLib.Anon_TypeOptionsDEFAULTS = js.native
  @JSName("window")
  var window_Original: lobiboxLib.Anon_Options = js.native
  def alert[T /* <: MessageBoxesDefault */](`type`: java.lang.String): LobiboxStatic = js.native
  def alert[T /* <: MessageBoxesDefault */](`type`: java.lang.String, options: T): LobiboxStatic = js.native
  def confirm[T /* <: MessageBoxesDefault */](): T = js.native
  def confirm[T /* <: MessageBoxesDefault */](options: ConfirmOptions): T = js.native
  def notify[T /* <: NotifyDefault */](`type`: java.lang.String): T = js.native
  def notify[T /* <: NotifyDefault */](`type`: java.lang.String, options: NotifyOptions): T = js.native
  def progress[T /* <: MessageBoxesDefault */](options: ProgressOptions): T = js.native
  def prompt[T /* <: MessageBoxesDefault */](`type`: java.lang.String): LobiboxStatic = js.native
  def prompt[T /* <: MessageBoxesDefault */](`type`: java.lang.String, options: T): LobiboxStatic = js.native
  def window[T /* <: MessageBoxesDefault */](options: WindowOptions): T = js.native
}

