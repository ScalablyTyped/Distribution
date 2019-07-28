package typings.graphql.utilitiesSchemaPrinterMod

import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/schemaPrinter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def printIntrospectionSchema(schema: GraphQLSchema): String = js.native
  def printIntrospectionSchema(schema: GraphQLSchema, options: Options): String = js.native
  def printSchema(schema: GraphQLSchema): String = js.native
  def printSchema(schema: GraphQLSchema, options: Options): String = js.native
  def printType(`type`: GraphQLNamedType): String = js.native
  def printType(`type`: GraphQLNamedType, options: Options): String = js.native
}

