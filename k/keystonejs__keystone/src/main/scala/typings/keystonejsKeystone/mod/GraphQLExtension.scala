package typings.keystonejsKeystone.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLExtension[Source, Context] extends js.Object {
  var access: js.UndefOr[Access] = js.native
  @JSName("resolver")
  var resolver_Original: GraphQLFieldResolver[Source, Context, StringDictionary[_]] = js.native
  var schema: String = js.native
  def resolver(source: Source, args: StringDictionary[js.Any], context: Context, info: GraphQLResolveInfo): js.Any = js.native
}

