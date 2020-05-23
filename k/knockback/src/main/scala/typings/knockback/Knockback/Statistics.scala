package typings.knockback.Knockback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Statistics extends js.Object {
  def addModelEvent(event: String): js.Any
  def clear(): js.Any
  def modelEventsStatsString(): js.Any
  def register(key: String, obj: js.Any): js.Any
  def registeredCount(`type`: js.Any): Double
  def registeredStatsString(success_message: String): String
  def unregister(key: String, obj: js.Any): js.Any
}

object Statistics {
  @scala.inline
  def apply(
    addModelEvent: String => js.Any,
    clear: () => js.Any,
    modelEventsStatsString: () => js.Any,
    register: (String, js.Any) => js.Any,
    registeredCount: js.Any => Double,
    registeredStatsString: String => String,
    unregister: (String, js.Any) => js.Any
  ): Statistics = {
    val __obj = js.Dynamic.literal(addModelEvent = js.Any.fromFunction1(addModelEvent), clear = js.Any.fromFunction0(clear), modelEventsStatsString = js.Any.fromFunction0(modelEventsStatsString), register = js.Any.fromFunction2(register), registeredCount = js.Any.fromFunction1(registeredCount), registeredStatsString = js.Any.fromFunction1(registeredStatsString), unregister = js.Any.fromFunction2(unregister))
    __obj.asInstanceOf[Statistics]
  }
}

