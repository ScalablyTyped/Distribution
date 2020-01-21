package typings.graphqlQueryComplexity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queryComplexityMod {
  type Complexity = js.Any
  type ComplexityEstimator = js.Function1[
    /* options */ typings.graphqlQueryComplexity.queryComplexityMod.ComplexityEstimatorArgs, 
    scala.Double | scala.Unit
  ]
}
