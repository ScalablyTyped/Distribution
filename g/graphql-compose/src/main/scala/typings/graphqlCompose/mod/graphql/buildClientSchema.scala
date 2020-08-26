package typings.graphqlCompose.mod.graphql

import typings.graphql.getIntrospectionQueryMod.IntrospectionQuery
import typings.graphql.schemaMod.GraphQLSchemaValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "graphql.buildClientSchema")
@js.native
object buildClientSchema extends js.Object {
  def apply(introspection: IntrospectionQuery): typings.graphql.schemaMod.GraphQLSchema = js.native
  def apply(introspection: IntrospectionQuery, options: GraphQLSchemaValidationOptions): typings.graphql.schemaMod.GraphQLSchema = js.native
}

