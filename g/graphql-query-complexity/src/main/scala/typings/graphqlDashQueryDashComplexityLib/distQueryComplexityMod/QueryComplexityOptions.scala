package typings
package graphqlDashQueryDashComplexityLib.distQueryComplexityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryComplexityOptions extends js.Object {
  var createError: js.UndefOr[
    js.Function2[
      /* max */ scala.Double, 
      /* actual */ scala.Double, 
      graphqlLib.graphqlMod.GraphQLError
    ]
  ] = js.undefined
  var maximumComplexity: scala.Double
  var onComplete: js.UndefOr[js.Function1[/* complexity */ scala.Double, scala.Unit]] = js.undefined
  var variables: js.UndefOr[js.Object] = js.undefined
}

object QueryComplexityOptions {
  @scala.inline
  def apply(
    maximumComplexity: scala.Double,
    createError: (/* max */ scala.Double, /* actual */ scala.Double) => graphqlLib.graphqlMod.GraphQLError = null,
    onComplete: /* complexity */ scala.Double => scala.Unit = null,
    variables: js.Object = null
  ): QueryComplexityOptions = {
    val __obj = js.Dynamic.literal(maximumComplexity = maximumComplexity)
    if (createError != null) __obj.updateDynamic("createError")(js.Any.fromFunction2(createError))
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[QueryComplexityOptions]
  }
}

