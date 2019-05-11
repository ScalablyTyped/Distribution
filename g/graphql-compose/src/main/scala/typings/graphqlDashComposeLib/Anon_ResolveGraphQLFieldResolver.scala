package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ResolveGraphQLFieldResolver[TSource, TContext, TArgs] extends js.Object {
  @JSName("resolve")
  var resolve_Original: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[TSource, TContext, TArgs] = js.native
  def resolve(
    source: TSource,
    args: TArgs,
    context: TContext,
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo
  ): js.Any = js.native
}

