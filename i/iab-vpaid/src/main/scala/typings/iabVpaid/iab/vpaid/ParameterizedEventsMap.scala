package typings.iabVpaid.iab.vpaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterizedEventsMap extends js.Object {
  def AdClickThru(url: String, id: String, playerHandles: Boolean): Unit = js.native
  def AdError(message: String): Unit = js.native
  def AdInteraction(id: String): Unit = js.native
  def AdLog(id: String): Unit = js.native
}

object ParameterizedEventsMap {
  @scala.inline
  def apply(
    AdClickThru: (String, String, Boolean) => Unit,
    AdError: String => Unit,
    AdInteraction: String => Unit,
    AdLog: String => Unit
  ): ParameterizedEventsMap = {
    val __obj = js.Dynamic.literal(AdClickThru = js.Any.fromFunction3(AdClickThru), AdError = js.Any.fromFunction1(AdError), AdInteraction = js.Any.fromFunction1(AdInteraction), AdLog = js.Any.fromFunction1(AdLog))
    __obj.asInstanceOf[ParameterizedEventsMap]
  }
  @scala.inline
  implicit class ParameterizedEventsMapOps[Self <: ParameterizedEventsMap] (val x: Self) extends AnyVal {
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
    def setAdClickThru(value: (String, String, Boolean) => Unit): Self = this.set("AdClickThru", js.Any.fromFunction3(value))
    @scala.inline
    def setAdError(value: String => Unit): Self = this.set("AdError", js.Any.fromFunction1(value))
    @scala.inline
    def setAdInteraction(value: String => Unit): Self = this.set("AdInteraction", js.Any.fromFunction1(value))
    @scala.inline
    def setAdLog(value: String => Unit): Self = this.set("AdLog", js.Any.fromFunction1(value))
  }
  
}

