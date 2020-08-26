package typings.googleapis.v1beta4Mod.sqladminV1beta4

import typings.googleapis.anon.MysqlExportOptions
import typings.googleapis.anon.SelectQuery
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
  var csvExportOptions: js.UndefOr[SelectQuery] = js.native
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
  var sqlExportOptions: js.UndefOr[MysqlExportOptions] = js.native
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
  def apply(): SchemaExportContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportContext]
  }
  @scala.inline
  implicit class SchemaExportContextOps[Self <: SchemaExportContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCsvExportOptions(value: SelectQuery): Self = this.set("csvExportOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsvExportOptions: Self = this.set("csvExportOptions", js.undefined)
    @scala.inline
    def setDatabasesVarargs(value: String*): Self = this.set("databases", js.Array(value :_*))
    @scala.inline
    def setDatabases(value: js.Array[String]): Self = this.set("databases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabases: Self = this.set("databases", js.undefined)
    @scala.inline
    def setFileType(value: String): Self = this.set("fileType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSqlExportOptions(value: MysqlExportOptions): Self = this.set("sqlExportOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqlExportOptions: Self = this.set("sqlExportOptions", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

