package typings.graphqlToolsDelegate.addSelectionSetsByTypeMod

import typings.graphql.astMod.SelectionSetNode
import typings.graphql.mod.GraphQLSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/transforms/AddSelectionSetsByType", JSImport.Default)
@js.native
class default protected () extends AddSelectionSetsByType {
  def this(targetSchema: GraphQLSchema, mapping: Record[String, SelectionSetNode]) = this()
}

