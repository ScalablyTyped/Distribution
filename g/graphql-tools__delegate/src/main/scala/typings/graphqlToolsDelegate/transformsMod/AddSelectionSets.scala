package typings.graphqlToolsDelegate.transformsMod

import typings.graphql.astMod.FieldNode
import typings.graphql.astMod.SelectionSetNode
import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.addSelectionSetsMod.default
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/transforms", "AddSelectionSets")
@js.native
class AddSelectionSets protected () extends default {
  def this(
    sourceSchema: GraphQLSchema,
    initialType: GraphQLOutputType,
    selectionSetsByType: Record[String, SelectionSetNode],
    selectionSetsByField: Record[String, Record[String, SelectionSetNode]],
    dynamicSelectionSetsByField: Record[
        String, 
        Record[String, js.Array[js.Function1[/* node */ FieldNode, SelectionSetNode]]]
      ]
  ) = this()
}

