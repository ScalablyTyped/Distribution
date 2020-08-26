package typings.graphqlToolsDelegate.transformsMod

import typings.graphql.astMod.InlineFragmentNode
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.addFragmentsByFieldMod.default
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/transforms", "AddFragmentsByField")
@js.native
class AddFragmentsByField protected () extends default {
  def this(targetSchema: GraphQLSchema, mapping: Record[String, Record[String, InlineFragmentNode]]) = this()
}

