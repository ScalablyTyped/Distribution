package typings
package graphqlDashToolsLib.distTransformsCheckResultAndHandleErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckResultAndHandleErrors
  extends graphqlDashToolsLib.distInterfacesMod.Transform {
  var fieldName: js.UndefOr[js.Any] = js.undefined
  var info: js.Any
  @JSName("transformResult")
  def transformResult_MCheckResultAndHandleErrors(result: js.Any): js.Any
}

object CheckResultAndHandleErrors {
  @scala.inline
  def apply(
    info: js.Any,
    transformResult: js.Any => js.Any,
    fieldName: js.Any = null,
    transformRequest: /* originalRequest */ graphqlDashToolsLib.distInterfacesMod.Request => graphqlDashToolsLib.distInterfacesMod.Request = null,
    transformSchema: /* schema */ graphqlLib.graphqlMod.GraphQLSchema => graphqlLib.graphqlMod.GraphQLSchema = null
  ): CheckResultAndHandleErrors = {
    val __obj = js.Dynamic.literal(info = info, transformResult = js.Any.fromFunction1(transformResult))
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1(transformRequest))
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[CheckResultAndHandleErrors]
  }
}

