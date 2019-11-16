package typings.atKeystonejsKeystone.atKeystonejsKeystoneMod

import typings.atKeystonejsFields.atKeystonejsFieldsMod.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.AllFieldsOptions because Already inherited */ trait UnsplashOptions extends BaseFieldOptions {
  var accessKey: String
  var secretKey: String
}

object UnsplashOptions {
  @scala.inline
  def apply(
    accessKey: String,
    secretKey: String,
    `type`: FieldType,
    access: Access = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined
  ): UnsplashOptions = {
    val __obj = js.Dynamic.literal(accessKey = accessKey, secretKey = secretKey)
    __obj.updateDynamic("type")(`type`)
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks)
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired)
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique)
    __obj.asInstanceOf[UnsplashOptions]
  }
}

