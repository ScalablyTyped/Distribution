package typings.graphqlTools.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsSchema.typesMod.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "addErrorLoggingToSchema")
@js.native
object addErrorLoggingToSchema extends js.Object {
  def apply(schema: GraphQLSchema): GraphQLSchema = js.native
  def apply(schema: GraphQLSchema, logger: ILogger): GraphQLSchema = js.native
}

