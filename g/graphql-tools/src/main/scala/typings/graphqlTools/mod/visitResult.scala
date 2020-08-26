package typings.graphqlTools.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.ExecutionResult
import typings.graphqlToolsUtils.interfacesMod.Request
import typings.graphqlToolsUtils.visitResultMod.ErrorVisitorMap
import typings.graphqlToolsUtils.visitResultMod.ResultVisitorMap
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "visitResult")
@js.native
object visitResult extends js.Object {
  def apply(result: ExecutionResult[Record[String, _]], request: Request, schema: GraphQLSchema): js.Any = js.native
  def apply(
    result: ExecutionResult[Record[String, _]],
    request: Request,
    schema: GraphQLSchema,
    resultVisitorMap: js.UndefOr[scala.Nothing],
    errorVisitorMap: ErrorVisitorMap
  ): js.Any = js.native
  def apply(
    result: ExecutionResult[Record[String, _]],
    request: Request,
    schema: GraphQLSchema,
    resultVisitorMap: ResultVisitorMap
  ): js.Any = js.native
  def apply(
    result: ExecutionResult[Record[String, _]],
    request: Request,
    schema: GraphQLSchema,
    resultVisitorMap: ResultVisitorMap,
    errorVisitorMap: ErrorVisitorMap
  ): js.Any = js.native
}

