package typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineMod

import typings.jsonDashRulesDashEngine.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var params: Anon_Key
  var `type`: String
}

object Event {
  @scala.inline
  def apply(params: Anon_Key, `type`: String): Event = {
    val __obj = js.Dynamic.literal(params = params)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Event]
  }
}

