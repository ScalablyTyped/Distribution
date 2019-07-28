package typings.graphqlDashRequest.graphqlDashRequestMod

import typings.graphqlDashRequest.distSrcTypesMod.GraphQLRequestContext
import typings.graphqlDashRequest.distSrcTypesMod.GraphQLResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-request", "ClientError")
@js.native
class ClientError protected ()
  extends typings.graphqlDashRequest.distSrcTypesMod.ClientError {
  def this(response: GraphQLResponse, request: GraphQLRequestContext) = this()
}

/* static members */
@JSImport("graphql-request", "ClientError")
@js.native
object ClientError extends js.Object {
  /* private */ def extractMessage(response: js.Any): js.Any = js.native
}

