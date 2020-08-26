package typings.graphqlToolsDelegate.transformsMod

import typings.graphql.astMod.SelectionSetNode
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.addSelectionSetsByTypeMod.default
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/transforms", "AddMergedTypeSelectionSets")
@js.native
class AddMergedTypeSelectionSets protected () extends default {
  def this(targetSchema: GraphQLSchema, mapping: Record[String, SelectionSetNode]) = this()
}

