package typings.atKeystonejsApolloDashHelpers.atKeystonejsApolloDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeystoneMutationTypeProps extends js.Object {
  var invalidatesTypes: js.UndefOr[Boolean] = js.undefined
  var mutation: String
}

object KeystoneMutationTypeProps {
  @scala.inline
  def apply(mutation: String, invalidatesTypes: js.UndefOr[Boolean] = js.undefined): KeystoneMutationTypeProps = {
    val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any])
    if (!js.isUndefined(invalidatesTypes)) __obj.updateDynamic("invalidatesTypes")(invalidatesTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeystoneMutationTypeProps]
  }
}

