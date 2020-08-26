package typings.graphqlTools.mod

import typings.graphql.astMod.InlineFragmentNode
import typings.graphql.mod.GraphQLSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "AddFragmentsByField")
@js.native
class AddFragmentsByField protected ()
  extends typings.graphqlToolsDelegate.mod.AddFragmentsByField {
  def this(targetSchema: GraphQLSchema, mapping: Record[String, Record[String, InlineFragmentNode]]) = this()
}

