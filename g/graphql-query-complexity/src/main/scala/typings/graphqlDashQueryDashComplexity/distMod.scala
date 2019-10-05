package typings.graphqlDashQueryDashComplexity

import typings.graphqlDashQueryDashComplexity.distMod.ComplexityResolver
import typings.graphqlDashQueryDashComplexity.distQueryComplexityMod.QueryComplexityOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-query-complexity/dist", JSImport.Namespace)
@js.native
object distMod extends js.Object {
  def default(options: QueryComplexityOptions): js.Function0[Unit] = js.native
  type Complexity = Double | ComplexityResolver
  type ComplexityResolver = js.Function2[/* args */ js.Any, /* complexity */ Double, Double]
}

