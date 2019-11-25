package typings.graphql

import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLFieldConfigArgumentMap
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: GraphQLFieldConfigArgumentMap
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.undefined
  var isRepeatable: Boolean
}

object Anon_Args {
  @scala.inline
  def apply(
    args: GraphQLFieldConfigArgumentMap,
    isRepeatable: Boolean,
    extensions: Maybe[Record[String, _]] = null
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], isRepeatable = isRepeatable.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Args]
  }
}

