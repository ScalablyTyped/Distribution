package typings.graphqlTools.checkResultAndHandleErrorsMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.interfacesMod.Request
import typings.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckResultAndHandleErrors extends Transform {
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
    transformRequest: /* originalRequest */ Request => Request = null,
    transformSchema: /* schema */ GraphQLSchema => GraphQLSchema = null
  ): CheckResultAndHandleErrors = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], transformResult = js.Any.fromFunction1(transformResult))
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1(transformRequest))
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[CheckResultAndHandleErrors]
  }
}

