package typings.atKeystonejsKeystone.atKeystonejsKeystoneMod

import typings.atKeystonejsFields.atKeystonejsFieldsMod.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists
  */
trait BaseFieldOptions
  extends AllFieldsOptions[js.Any] {
  var access: js.UndefOr[Access] = js.undefined
  var hooks: js.UndefOr[Hooks] = js.undefined
  var isRequired: js.UndefOr[Boolean] = js.undefined
  var isUnique: js.UndefOr[Boolean] = js.undefined
  var `type`: FieldType
}

object BaseFieldOptions {
  @scala.inline
  def apply(
    `type`: FieldType,
    access: Access = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined
  ): BaseFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFieldOptions]
  }
}

