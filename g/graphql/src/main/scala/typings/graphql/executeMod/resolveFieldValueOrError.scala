package typings.graphql.executeMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.FieldNode
import typings.graphql.definitionMod.GraphQLField
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/execute", "resolveFieldValueOrError")
@js.native
object resolveFieldValueOrError extends js.Object {
  def apply(
    exeContext: ExecutionContext,
    fieldDef: GraphQLField[_, _, StringDictionary[_]],
    fieldNodes: js.Array[FieldNode],
    resolveFn: GraphQLFieldResolver[_, _, StringDictionary[_]],
    source: js.Any,
    info: GraphQLResolveInfo
  ): js.Any = js.native
}

