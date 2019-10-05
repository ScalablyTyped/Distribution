package typings.graphql.executionExecuteMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.FieldNode
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/execute", "resolveFieldValueOrError")
@js.native
object resolveFieldValueOrError extends js.Object {
  def apply[TSource](
    exeContext: ExecutionContext,
    fieldDef: GraphQLField[TSource, _, StringDictionary[_]],
    fieldNodes: js.Array[FieldNode],
    resolveFn: GraphQLFieldResolver[TSource, _, StringDictionary[_]],
    source: TSource,
    info: GraphQLResolveInfo
  ): Error | js.Any = js.native
}

