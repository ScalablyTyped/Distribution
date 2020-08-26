package typings.graphqlToolsDelegate.addFragmentsByFieldMod

import typings.graphql.astMod.InlineFragmentNode
import typings.graphql.mod.GraphQLSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/transforms/AddFragmentsByField", JSImport.Default)
@js.native
class default protected () extends AddFragmentsByField {
  def this(targetSchema: GraphQLSchema, mapping: Record[String, Record[String, InlineFragmentNode]]) = this()
}

