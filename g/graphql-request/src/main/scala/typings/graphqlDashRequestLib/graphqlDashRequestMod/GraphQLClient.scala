package typings
package graphqlDashRequestLib.graphqlDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-request", "GraphQLClient")
@js.native
class GraphQLClient protected () extends js.Object {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, options: graphqlDashRequestLib.distSrcTypesMod.Options) = this()
  var options: js.Any = js.native
  var url: js.Any = js.native
  def rawRequest[T /* <: js.Any */](query: java.lang.String): js.Promise[graphqlDashRequestLib.Anon_Data[T]] = js.native
  def rawRequest[T /* <: js.Any */](query: java.lang.String, variables: graphqlDashRequestLib.distSrcTypesMod.Variables): js.Promise[graphqlDashRequestLib.Anon_Data[T]] = js.native
  def request[T /* <: js.Any */](query: java.lang.String): js.Promise[T] = js.native
  def request[T /* <: js.Any */](query: java.lang.String, variables: graphqlDashRequestLib.distSrcTypesMod.Variables): js.Promise[T] = js.native
  def setHeader(key: java.lang.String, value: java.lang.String): GraphQLClient = js.native
  def setHeaders(headers: graphqlDashRequestLib.distSrcTypesMod.Headers): GraphQLClient = js.native
}

