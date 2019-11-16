package typings.atKeystonejsAdapterDashKnex.atKeystonejsAdapterDashKnexMod

import typings.knex.knexMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnexAdaptorOptions extends js.Object {
  var knexOptions: js.UndefOr[Config] = js.undefined
  var listAdapterClass: js.UndefOr[js.Any] = js.undefined
  var schemaName: js.UndefOr[String] = js.undefined
}

object KnexAdaptorOptions {
  @scala.inline
  def apply(knexOptions: Config = null, listAdapterClass: js.Any = null, schemaName: String = null): KnexAdaptorOptions = {
    val __obj = js.Dynamic.literal()
    if (knexOptions != null) __obj.updateDynamic("knexOptions")(knexOptions)
    if (listAdapterClass != null) __obj.updateDynamic("listAdapterClass")(listAdapterClass)
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName)
    __obj.asInstanceOf[KnexAdaptorOptions]
  }
}

