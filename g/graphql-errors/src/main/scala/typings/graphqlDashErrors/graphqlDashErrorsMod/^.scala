package typings.graphqlDashErrors.graphqlDashErrorsMod

import typings.graphql.graphqlMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-errors", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def maskErrors(schema: GraphQLSchema): Unit = js.native
  def maskErrors(schema: GraphQLSchema, fn: HandlerFunction): Unit = js.native
  def setDefaultHandler(fn: HandlerFunction): Unit = js.native
}

