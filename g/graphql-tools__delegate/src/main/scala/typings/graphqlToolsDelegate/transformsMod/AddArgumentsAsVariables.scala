package typings.graphqlToolsDelegate.transformsMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.addArgumentsAsVariablesMod.default
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/transforms", "AddArgumentsAsVariables")
@js.native
class AddArgumentsAsVariables protected () extends default {
  def this(targetSchema: GraphQLSchema, args: Record[String, _]) = this()
}

