package typings.graphqlDashRelay.graphqlDashRelayMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.typeDefinitionMod.GraphQLFieldConfigMap
import typings.graphql.typeDefinitionMod.GraphQLInputFieldConfigMap
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphql.typeDefinitionMod.Thunk
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
  var outputFields: Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]] = js.native
  def mutateAndGetPayload(`object`: js.Any, ctx: js.Any, info: GraphQLResolveInfo): js.Promise[_] | js.Any = js.native
}

