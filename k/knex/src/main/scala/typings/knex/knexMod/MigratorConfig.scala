package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigratorConfig extends js.Object {
  var database: js.UndefOr[String] = js.undefined
  var directory: js.UndefOr[String | js.Array[String]] = js.undefined
  var disableTransactions: js.UndefOr[Boolean] = js.undefined
  var extension: js.UndefOr[String] = js.undefined
  var loadExtensions: js.UndefOr[js.Array[String]] = js.undefined
  var migrationSource: js.UndefOr[js.Any] = js.undefined
  var schemaName: js.UndefOr[String] = js.undefined
  var sortDirsSeparately: js.UndefOr[Boolean] = js.undefined
  var stub: js.UndefOr[String] = js.undefined
  var tableName: js.UndefOr[String] = js.undefined
}

object MigratorConfig {
  @scala.inline
  def apply(
    database: String = null,
    directory: String | js.Array[String] = null,
    disableTransactions: js.UndefOr[Boolean] = js.undefined,
    extension: String = null,
    loadExtensions: js.Array[String] = null,
    migrationSource: js.Any = null,
    schemaName: String = null,
    sortDirsSeparately: js.UndefOr[Boolean] = js.undefined,
    stub: String = null,
    tableName: String = null
  ): MigratorConfig = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database)
    if (directory != null) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTransactions)) __obj.updateDynamic("disableTransactions")(disableTransactions)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (loadExtensions != null) __obj.updateDynamic("loadExtensions")(loadExtensions)
    if (migrationSource != null) __obj.updateDynamic("migrationSource")(migrationSource)
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName)
    if (!js.isUndefined(sortDirsSeparately)) __obj.updateDynamic("sortDirsSeparately")(sortDirsSeparately)
    if (stub != null) __obj.updateDynamic("stub")(stub)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    __obj.asInstanceOf[MigratorConfig]
  }
}

