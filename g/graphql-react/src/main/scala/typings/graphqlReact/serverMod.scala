package typings.graphqlReact

import typings.graphqlReact.mod.GraphQL
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-react/server", JSImport.Namespace)
@js.native
object serverMod extends js.Object {
  def ssr(graphql: GraphQL, node: ReactElement): js.Promise[String] = js.native
  def ssr(graphql: GraphQL, node: ReactElement, render: js.Function1[/* element */ ReactElement, String]): js.Promise[String] = js.native
}

