package typings
package graphqlDashUploadLib.graphqlDashUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLOperation extends js.Object {
  var operationName: js.UndefOr[scala.Null | java.lang.String] = js.undefined
  var query: java.lang.String
  var variables: js.UndefOr[scala.Null | js.Any] = js.undefined
}

object GraphQLOperation {
  @scala.inline
  def apply(query: java.lang.String, operationName: java.lang.String = null, variables: js.Any = null): GraphQLOperation = {
    val __obj = js.Dynamic.literal(query = query)
    if (operationName != null) __obj.updateDynamic("operationName")(operationName)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[GraphQLOperation]
  }
}

