package typings.graphqlDashReact.graphqlDashReactMod

import typings.graphqlDashReact.Anon_FetchOptionsOverrideLoadOnMount
import typings.react.reactMod.Context
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-react", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val GraphQLContext: Context[GraphQL] = js.native
  def reportCacheErrors(event: js.Any): Unit = js.native
  def ssr(grapphql: GraphQL, node: ReactNode): Unit = js.native
  def ssr(grapphql: GraphQL, node: ReactNode, render: js.Function1[/* element */ ReactNode, String]): Unit = js.native
  def useGraphQL[T, V](options: Anon_FetchOptionsOverrideLoadOnMount[V]): GraphQLOperationStatus[T] = js.native
}

