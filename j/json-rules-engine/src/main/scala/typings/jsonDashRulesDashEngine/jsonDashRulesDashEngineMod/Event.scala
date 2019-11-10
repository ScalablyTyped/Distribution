package typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var params: js.UndefOr[Record[String, _]] = js.undefined
  var `type`: String
}

object Event {
  @scala.inline
  def apply(`type`: String, params: Record[String, _] = null): Event = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Event]
  }
}

