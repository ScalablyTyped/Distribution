package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Store the position and access outcome for an expression visited in rules.
  */
@js.native
trait SchemaVisitedExpression extends js.Object {
  /**
    * Position in the `Source` or `Ruleset` where an expression was visited.
    */
  var sourcePosition: js.UndefOr[SchemaSourcePosition] = js.native
  /**
    * The evaluated value for the visited expression, e.g. true/false
    */
  var value: js.UndefOr[js.Any] = js.native
}

object SchemaVisitedExpression {
  @scala.inline
  def apply(sourcePosition: SchemaSourcePosition = null, value: js.Any = null): SchemaVisitedExpression = {
    val __obj = js.Dynamic.literal()
    if (sourcePosition != null) __obj.updateDynamic("sourcePosition")(sourcePosition.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVisitedExpression]
  }
}

