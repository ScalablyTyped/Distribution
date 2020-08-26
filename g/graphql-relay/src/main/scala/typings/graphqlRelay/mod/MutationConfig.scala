package typings.graphqlRelay.mod

import typings.graphql.definitionMod.GraphQLFieldConfigMap
import typings.graphql.definitionMod.GraphQLInputFieldConfigMap
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.definitionMod.Thunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationConfig extends js.Object {
  var deprecationReason: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var inputFields: Thunk[GraphQLInputFieldConfigMap] = js.native
  @JSName("mutateAndGetPayload")
  var mutateAndGetPayload_Original: mutationFn = js.native
  var name: String = js.native
  var outputFields: Thunk[GraphQLFieldConfigMap[_, _]] = js.native
  def mutateAndGetPayload(`object`: js.Any, ctx: js.Any, info: GraphQLResolveInfo): js.Promise[_] | js.Any = js.native
}

