package typings.iabDashVpaid.iab.vpaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterizedEventsMap extends js.Object {
  def AdClickThru(url: String, id: String, playerHandles: Boolean): Unit
  def AdError(message: String): Unit
  def AdInteraction(id: String): Unit
  def AdLog(id: String): Unit
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
}

