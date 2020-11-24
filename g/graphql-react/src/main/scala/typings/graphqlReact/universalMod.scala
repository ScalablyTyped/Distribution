package typings.graphqlReact

import typings.graphqlReact.anon.Cache
import typings.graphqlReact.anon.LoadOnMount
import typings.graphqlReact.mod.GraphQLOperationStatus
import typings.react.mod.Context
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-react/universal", JSImport.Namespace)
@js.native
object universalMod extends js.Object {
  
  val GraphQLContext: Context[typings.graphqlReact.mod.GraphQL] = js.native
  
  def reportCacheErrors(event: js.Any): Unit = js.native
  
  def ssr(grapphql: typings.graphqlReact.mod.GraphQL, node: ReactNode): Unit = js.native
  def ssr(
    grapphql: typings.graphqlReact.mod.GraphQL,
    node: ReactNode,
    render: js.Function1[/* element */ ReactNode, String]
  ): Unit = js.native
  
  def useGraphQL[T, V](options: LoadOnMount[V]): GraphQLOperationStatus[T] = js.native
  
  @js.native
  class GraphQL ()
    extends typings.graphqlReact.mod.GraphQL {
    def this(options: Cache) = this()
  }
}
