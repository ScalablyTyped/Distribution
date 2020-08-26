package typings.graphql.executeMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.FieldNode
import typings.graphql.astMod.SelectionSetNode
import typings.graphql.definitionMod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/execute", "collectFields")
@js.native
object collectFields extends js.Object {
  def apply(
    exeContext: ExecutionContext,
    runtimeType: GraphQLObjectType[_, _],
    selectionSet: SelectionSetNode,
    fields: StringDictionary[js.Array[FieldNode]],
    visitedFragmentNames: StringDictionary[Boolean]
  ): StringDictionary[js.Array[FieldNode]] = js.native
}

