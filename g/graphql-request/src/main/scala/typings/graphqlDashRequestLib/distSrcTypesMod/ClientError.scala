package typings
package graphqlDashRequestLib.distSrcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-request/dist/src/types", "ClientError")
@js.native
class ClientError protected ()
  extends stdLib.Error {
  def this(response: GraphQLResponse, request: GraphQLRequestContext) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var request: GraphQLRequestContext = js.native
  var response: GraphQLResponse = js.native
}

/* static members */
@JSImport("graphql-request/dist/src/types", "ClientError")
@js.native
object ClientError extends js.Object {
  /* private */ def extractMessage(response: js.Any): js.Any = js.native
}

