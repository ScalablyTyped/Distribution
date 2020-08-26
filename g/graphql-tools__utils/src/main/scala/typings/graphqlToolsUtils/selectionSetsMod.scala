package typings.graphqlToolsUtils

import typings.graphql.astMod.SelectionSetNode
import typings.graphql.mod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/selectionSets", JSImport.Namespace)
@js.native
object selectionSetsMod extends js.Object {
  def parseSelectionSet(selectionSet: String): SelectionSetNode = js.native
  def typeContainsSelectionSet(`type`: GraphQLObjectType[_, _], selectionSet: SelectionSetNode): Boolean = js.native
}

