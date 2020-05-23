package typings.graphqlQueryComplexity

import typings.graphqlQueryComplexity.anon.DefaultComplexity
import typings.graphqlQueryComplexity.queryComplexityMod.ComplexityEstimator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-query-complexity/dist/estimators/simple", JSImport.Namespace)
@js.native
object simpleMod extends js.Object {
  def default(): ComplexityEstimator = js.native
  def default(options: DefaultComplexity): ComplexityEstimator = js.native
}

