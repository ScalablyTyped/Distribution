package typings.graphql.utilitiesSchemaPrinterMod

import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/schemaPrinter", "printSchema")
@js.native
object printSchema extends js.Object {
  def apply(schema: GraphQLSchema): String = js.native
  def apply(schema: GraphQLSchema, options: Options): String = js.native
}

