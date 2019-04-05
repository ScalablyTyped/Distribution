package typings
package graphqlDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphqlDashReactMod {
  type GraphQLCacheKey = java.lang.String
  type GraphQLFetchOptionsOverride = js.Function1[/* options */ GraphQLFetchOptions, scala.Unit]
  type GraphQLOperation[V] = graphqlDashReactLib.Anon_Query with (graphqlDashReactLib.Anon_Variables[V] | js.Object)
}
