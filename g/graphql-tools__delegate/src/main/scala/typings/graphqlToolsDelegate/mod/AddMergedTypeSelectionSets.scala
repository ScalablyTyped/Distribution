package typings.graphqlToolsDelegate.mod

import typings.graphql.astMod.SelectionSetNode
import typings.graphql.mod.GraphQLSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate", "AddMergedTypeSelectionSets")
@js.native
class AddMergedTypeSelectionSets protected ()
  extends typings.graphqlToolsDelegate.transformsMod.AddMergedTypeSelectionSets {
  def this(targetSchema: GraphQLSchema, mapping: Record[String, SelectionSetNode]) = this()
}

