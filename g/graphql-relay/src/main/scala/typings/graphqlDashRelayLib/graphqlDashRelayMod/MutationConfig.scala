package typings
package graphqlDashRelayLib.graphqlDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationConfig extends js.Object {
  var deprecationReason: js.UndefOr[java.lang.String] = js.native
  var description: js.UndefOr[java.lang.String] = js.native
  var inputFields: graphqlLib.typeDefinitionMod.Thunk[graphqlLib.typeDefinitionMod.GraphQLInputFieldConfigMap] = js.native
  @JSName("mutateAndGetPayload")
  var mutateAndGetPayload_Original: mutationFn = js.native
  var name: java.lang.String = js.native
  var outputFields: graphqlLib.typeDefinitionMod.Thunk[
    graphqlLib.typeDefinitionMod.GraphQLFieldConfigMap[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.native
  def mutateAndGetPayload(`object`: js.Any, ctx: js.Any, info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo): js.Promise[_] | js.Any = js.native
}

