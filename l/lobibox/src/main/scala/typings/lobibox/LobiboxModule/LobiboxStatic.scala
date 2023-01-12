package typings.lobibox.LobiboxModule

import typings.lobibox.anon.Call
import typings.lobibox.anon.CallDEFAULTS
import typings.lobibox.anon.CallOptions
import typings.lobibox.anon.DEFAULTS
import typings.lobibox.anon.DEFAULTSProgressOptions
import typings.lobibox.anon.DEFAULTSWindowOptions
import typings.lobibox.anon.OPTIONS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LobiboxStatic extends StObject {
  
  def alert[T /* <: MessageBoxesDefault */](`type`: String): LobiboxStatic
  def alert[T /* <: MessageBoxesDefault */](`type`: String, options: T): LobiboxStatic
  @JSName("alert")
  var alert_Original: Call
  
  var base: DEFAULTS
  
  def confirm[T /* <: MessageBoxesDefault */](): T
  def confirm[T /* <: MessageBoxesDefault */](options: ConfirmOptions): T
  @JSName("confirm")
  var confirm_Original: CallOptions
  
  def notify[T /* <: NotifyDefault */](`type`: String): T
  def notify[T /* <: NotifyDefault */](`type`: String, options: NotifyOptions): T
  @JSName("notify")
  var notify_Original: OPTIONS
  
  def progress[T /* <: MessageBoxesDefault */](options: ProgressOptions): T
  @JSName("progress")
  var progress_Original: DEFAULTSProgressOptions
  
  def prompt[T /* <: MessageBoxesDefault */](`type`: String): LobiboxStatic
  def prompt[T /* <: MessageBoxesDefault */](`type`: String, options: T): LobiboxStatic
  @JSName("prompt")
  var prompt_Original: CallDEFAULTS
  
  def window[T /* <: MessageBoxesDefault */](options: WindowOptions): T
  @JSName("window")
  var window_Original: DEFAULTSWindowOptions
}
object LobiboxStatic {
  
  inline def apply(
    alert: Call,
    base: DEFAULTS,
    confirm: CallOptions,
    notify_ : OPTIONS,
    progress: DEFAULTSProgressOptions,
    prompt: CallDEFAULTS,
    window: DEFAULTSWindowOptions
  ): LobiboxStatic = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], confirm = confirm.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
    __obj.asInstanceOf[LobiboxStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LobiboxStatic] (val x: Self) extends AnyVal {
    
    inline def setAlert(value: Call): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
    
    inline def setBase(value: DEFAULTS): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setConfirm(value: CallOptions): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    inline def setNotify_(value: OPTIONS): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: DEFAULTSProgressOptions): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setPrompt(value: CallDEFAULTS): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setWindow(value: DEFAULTSWindowOptions): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
