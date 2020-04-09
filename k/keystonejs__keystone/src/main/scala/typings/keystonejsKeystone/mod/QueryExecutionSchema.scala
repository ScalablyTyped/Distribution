package typings.keystonejsKeystone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryExecutionSchema extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var variables: js.UndefOr[js.Any] = js.undefined
}

object QueryExecutionSchema {
  @scala.inline
  def apply(context: js.Any = null, variables: js.Any = null): QueryExecutionSchema = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecutionSchema]
  }
}

