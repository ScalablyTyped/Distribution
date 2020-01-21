package typings.graphql

import typings.graphql.introspectionQueryMod.IntrospectionQuery_
import typings.graphql.schemaMod.GraphQLSchema
import typings.graphql.schemaMod.GraphQLSchemaValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/buildClientSchema", JSImport.Namespace)
@js.native
object buildClientSchemaMod extends js.Object {
  def buildClientSchema(introspection: IntrospectionQuery_): GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery_, options: Options): GraphQLSchema = js.native
  type Options = GraphQLSchemaValidationOptions
}

