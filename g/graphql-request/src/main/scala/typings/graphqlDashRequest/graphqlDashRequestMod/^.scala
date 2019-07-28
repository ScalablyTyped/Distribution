package typings.graphqlDashRequest.graphqlDashRequestMod

import typings.graphqlDashRequest.Anon_Data
import typings.graphqlDashRequest.distSrcTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-request", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[T /* <: js.Any */](url: String, query: String): js.Promise[T] = js.native
  def default[T /* <: js.Any */](url: String, query: String, variables: Variables): js.Promise[T] = js.native
  def rawRequest[T /* <: js.Any */](url: String, query: String): js.Promise[Anon_Data[T]] = js.native
  def rawRequest[T /* <: js.Any */](url: String, query: String, variables: Variables): js.Promise[Anon_Data[T]] = js.native
  def request[T /* <: js.Any */](url: String, query: String): js.Promise[T] = js.native
  def request[T /* <: js.Any */](url: String, query: String, variables: Variables): js.Promise[T] = js.native
}

