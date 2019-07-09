package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigratorConfig extends js.Object {
  var database: js.UndefOr[java.lang.String] = js.undefined
  var directory: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var disableTransactions: js.UndefOr[scala.Boolean] = js.undefined
  var extension: js.UndefOr[java.lang.String] = js.undefined
  var loadExtensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var migrationSource: js.UndefOr[js.Any] = js.undefined
  var schemaName: js.UndefOr[java.lang.String] = js.undefined
  var sortDirsSeparately: js.UndefOr[scala.Boolean] = js.undefined
  var stub: js.UndefOr[java.lang.String] = js.undefined
  var tableName: js.UndefOr[java.lang.String] = js.undefined
}

object MigratorConfig {
  @scala.inline
  def apply(
    database: java.lang.String = null,
    directory: java.lang.String | js.Array[java.lang.String] = null,
    disableTransactions: js.UndefOr[scala.Boolean] = js.undefined,
    extension: java.lang.String = null,
    loadExtensions: js.Array[java.lang.String] = null,
    migrationSource: js.Any = null,
    schemaName: java.lang.String = null,
    sortDirsSeparately: js.UndefOr[scala.Boolean] = js.undefined,
    stub: java.lang.String = null,
    tableName: java.lang.String = null
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

