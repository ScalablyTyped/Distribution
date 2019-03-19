package typings
package graphqlDashRequestLib.graphqlDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-request", "ClientError")
@js.native
class ClientError protected ()
  extends graphqlDashRequestLib.distSrcTypesMod.ClientError {
  def this(response: graphqlDashRequestLib.distSrcTypesMod.GraphQLResponse, request: graphqlDashRequestLib.distSrcTypesMod.GraphQLRequestContext) = this()
}

/* static members */
@JSImport("graphql-request", "ClientError")
@js.native
object ClientError extends js.Object {
  /* private */ def extractMessage(response: js.Any): js.Any = js.native
}

