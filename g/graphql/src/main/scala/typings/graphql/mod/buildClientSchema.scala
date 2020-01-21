package typings.graphql.mod

import typings.graphql.buildClientSchemaMod.Options
import typings.graphql.introspectionQueryMod.IntrospectionQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "buildClientSchema")
@js.native
object buildClientSchema extends js.Object {
  def apply(introspection: IntrospectionQuery_): typings.graphql.schemaMod.GraphQLSchema = js.native
  def apply(introspection: IntrospectionQuery_, options: Options): typings.graphql.schemaMod.GraphQLSchema = js.native
}

