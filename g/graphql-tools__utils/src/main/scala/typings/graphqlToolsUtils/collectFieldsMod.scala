package typings.graphqlToolsUtils

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.FieldNode
import typings.graphql.astMod.SelectionSetNode
import typings.graphql.mod.GraphQLObjectType
import typings.graphqlToolsUtils.interfacesMod.GraphQLExecutionContext
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/collectFields", JSImport.Namespace)
@js.native
object collectFieldsMod extends js.Object {
  def collectFields(
    exeContext: GraphQLExecutionContext,
    runtimeType: GraphQLObjectType[_, _, StringDictionary[_]],
    selectionSet: SelectionSetNode,
    fields: Record[String, js.Array[FieldNode]],
    visitedFragmentNames: Record[String, Boolean]
  ): Record[String, js.Array[FieldNode]] = js.native
}

