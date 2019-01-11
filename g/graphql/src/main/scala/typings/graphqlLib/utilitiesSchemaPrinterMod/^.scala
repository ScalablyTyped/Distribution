package typings
package graphqlLib.utilitiesSchemaPrinterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/schemaPrinter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def printIntrospectionSchema(schema: graphqlLib.typeSchemaMod.GraphQLSchema): java.lang.String = js.native
  def printIntrospectionSchema(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    options: graphqlLib.utilitiesSchemaPrinterMod.Options
  ): java.lang.String = js.native
  def printSchema(schema: graphqlLib.typeSchemaMod.GraphQLSchema): java.lang.String = js.native
  def printSchema(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    options: graphqlLib.utilitiesSchemaPrinterMod.Options
  ): java.lang.String = js.native
  def printType(`type`: graphqlLib.typeDefinitionMod.GraphQLNamedType): java.lang.String = js.native
  def printType(
    `type`: graphqlLib.typeDefinitionMod.GraphQLNamedType,
    options: graphqlLib.utilitiesSchemaPrinterMod.Options
  ): java.lang.String = js.native
}

