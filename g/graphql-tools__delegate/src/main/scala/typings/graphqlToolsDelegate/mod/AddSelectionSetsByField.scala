package typings.graphqlToolsDelegate.mod

import typings.graphql.astMod.SelectionSetNode
import typings.graphql.mod.GraphQLSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate", "AddSelectionSetsByField")
@js.native
class AddSelectionSetsByField protected ()
  extends typings.graphqlToolsDelegate.transformsMod.AddSelectionSetsByField {
  def this(schema: GraphQLSchema, mapping: Record[String, Record[String, SelectionSetNode]]) = this()
}

