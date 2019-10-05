package typings.graphqlDashErrors

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashErrors.graphqlDashErrorsMod.HandlerFunction
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-errors", JSImport.Namespace)
@js.native
object graphqlDashErrorsMod extends js.Object {
  @js.native
  class UserError protected () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  def maskErrors(schema: GraphQLSchema): Unit = js.native
  def maskErrors(schema: GraphQLSchema, fn: HandlerFunction): Unit = js.native
  def setDefaultHandler(fn: HandlerFunction): Unit = js.native
  type HandlerFunction = js.Function1[/* err */ Error, Error]
}

