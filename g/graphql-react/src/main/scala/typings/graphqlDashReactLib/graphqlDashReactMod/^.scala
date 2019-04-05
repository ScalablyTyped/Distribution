package typings
package graphqlDashReactLib.graphqlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-react", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val GraphQLContext: reactLib.reactMod.ReactNs.Context[GraphQL] = js.native
  def reportCacheErrors(event: js.Any): scala.Unit = js.native
  def ssr(grapphql: GraphQL, node: reactLib.reactMod.ReactNs.ReactNode): scala.Unit = js.native
  def ssr(
    grapphql: GraphQL,
    node: reactLib.reactMod.ReactNs.ReactNode,
    render: js.Function1[/* element */ reactLib.reactMod.ReactNs.ReactNode, java.lang.String]
  ): scala.Unit = js.native
  def useGraphQL[T, V](options: graphqlDashReactLib.Anon_FetchOptionsOverrideLoadOnMount[V]): GraphQLOperationStatus[T] = js.native
}

