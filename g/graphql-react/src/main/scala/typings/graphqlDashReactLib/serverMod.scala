package typings
package graphqlDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-react/server", JSImport.Namespace)
@js.native
object serverMod extends js.Object {
  def ssr(graphql: graphqlDashReactLib.graphqlDashReactMod.GraphQL, node: reactLib.reactMod.ReactElement): js.Promise[java.lang.String] = js.native
  def ssr(
    graphql: graphqlDashReactLib.graphqlDashReactMod.GraphQL,
    node: reactLib.reactMod.ReactElement,
    render: js.Function1[/* element */ reactLib.reactMod.ReactElement, java.lang.String]
  ): js.Promise[java.lang.String] = js.native
}

