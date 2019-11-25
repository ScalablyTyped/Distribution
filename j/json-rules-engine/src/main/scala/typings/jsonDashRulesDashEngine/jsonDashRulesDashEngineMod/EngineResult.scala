package typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EngineResult extends js.Object {
  var almanac: Almanac
  var events: js.Array[Event]
}

object EngineResult {
  @scala.inline
  def apply(almanac: Almanac, events: js.Array[Event]): EngineResult = {
    val __obj = js.Dynamic.literal(almanac = almanac.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EngineResult]
  }
}

