package typings.graphqlTools

import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.executeMod.ExecutionResult
import typings.graphql.executeMod.ExecutionResultDataDefault
import typings.graphql.formatErrorMod.GraphQLFormattedError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  var ERROR_SYMBOL: js.Any = js.native
  def annotateWithChildrenErrors(`object`: js.Any, childrenErrors: js.Array[GraphQLFormattedError[Record[String, _]]]): js.Any = js.native
  def checkResultAndHandleErrors(result: ExecutionResult[ExecutionResultDataDefault], info: GraphQLResolveInfo): js.Any = js.native
  def checkResultAndHandleErrors(result: ExecutionResult[ExecutionResultDataDefault], info: GraphQLResolveInfo, responseKey: String): js.Any = js.native
  def getErrorsFromParent(`object`: js.Any, fieldName: String): AnonError | AnonErrors = js.native
}

