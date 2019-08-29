package typings.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilitiesCoerceInputValueMod {
  import typings.graphql.errorGraphQLErrorMod.GraphQLError

  type OnErrorCB = js.Function3[
    /* path */ js.Array[String | Double], 
    /* invalidValue */ js.Any, 
    /* error */ GraphQLError, 
    Unit
  ]
}
