package typings.graphqlCompose.mod.graphql

import typings.graphql.getIntrospectionQueryMod.IntrospectionOptions
import typings.graphql.getIntrospectionQueryMod.IntrospectionQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "graphql.introspectionFromSchema")
@js.native
object introspectionFromSchema extends js.Object {
  def apply(schema: typings.graphql.schemaMod.GraphQLSchema): IntrospectionQuery = js.native
  def apply(schema: typings.graphql.schemaMod.GraphQLSchema, options: IntrospectionOptions): IntrospectionQuery = js.native
}

