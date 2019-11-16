package typings.atKeystonejsKeystone

import typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.AccessCallback
import typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.GraphQLWhereClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auth extends js.Object {
  var auth: js.UndefOr[Boolean] = js.undefined
  var create: js.UndefOr[Boolean | AccessCallback] = js.undefined
  var delete: js.UndefOr[Boolean | AccessCallback] = js.undefined
  var read: js.UndefOr[Boolean | GraphQLWhereClause | AccessCallback] = js.undefined
  var update: js.UndefOr[Boolean | AccessCallback] = js.undefined
}

object Anon_Auth {
  @scala.inline
  def apply(
    auth: js.UndefOr[Boolean] = js.undefined,
    create: Boolean | AccessCallback = null,
    delete: Boolean | AccessCallback = null,
    read: Boolean | GraphQLWhereClause | AccessCallback = null,
    update: Boolean | AccessCallback = null
  ): Anon_Auth = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(auth)) __obj.updateDynamic("auth")(auth)
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Auth]
  }
}

