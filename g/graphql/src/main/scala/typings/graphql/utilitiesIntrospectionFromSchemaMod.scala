package typings.graphql

import typings.graphql.typeSchemaMod.GraphQLSchema
import typings.graphql.utilitiesIntrospectionQueryMod.IntrospectionOptions
import typings.graphql.utilitiesIntrospectionQueryMod.IntrospectionQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/introspectionFromSchema", JSImport.Namespace)
@js.native
object utilitiesIntrospectionFromSchemaMod extends js.Object {
  def introspectionFromSchema(schema: GraphQLSchema): IntrospectionQuery = js.native
  def introspectionFromSchema(schema: GraphQLSchema, options: IntrospectionOptions): IntrospectionQuery = js.native
}

