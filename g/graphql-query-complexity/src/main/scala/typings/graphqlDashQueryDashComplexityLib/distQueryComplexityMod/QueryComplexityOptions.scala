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

