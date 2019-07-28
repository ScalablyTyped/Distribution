package typings.graphqlDashReact.universalMod

import typings.graphqlDashReact.Anon_FetchOptionsOverrideLoadOnMount
import typings.graphqlDashReact.graphqlDashReactMod.GraphQLOperationStatus
import typings.react.reactMod.Context
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-react/universal", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val GraphQLContext: Context[typings.graphqlDashReact.graphqlDashReactMod.GraphQL] = js.native
  def reportCacheErrors(event: js.Any): Unit = js.native
  def ssr(grapphql: typings.graphqlDashReact.graphqlDashReactMod.GraphQL, node: ReactNode): Unit = js.native
  def ssr(
    grapphql: typings.graphqlDashReact.graphqlDashReactMod.GraphQL,
    node: ReactNode,
    render: js.Function1[/* element */ ReactNode, String]
  ): Unit = js.native
  def useGraphQL[T, V](options: Anon_FetchOptionsOverrideLoadOnMount[V]): GraphQLOperationStatus[T] = js.native
}

