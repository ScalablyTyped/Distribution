package typings.ladda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILaddaButton extends js.Object {
  def disable(): ILaddaButton
  def enable(): ILaddaButton
  def isLoading(): Boolean
  def remove(): Unit
  def setProgress(progress: Double): ILaddaButton
  def start(): ILaddaButton
  def startAfter(delay: Double): ILaddaButton
  def stop(): ILaddaButton
  def toggle(): ILaddaButton
}

object ILaddaButton {
  @scala.inline
  def apply(
    disable: () => ILaddaButton,
    enable: () => ILaddaButton,
    isLoading: () => Boolean,
    remove: () => Unit,
    setProgress: Double => ILaddaButton,
    start: () => ILaddaButton,
    startAfter: Double => ILaddaButton,
    stop: () => ILaddaButton,
    toggle: () => ILaddaButton
  ): ILaddaButton = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), isLoading = js.Any.fromFunction0(isLoading), remove = js.Any.fromFunction0(remove), setProgress = js.Any.fromFunction1(setProgress), start = js.Any.fromFunction0(start), startAfter = js.Any.fromFunction1(startAfter), stop = js.Any.fromFunction0(stop), toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[ILaddaButton]
  }
}

