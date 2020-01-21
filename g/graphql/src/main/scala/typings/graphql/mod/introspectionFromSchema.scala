package typings.graphql.mod

import typings.graphql.introspectionQueryMod.IntrospectionOptions
import typings.graphql.introspectionQueryMod.IntrospectionQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "introspectionFromSchema")
@js.native
object introspectionFromSchema extends js.Object {
  def apply(schema: typings.graphql.schemaMod.GraphQLSchema): IntrospectionQuery_ = js.native
  def apply(schema: typings.graphql.schemaMod.GraphQLSchema, options: IntrospectionOptions): IntrospectionQuery_ = js.native
}

