package typings.graphql.graphqlMod

import typings.graphql.utilitiesBuildClientSchemaMod.Options
import typings.graphql.utilitiesIntrospectionQueryMod.IntrospectionQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "buildClientSchema")
@js.native
object buildClientSchema extends js.Object {
  def apply(introspection: IntrospectionQuery): typings.graphql.typeSchemaMod.GraphQLSchema = js.native
  def apply(introspection: IntrospectionQuery, options: Options): typings.graphql.typeSchemaMod.GraphQLSchema = js.native
}

