package typings.graphql.mod

import typings.graphql.schemaPrinterMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "printSchema")
@js.native
object printSchema extends js.Object {
  def apply(schema: typings.graphql.schemaMod.GraphQLSchema): String = js.native
  def apply(schema: typings.graphql.schemaMod.GraphQLSchema, options: Options): String = js.native
}

