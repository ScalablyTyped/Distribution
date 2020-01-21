package typings.graphqlReact.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-react", "ssr")
@js.native
object ssr extends js.Object {
  def apply(grapphql: GraphQL, node: ReactNode): Unit = js.native
  def apply(grapphql: GraphQL, node: ReactNode, render: js.Function1[/* element */ ReactNode, String]): Unit = js.native
}

