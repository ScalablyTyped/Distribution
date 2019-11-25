package typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllConditions extends TopLevelCondition {
  var all: js.Array[NestedCondition]
}

object AllConditions {
  @scala.inline
  def apply(all: js.Array[NestedCondition]): AllConditions = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AllConditions]
  }
}

