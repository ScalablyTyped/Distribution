package typings.googleapis.v1beta4Mod.sqladminV1beta4

import typings.googleapis.AnonMysqlExportOptions
import typings.googleapis.AnonSelectQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance export context.
  */
@js.native
trait SchemaExportContext extends js.Object {
  /**
    * Options for exporting data as CSV.
    */
  var csvExportOptions: js.UndefOr[AnonSelectQuery] = js.native
  /**
    * Databases to be exported. MySQL instances: If fileType is SQL and no
    * database is specified, all databases are exported, except for the mysql
    * system database. If fileType is CSV, you can specify one database, either
    * by using this property or by using the csvExportOptions.selectQuery
    * property, which takes precedence over this property. PostgreSQL
    * instances: Specify exactly one database to be exported. If fileType is
    * CSV, this database must match the database used in the
    * csvExportOptions.selectQuery property.
    */
  var databases: js.UndefOr[js.Array[String]] = js.native
  /**
    * The file type for the specified uri. SQL: The file contains SQL
    * statements. CSV: The file contains CSV data.
    */
  var fileType: js.UndefOr[String] = js.native
  /**
    * This is always sql#exportContext.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Options for exporting data as SQL statements.
    */
  var sqlExportOptions: js.UndefOr[AnonMysqlExportOptions] = js.native
  /**
    * The path to the file in Google Cloud Storage where the export will be
    * stored. The URI is in the form gs://bucketName/fileName. If the file
    * already exists, the requests succeeds, but the operation fails. If
    * fileType is SQL and the filename ends with .gz, the contents are
    * compressed.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaExportContext {
  @scala.inline
  def apply(
    csvExportOptions: AnonSelectQuery = null,
    databases: js.Array[String] = null,
    fileType: String = null,
    kind: String = null,
    sqlExportOptions: AnonMysqlExportOptions = null,
    uri: String = null
  ): SchemaExportContext = {
    val __obj = js.Dynamic.literal()
    if (csvExportOptions != null) __obj.updateDynamic("csvExportOptions")(csvExportOptions.asInstanceOf[js.Any])
    if (databases != null) __obj.updateDynamic("databases")(databases.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (sqlExportOptions != null) __obj.updateDynamic("sqlExportOptions")(sqlExportOptions.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExportContext]
  }
}

