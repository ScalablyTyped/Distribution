package typings.graphqlDashReact

import typings.graphqlDashReact.graphqlDashReactMod.GraphQLOperationStatus
import typings.react.reactMod.Context
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-react/universal", JSImport.Namespace)
@js.native
object universalMod extends js.Object {
  @js.native
  class GraphQL ()
    extends typings.graphqlDashReact.graphqlDashReactMod.GraphQL {
    def this(options: Anon_Cache) = this()
  }
  
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

