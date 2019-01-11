package typings
package graphqlDashErrorsLib.graphqlDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-errors", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def maskErrors(schema: graphqlLib.graphqlMod.GraphQLSchema): scala.Unit = js.native
  def maskErrors(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    fn: graphqlDashErrorsLib.graphqlDashErrorsMod.HandlerFunction
  ): scala.Unit = js.native
  def setDefaultHandler(fn: graphqlDashErrorsLib.graphqlDashErrorsMod.HandlerFunction): scala.Unit = js.native
}

