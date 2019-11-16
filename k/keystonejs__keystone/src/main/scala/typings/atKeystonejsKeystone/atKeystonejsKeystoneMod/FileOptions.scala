package typings.atKeystonejsKeystone.atKeystonejsKeystoneMod

import typings.atKeystonejsFields.atKeystonejsFieldsMod.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.AllFieldsOptions because Already inherited */ trait FileOptions extends BaseFieldOptions {
  var adapter: js.UndefOr[js.Any] = js.undefined
  var route: js.UndefOr[String] = js.undefined
}

object FileOptions {
  @scala.inline
  def apply(
    `type`: FieldType,
    access: Access = null,
    adapter: js.Any = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined,
    route: String = null
  ): FileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (adapter != null) __obj.updateDynamic("adapter")(adapter)
    if (hooks != null) __obj.updateDynamic("hooks")(hooks)
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired)
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique)
    if (route != null) __obj.updateDynamic("route")(route)
    __obj.asInstanceOf[FileOptions]
  }
}

