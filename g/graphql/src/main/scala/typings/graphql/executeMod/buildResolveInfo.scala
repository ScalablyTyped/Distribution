package typings.graphql.executeMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.FieldNode
import typings.graphql.definitionMod.GraphQLField
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/execute", "buildResolveInfo")
@js.native
object buildResolveInfo extends js.Object {
  def apply(
    exeContext: ExecutionContext,
    fieldDef: GraphQLField[_, _, StringDictionary[_]],
    fieldNodes: js.Array[FieldNode],
    parentType: GraphQLObjectType[_, _],
    path: Path
  ): GraphQLResolveInfo = js.native
}

