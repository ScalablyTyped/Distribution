package typings.graphql

import typings.graphql.definitionMod.GraphQLInputType
import typings.graphql.graphQLErrorMod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/coerceInputValue", JSImport.Namespace)
@js.native
object coerceInputValueMod extends js.Object {
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType): js.Any = js.native
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType, onError: OnErrorCB): js.Any = js.native
  type OnErrorCB = js.Function3[
    /* path */ js.Array[String | Double], 
    /* invalidValue */ js.Any, 
    /* error */ GraphQLError, 
    Unit
  ]
}

