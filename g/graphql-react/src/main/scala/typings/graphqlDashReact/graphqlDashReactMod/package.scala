package typings.graphqlDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphqlDashReactMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.graphqlDashReact.Anon_Query
  import typings.graphqlDashReact.Anon_Variables

  type GraphQLCache = StringDictionary[GraphQLCacheValue[js.Any]]
  type GraphQLCacheKey = String
  type GraphQLFetchOptionsOverride = js.Function1[/* options */ GraphQLFetchOptions, Unit]
  type GraphQLOperation[V] = Anon_Query with (Anon_Variables[V] | js.Object)
}
