package typings.graphql.executionExecuteMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.FieldNode
import typings.graphql.languageAstMod.SelectionSetNode
import typings.graphql.typeDefinitionMod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/execute", "collectFields")
@js.native
object collectFields extends js.Object {
  def apply(
    exeContext: ExecutionContext,
    runtimeType: GraphQLObjectType[_, _, StringDictionary[_]],
    selectionSet: SelectionSetNode,
    fields: StringDictionary[js.Array[FieldNode]],
    visitedFragmentNames: StringDictionary[Boolean]
  ): StringDictionary[js.Array[FieldNode]] = js.native
}

