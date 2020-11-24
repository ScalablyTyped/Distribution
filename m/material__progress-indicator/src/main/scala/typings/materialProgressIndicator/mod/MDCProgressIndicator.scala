package typings.materialProgressIndicator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCProgressIndicator extends js.Object {
  
  /**
    * Puts the component in the closed state.
    */
  def close(): Unit = js.native
  
  /**
    * Toggles the component between the determinate and indeterminate state.
    */
  var determinate: Boolean = js.native
  
  /**
    * Puts the component in the open state.
    */
  def open(): Unit = js.native
  
  /**
    * The current progress value. Value should be between [0, 1].
    */
  var progress: Double = js.native
}
object MDCProgressIndicator {
  
  @scala.inline
  def apply(close: () => Unit, determinate: Boolean, open: () => Unit, progress: Double): MDCProgressIndicator = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), determinate = determinate.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCProgressIndicator]
  }
  
  @scala.inline
  implicit class MDCProgressIndicatorOps[Self <: MDCProgressIndicator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeterminate(value: Boolean): Self = this.set("determinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
  }
}
