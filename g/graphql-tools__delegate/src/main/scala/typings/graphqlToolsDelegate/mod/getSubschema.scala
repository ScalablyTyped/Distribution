package typings.graphqlToolsDelegate.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.SubschemaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate", "getSubschema")
@js.native
object getSubschema extends js.Object {
  def apply(result: js.Any, responseKey: String): GraphQLSchema | SubschemaConfig = js.native
}

