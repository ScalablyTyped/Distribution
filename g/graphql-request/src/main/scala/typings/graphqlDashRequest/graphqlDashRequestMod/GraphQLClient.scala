package typings.graphqlDashRequest.graphqlDashRequestMod

import typings.graphqlDashRequest.Anon_Data
import typings.graphqlDashRequest.distSrcTypesMod.Headers
import typings.graphqlDashRequest.distSrcTypesMod.Options
import typings.graphqlDashRequest.distSrcTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-request", "GraphQLClient")
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

