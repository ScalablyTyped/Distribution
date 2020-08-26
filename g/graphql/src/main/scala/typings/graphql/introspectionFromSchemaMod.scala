package typings.graphql

import typings.graphql.getIntrospectionQueryMod.IntrospectionOptions
import typings.graphql.getIntrospectionQueryMod.IntrospectionQuery
import typings.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/introspectionFromSchema", JSImport.Namespace)
@js.native
object introspectionFromSchemaMod extends js.Object {
  def introspectionFromSchema(schema: GraphQLSchema): IntrospectionQuery = js.native
  def introspectionFromSchema(schema: GraphQLSchema, options: IntrospectionOptions): IntrospectionQuery = js.native
}

