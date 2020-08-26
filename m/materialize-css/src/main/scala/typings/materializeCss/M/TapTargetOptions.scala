package typings.materializeCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TapTargetOptions extends js.Object {
  /**
    * Callback function called when Tap Target is closed
    * @default null
    */
  def onClose(origin: Element): Unit = js.native
  /**
    * Callback function called when Tap Target is opened
    * @default null
    */
  def onOpen(origin: Element): Unit = js.native
}

object TapTargetOptions {
  @scala.inline
  def apply(onClose: Element => Unit, onOpen: Element => Unit): TapTargetOptions = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction1(onClose), onOpen = js.Any.fromFunction1(onOpen))
    __obj.asInstanceOf[TapTargetOptions]
  }
  @scala.inline
  implicit class TapTargetOptionsOps[Self <: TapTargetOptions] (val x: Self) extends AnyVal {
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
    def setOnClose(value: Element => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def setOnOpen(value: Element => Unit): Self = this.set("onOpen", js.Any.fromFunction1(value))
  }
  
}

