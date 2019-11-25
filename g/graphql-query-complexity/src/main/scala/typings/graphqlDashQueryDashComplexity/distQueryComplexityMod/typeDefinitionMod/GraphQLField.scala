package typings.graphqlDashQueryDashComplexity.distQueryComplexityMod.typeDefinitionMod

import typings.graphqlDashQueryDashComplexity.distQueryComplexityMod.Complexity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLField[TSource, TContext, TArgs] extends js.Object {
  var complexity: js.UndefOr[Complexity] = js.undefined
}

object GraphQLField {
  @scala.inline
  def apply[TSource, TContext, TArgs](complexity: Complexity = null): GraphQLField[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    if (complexity != null) __obj.updateDynamic("complexity")(complexity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLField[TSource, TContext, TArgs]]
  }
}

