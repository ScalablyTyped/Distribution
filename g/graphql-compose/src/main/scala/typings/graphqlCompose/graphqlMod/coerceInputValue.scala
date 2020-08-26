package typings.graphqlCompose.graphqlMod

import typings.graphql.coerceInputValueMod.OnErrorCB
import typings.graphql.definitionMod.GraphQLInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "coerceInputValue")
@js.native
object coerceInputValue extends js.Object {
  def apply(inputValue: js.Any, `type`: GraphQLInputType): js.Any = js.native
  def apply(inputValue: js.Any, `type`: GraphQLInputType, onError: OnErrorCB): js.Any = js.native
}

