package typings.graphqlDashQueryDashComplexity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distMod {
  type Complexity = Double | ComplexityResolver
  type ComplexityResolver = js.Function2[/* args */ js.Any, /* complexity */ Double, Double]
}
