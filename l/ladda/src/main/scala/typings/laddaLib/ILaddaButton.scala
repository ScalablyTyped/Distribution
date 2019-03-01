package typings
package laddaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILaddaButton extends js.Object {
  def disable(): ILaddaButton
  def enable(): ILaddaButton
  def isLoading(): scala.Boolean
  def remove(): scala.Unit
  def setProgress(progress: scala.Double): ILaddaButton
  def start(): ILaddaButton
  def startAfter(delay: scala.Double): ILaddaButton
  def stop(): ILaddaButton
  def toggle(): ILaddaButton
}

object ILaddaButton {
  @scala.inline
  def apply(
    disable: js.Function0[ILaddaButton],
    enable: js.Function0[ILaddaButton],
    isLoading: js.Function0[scala.Boolean],
    remove: js.Function0[scala.Unit],
    setProgress: js.Function1[scala.Double, ILaddaButton],
    start: js.Function0[ILaddaButton],
    startAfter: js.Function1[scala.Double, ILaddaButton],
    stop: js.Function0[ILaddaButton],
    toggle: js.Function0[ILaddaButton]
  ): ILaddaButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disable")(disable)
    __obj.updateDynamic("enable")(enable)
    __obj.updateDynamic("isLoading")(isLoading)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("setProgress")(setProgress)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("startAfter")(startAfter)
    __obj.updateDynamic("stop")(stop)
    __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[ILaddaButton]
  }
}

