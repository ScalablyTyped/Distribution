package typings.ladda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaddaButton extends js.Object {
  def isLoading(): Boolean
  def remove(): Unit
  def setProgress(progress: Double): Unit
  def start(): LaddaButton
  def startAfter(delay: Double): LaddaButton
  def stop(): LaddaButton
  def toggle(): LaddaButton
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
}

