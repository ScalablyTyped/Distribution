package typings.jsonRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyConditions extends TopLevelCondition {
  var any: js.Array[NestedCondition]
}

object AnyConditions {
  @scala.inline
  def apply(any: js.Array[NestedCondition]): AnyConditions = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyConditions]
  }
}

