package typings.graphql.executionExecuteMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.jsutilsPathMod.Path
import typings.graphql.languageAstMod.FieldNode
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphql.typeDefinitionMod.GraphQLObjectType
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
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
    parentType: GraphQLObjectType[_, _, StringDictionary[_]],
    path: Path
  ): GraphQLResolveInfo = js.native
}

