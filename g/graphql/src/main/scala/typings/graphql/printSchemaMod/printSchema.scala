package typings.graphql.printSchemaMod

import typings.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/printSchema", "printSchema")
@js.native
object printSchema extends js.Object {
  def apply(schema: GraphQLSchema): String = js.native
  def apply(schema: GraphQLSchema, options: Options): String = js.native
}

