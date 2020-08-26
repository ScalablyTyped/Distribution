package typings.graphqlToolsDelegate.mod

import typings.graphql.astMod.SelectionSetNode
import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.mod.GraphQLSchema
import typings.graphql.mod.TypeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate", "VisitSelectionSets")
@js.native
class VisitSelectionSets protected ()
  extends typings.graphqlToolsDelegate.transformsMod.VisitSelectionSets {
  def this(
    schema: GraphQLSchema,
    initialType: GraphQLOutputType,
    visitor: js.Function2[/* node */ SelectionSetNode, /* typeInfo */ TypeInfo, SelectionSetNode]
  ) = this()
}

