package typings.keystonejsAdapterKnex.mod

import typings.knex.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnexAdaptorOptions extends js.Object {
  var dropDatabase: js.UndefOr[Boolean] = js.undefined
  var knexOptions: js.UndefOr[Config[_]] = js.undefined
  var listAdapterClass: js.UndefOr[js.Any] = js.undefined
  var schemaName: js.UndefOr[String] = js.undefined
}

object KnexAdaptorOptions {
  @scala.inline
  def apply(
    dropDatabase: js.UndefOr[Boolean] = js.undefined,
    knexOptions: Config[_] = null,
    listAdapterClass: js.Any = null,
    schemaName: String = null
  ): KnexAdaptorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dropDatabase)) __obj.updateDynamic("dropDatabase")(dropDatabase.asInstanceOf[js.Any])
    if (knexOptions != null) __obj.updateDynamic("knexOptions")(knexOptions.asInstanceOf[js.Any])
    if (listAdapterClass != null) __obj.updateDynamic("listAdapterClass")(listAdapterClass.asInstanceOf[js.Any])
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnexAdaptorOptions]
  }
}

