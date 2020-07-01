package typings.googleapis.v1beta4Mod.sqladminV1beta4

import typings.googleapis.anon.Columns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance import context.
  */
@js.native
trait SchemaImportContext extends js.Object {
  /**
    * Options for importing data as CSV.
    */
  var csvImportOptions: js.UndefOr[Columns] = js.native
  /**
    * The target database for the import. If fileType is SQL, this field is
    * required only if the import file does not specify a database, and is
    * overridden by any database specification in the import file. If fileType
    * is CSV, one database must be specified.
    */
  var database: js.UndefOr[String] = js.native
  /**
    * The file type for the specified uri. SQL: The file contains SQL
    * statements. CSV: The file contains CSV data.
    */
  var fileType: js.UndefOr[String] = js.native
  /**
    * The PostgreSQL user for this import operation. PostgreSQL instances only.
    */
  var importUser: js.UndefOr[String] = js.native
  /**
    * This is always sql#importContext.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Path to the import file in Cloud Storage, in the form
    * gs://bucketName/fileName. Compressed gzip files (.gz) are supported when
    * fileType is SQL. The instance must have write permissions to the bucket
    * and read access to the file.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaImportContext {
  @scala.inline
  def apply(
    csvImportOptions: Columns = null,
    database: String = null,
    fileType: String = null,
    importUser: String = null,
    kind: String = null,
    uri: String = null
  ): SchemaImportContext = {
    val __obj = js.Dynamic.literal()
    if (csvImportOptions != null) __obj.updateDynamic("csvImportOptions")(csvImportOptions.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (importUser != null) __obj.updateDynamic("importUser")(importUser.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImportContext]
  }
}

