package typings.graphqlDashUpload.graphqlDashUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLOperation extends js.Object {
  var operationName: js.UndefOr[Null | String] = js.undefined
  var query: String
  var variables: js.UndefOr[Null | js.Any] = js.undefined
}

object GraphQLOperation {
  @scala.inline
  def apply(query: String, operationName: String = null, variables: js.Any = null): GraphQLOperation = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (operationName != null) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLOperation]
  }
}

