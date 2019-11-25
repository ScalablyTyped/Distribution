package typings.atKeystonejsKeystone.atKeystonejsKeystoneMod

import typings.atKeystonejsFields.atKeystonejsFieldsMod.FieldType
import typings.atKeystonejsKeystone.atKeystonejsKeystoneStrings.ID
import typings.atKeystonejsKeystone.atKeystonejsKeystoneStrings.Int
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.AllFieldsOptions because Already inherited */ trait AutoIncrementOptions extends BaseFieldOptions {
  var gqlType: js.UndefOr[Int | ID] = js.undefined
}

object AutoIncrementOptions {
  @scala.inline
  def apply(
    `type`: FieldType,
    access: Access = null,
    gqlType: Int | ID = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined
  ): AutoIncrementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (gqlType != null) __obj.updateDynamic("gqlType")(gqlType.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoIncrementOptions]
  }
}

