package typings.atKeystonejsKeystone.atKeystonejsKeystoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Hooks */
trait ListSchema[Fields /* <: String */] extends js.Object {
   // TODO: investigate if a specific type can be provided
  var access: js.UndefOr[Access] = js.undefined
  var fields: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ fieldName in Fields ]: @keystonejs/keystone.@keystonejs/keystone.AllFieldsOptions<string>}
    */ typings.atKeystonejsKeystone.atKeystonejsKeystoneStrings.ListSchema with js.Any
  var hooks: js.UndefOr[Hooks] = js.undefined
  var listAdapterClass: js.UndefOr[js.Any] = js.undefined
  var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
}

object ListSchema {
  @scala.inline
  def apply[Fields /* <: String */](
    fields: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ fieldName in Fields ]: @keystonejs/keystone.@keystonejs/keystone.AllFieldsOptions<string>}
    */ typings.atKeystonejsKeystone.atKeystonejsKeystoneStrings.ListSchema with js.Any,
    access: Access = null,
    hooks: Hooks = null,
    listAdapterClass: js.Any = null,
    plugins: js.Array[Plugin] = null
  ): ListSchema[Fields] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (listAdapterClass != null) __obj.updateDynamic("listAdapterClass")(listAdapterClass.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchema[Fields]]
  }
}

