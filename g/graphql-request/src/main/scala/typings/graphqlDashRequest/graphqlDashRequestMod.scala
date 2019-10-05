package typings.graphqlDashRequest

import typings.graphqlDashRequest.distSrcTypesMod.GraphQLRequestContext
import typings.graphqlDashRequest.distSrcTypesMod.GraphQLResponse
import typings.graphqlDashRequest.distSrcTypesMod.Headers
import typings.graphqlDashRequest.distSrcTypesMod.Options
import typings.graphqlDashRequest.distSrcTypesMod.Variables
import typings.graphqlDashRequest.graphqlDashRequestMod.GraphQLClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-request", JSImport.Namespace)
@js.native
object graphqlDashRequestMod extends js.Object {
  @js.native
  class ClientError protected ()
    extends typings.graphqlDashRequest.distSrcTypesMod.ClientError {
    def this(response: GraphQLResponse, request: GraphQLRequestContext) = this()
  }
  
  @js.native
  class GraphQLClient protected () extends js.Object {
    def this(url: String) = this()
    def this(url: String, options: Options) = this()
    var options: js.Any = js.native
    var url: js.Any = js.native
    def rawRequest[T /* <: js.Any */](query: String): js.Promise[Anon_Data[T]] = js.native
    def rawRequest[T /* <: js.Any */](query: String, variables: Variables): js.Promise[Anon_Data[T]] = js.native
    def request[T /* <: js.Any */](query: String): js.Promise[T] = js.native
    def request[T /* <: js.Any */](query: String, variables: Variables): js.Promise[T] = js.native
    def setHeader(key: String, value: String): GraphQLClient = js.native
    def setHeaders(headers: Headers): GraphQLClient = js.native
  }
  
  def default[T /* <: js.Any */](url: String, query: String): js.Promise[T] = js.native
  def default[T /* <: js.Any */](url: String, query: String, variables: Variables): js.Promise[T] = js.native
  def rawRequest[T /* <: js.Any */](url: String, query: String): js.Promise[Anon_Data[T]] = js.native
  def rawRequest[T /* <: js.Any */](url: String, query: String, variables: Variables): js.Promise[Anon_Data[T]] = js.native
  def request[T /* <: js.Any */](url: String, query: String): js.Promise[T] = js.native
  def request[T /* <: js.Any */](url: String, query: String, variables: Variables): js.Promise[T] = js.native
  /* static members */
  @js.native
  object ClientError extends js.Object {
    /* private */ def extractMessage(response: js.Any): js.Any = js.native
  }
  
}

