package typings
package graphqlDashRequestLib.graphqlDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-request", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[T /* <: js.Any */](url: java.lang.String, query: java.lang.String): js.Promise[T] = js.native
  def default[T /* <: js.Any */](
    url: java.lang.String,
    query: java.lang.String,
    variables: graphqlDashRequestLib.distSrcTypesMod.Variables
  ): js.Promise[T] = js.native
  def rawRequest[T /* <: js.Any */](url: java.lang.String, query: java.lang.String): js.Promise[graphqlDashRequestLib.Anon_Data[T]] = js.native
  def rawRequest[T /* <: js.Any */](
    url: java.lang.String,
    query: java.lang.String,
    variables: graphqlDashRequestLib.distSrcTypesMod.Variables
  ): js.Promise[graphqlDashRequestLib.Anon_Data[T]] = js.native
  def request[T /* <: js.Any */](url: java.lang.String, query: java.lang.String): js.Promise[T] = js.native
  def request[T /* <: js.Any */](
    url: java.lang.String,
    query: java.lang.String,
    variables: graphqlDashRequestLib.distSrcTypesMod.Variables
  ): js.Promise[T] = js.native
}

