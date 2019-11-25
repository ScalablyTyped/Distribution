package typings.graphqlDashQueryDashComplexity.distQueryComplexityMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.typeDefinitionMod.GraphQLCompositeType
import typings.graphql.typeDefinitionMod.GraphQLField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComplexityEstimatorArgs extends js.Object {
  var args: StringDictionary[js.Any]
  var childComplexity: Double
  var field: GraphQLField[_, _, StringDictionary[_]]
  var `type`: GraphQLCompositeType
}

object ComplexityEstimatorArgs {
  @scala.inline
  def apply(
    args: StringDictionary[js.Any],
    childComplexity: Double,
    field: GraphQLField[_, _, StringDictionary[_]],
    `type`: GraphQLCompositeType
  ): ComplexityEstimatorArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], childComplexity = childComplexity.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexityEstimatorArgs]
  }
}

