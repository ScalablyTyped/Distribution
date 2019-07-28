package typings.knockback.KnockbackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Knockback.Statistics")
@js.native
class Statistics () extends js.Object {
  def addModelEvent(event: String): js.Any = js.native
  def clear(): js.Any = js.native
  def modelEventsStatsString(): js.Any = js.native
  def register(key: String, obj: js.Any): js.Any = js.native
  def registeredCount(`type`: js.Any): Double = js.native
  def registeredStatsString(success_message: String): String = js.native
  def unregister(key: String, obj: js.Any): js.Any = js.native
}

