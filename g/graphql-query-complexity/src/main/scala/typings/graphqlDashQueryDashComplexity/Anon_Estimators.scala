package typings.graphqlDashQueryDashComplexity

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.languageAstMod.DocumentNode
import typings.graphqlDashQueryDashComplexity.distQueryComplexityMod.ComplexityEstimator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Estimators extends js.Object {
  var estimators: js.Array[ComplexityEstimator]
  var query: DocumentNode
  var schema: GraphQLSchema
  var variables: js.UndefOr[js.Object] = js.undefined
}

object Anon_Estimators {
  @scala.inline
  def apply(
    estimators: js.Array[ComplexityEstimator],
    query: DocumentNode,
    schema: GraphQLSchema,
    variables: js.Object = null
  ): Anon_Estimators = {
    val __obj = js.Dynamic.literal(estimators = estimators.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Estimators]
  }
}

