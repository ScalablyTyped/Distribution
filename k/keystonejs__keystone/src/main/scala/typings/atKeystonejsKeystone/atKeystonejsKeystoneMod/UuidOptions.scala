package typings.atKeystonejsKeystone.atKeystonejsKeystoneMod

import typings.atKeystonejsFields.atKeystonejsFieldsMod.FieldType
import typings.atKeystonejsKeystone.atKeystonejsKeystoneStrings.lower
import typings.atKeystonejsKeystone.atKeystonejsKeystoneStrings.upper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.AllFieldsOptions because Already inherited */ trait UuidOptions extends BaseFieldOptions {
  // do we have other possible values here ?
  var caseTo: upper | lower
}

object UuidOptions {
  @scala.inline
  def apply(
    caseTo: upper | lower,
    `type`: FieldType,
    access: Access = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined
  ): UuidOptions = {
    val __obj = js.Dynamic.literal(caseTo = caseTo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks)
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired)
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique)
    __obj.asInstanceOf[UuidOptions]
  }
}

