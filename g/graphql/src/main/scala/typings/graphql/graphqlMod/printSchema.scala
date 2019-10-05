package typings.graphql.graphqlMod

import typings.graphql.utilitiesSchemaPrinterMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "printSchema")
@js.native
object printSchema extends js.Object {
  def apply(schema: typings.graphql.typeSchemaMod.GraphQLSchema): String = js.native
  def apply(schema: typings.graphql.typeSchemaMod.GraphQLSchema, options: Options): String = js.native
}

