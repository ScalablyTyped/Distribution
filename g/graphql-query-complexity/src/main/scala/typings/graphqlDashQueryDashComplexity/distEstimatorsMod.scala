package typings.graphqlDashQueryDashComplexity

import typings.graphqlDashQueryDashComplexity.distQueryComplexityMod.ComplexityEstimator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-query-complexity/dist/estimators", JSImport.Namespace)
@js.native
object distEstimatorsMod extends js.Object {
  def directiveEstimator(): ComplexityEstimator = js.native
  def directiveEstimator(options: js.Object): ComplexityEstimator = js.native
  def fieldConfigEstimator(): ComplexityEstimator = js.native
  def fieldExtensionsEstimator(): ComplexityEstimator = js.native
  def legacyEstimator(): ComplexityEstimator = js.native
  def simpleEstimator(): ComplexityEstimator = js.native
  def simpleEstimator(options: Anon_DefaultComplexity): ComplexityEstimator = js.native
}

