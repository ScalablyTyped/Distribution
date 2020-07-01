package typings.graphqlToolsSchema

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsSchema.typesMod.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/schema/addErrorLoggingToSchema", JSImport.Namespace)
@js.native
object addErrorLoggingToSchemaMod extends js.Object {
  def addErrorLoggingToSchema(schema: GraphQLSchema): GraphQLSchema = js.native
  def addErrorLoggingToSchema(schema: GraphQLSchema, logger: ILogger): GraphQLSchema = js.native
}

