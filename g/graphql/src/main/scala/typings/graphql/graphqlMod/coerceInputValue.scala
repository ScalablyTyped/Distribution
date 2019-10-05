package typings.graphql.graphqlMod

import typings.graphql.typeDefinitionMod.GraphQLInputType
import typings.graphql.utilitiesCoerceInputValueMod.OnErrorCB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "coerceInputValue")
@js.native
object coerceInputValue extends js.Object {
  def apply(inputValue: js.Any, `type`: GraphQLInputType): js.Any = js.native
  def apply(inputValue: js.Any, `type`: GraphQLInputType, onError: OnErrorCB): js.Any = js.native
}

