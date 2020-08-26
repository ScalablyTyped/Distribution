package typings.graphqlToolsDelegate.transformsMod

import typings.graphql.astMod.SelectionSetNode
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.addSelectionSetsByFieldMod.default
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/transforms", "AddSelectionSetsByField")
@js.native
class AddSelectionSetsByField protected () extends default {
  def this(schema: GraphQLSchema, mapping: Record[String, Record[String, SelectionSetNode]]) = this()
}

