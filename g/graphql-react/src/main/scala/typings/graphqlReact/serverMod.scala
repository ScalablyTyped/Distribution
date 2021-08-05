package typings.graphqlReact

import typings.graphqlReact.mod.GraphQL
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("graphql-react/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ssr(graphql: GraphQL, node: ReactElement): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("ssr")(graphql.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def ssr(graphql: GraphQL, node: ReactElement, render: js.Function1[/* element */ ReactElement, String]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("ssr")(graphql.asInstanceOf[js.Any], node.asInstanceOf[js.Any], render.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
