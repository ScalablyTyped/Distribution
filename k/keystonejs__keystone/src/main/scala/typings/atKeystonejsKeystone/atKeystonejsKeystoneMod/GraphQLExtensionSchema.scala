package typings.atKeystonejsKeystone.atKeystonejsKeystoneMod

import typings.atKeystonejsKeystone.Anon_Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLExtensionSchema extends js.Object {
  var mutations: js.UndefOr[js.Array[GraphQLExtension[_, _]]] = js.undefined
  var queries: js.UndefOr[js.Array[GraphQLExtension[_, _]]] = js.undefined
  var types: js.UndefOr[js.Array[Anon_Type]] = js.undefined
}

object GraphQLExtensionSchema {
  @scala.inline
  def apply(
    mutations: js.Array[GraphQLExtension[_, _]] = null,
    queries: js.Array[GraphQLExtension[_, _]] = null,
    types: js.Array[Anon_Type] = null
  ): GraphQLExtensionSchema = {
    val __obj = js.Dynamic.literal()
    if (mutations != null) __obj.updateDynamic("mutations")(mutations.asInstanceOf[js.Any])
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLExtensionSchema]
  }
}

