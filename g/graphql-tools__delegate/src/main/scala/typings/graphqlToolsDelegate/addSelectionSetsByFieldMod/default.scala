package typings.graphqlToolsDelegate.addSelectionSetsByFieldMod

import typings.graphql.astMod.SelectionSetNode
import typings.graphql.mod.GraphQLSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/transforms/AddSelectionSetsByField", JSImport.Default)
@js.native
class default protected () extends AddSelectionSetsByField {
  def this(schema: GraphQLSchema, mapping: Record[String, Record[String, SelectionSetNode]]) = this()
}

