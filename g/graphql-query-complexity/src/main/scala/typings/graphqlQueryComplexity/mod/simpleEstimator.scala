package typings.graphqlQueryComplexity.mod

import typings.graphqlQueryComplexity.anon.DefaultComplexity
import typings.graphqlQueryComplexity.queryComplexityMod.ComplexityEstimator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-query-complexity", "simpleEstimator")
@js.native
object simpleEstimator extends js.Object {
  def apply(): ComplexityEstimator = js.native
  def apply(options: DefaultComplexity): ComplexityEstimator = js.native
}

