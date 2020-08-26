package typings.graphqlToolsDelegate.transformsMod

import typings.graphql.astMod.SelectionSetNode
import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.mod.GraphQLSchema
import typings.graphql.mod.TypeInfo
import typings.graphqlToolsDelegate.visitSelectionSetsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/transforms", "VisitSelectionSets")
@js.native
class VisitSelectionSets protected () extends default {
  def this(
    schema: GraphQLSchema,
    initialType: GraphQLOutputType,
    visitor: js.Function2[/* node */ SelectionSetNode, /* typeInfo */ TypeInfo, SelectionSetNode]
  ) = this()
}

