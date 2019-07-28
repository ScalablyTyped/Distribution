package typings.graphqlDashReact

import org.scalablytyped.runtime.StringDictionary
import typings.graphqlDashReact.Anon_Query
import typings.graphqlDashReact.Anon_Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphqlDashReactMod {
  type GraphQLCache = StringDictionary[GraphQLCacheValue[js.Any]]
  type GraphQLCacheKey = String
  type GraphQLFetchOptionsOverride = js.Function1[/* options */ GraphQLFetchOptions, Unit]
  type GraphQLOperation[V] = Anon_Query with (Anon_Variables[V] | js.Object)
}
