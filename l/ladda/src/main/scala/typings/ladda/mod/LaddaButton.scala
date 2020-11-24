package typings.ladda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaddaButton extends js.Object {
  
  def isLoading(): Boolean = js.native
  
  def remove(): Unit = js.native
  
  def setProgress(progress: Double): Unit = js.native
  
  def start(): LaddaButton = js.native
  
  def startAfter(delay: Double): LaddaButton = js.native
  
  def stop(): LaddaButton = js.native
  
  def toggle(): LaddaButton = js.native
}
object LaddaButton {
  
  @scala.inline
  def apply(
    isLoading: () => Boolean,
    remove: () => Unit,
    setProgress: Double => Unit,
    start: () => LaddaButton,
    startAfter: Double => LaddaButton,
    stop: () => LaddaButton,
    toggle: () => LaddaButton
  ): LaddaButton = {
    val __obj = js.Dynamic.literal(isLoading = js.Any.fromFunction0(isLoading), remove = js.Any.fromFunction0(remove), setProgress = js.Any.fromFunction1(setProgress), start = js.Any.fromFunction0(start), startAfter = js.Any.fromFunction1(startAfter), stop = js.Any.fromFunction0(stop), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[LaddaButton]
  }
  
  @scala.inline
  implicit class LaddaButtonOps[Self <: LaddaButton] (val x: Self) extends AnyVal {
    
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
    def setIsLoading(value: () => Boolean): Self = this.set("isLoading", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetProgress(value: Double => Unit): Self = this.set("setProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: () => LaddaButton): Self = this.set("start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartAfter(value: Double => LaddaButton): Self = this.set("startAfter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStop(value: () => LaddaButton): Self = this.set("stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: () => LaddaButton): Self = this.set("toggle", js.Any.fromFunction0(value))
  }
}
