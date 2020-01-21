package typings.graphql

import typings.graphql.introspectionQueryMod.IntrospectionOptions
import typings.graphql.introspectionQueryMod.IntrospectionQuery_
import typings.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/introspectionFromSchema", JSImport.Namespace)
@js.native
object introspectionFromSchemaMod extends js.Object {
  def introspectionFromSchema(schema: GraphQLSchema): IntrospectionQuery_ = js.native
  def introspectionFromSchema(schema: GraphQLSchema, options: IntrospectionOptions): IntrospectionQuery_ = js.native
}

