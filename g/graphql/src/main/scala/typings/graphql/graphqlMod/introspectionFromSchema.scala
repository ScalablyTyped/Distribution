package typings.graphql.graphqlMod

import typings.graphql.utilitiesIntrospectionQueryMod.IntrospectionOptions
import typings.graphql.utilitiesIntrospectionQueryMod.IntrospectionQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "introspectionFromSchema")
@js.native
object introspectionFromSchema extends js.Object {
  def apply(schema: typings.graphql.typeSchemaMod.GraphQLSchema): IntrospectionQuery = js.native
  def apply(schema: typings.graphql.typeSchemaMod.GraphQLSchema, options: IntrospectionOptions): IntrospectionQuery = js.native
}

