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
  def apply(): SchemaImportContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportContext]
  }
  @scala.inline
  implicit class SchemaImportContextOps[Self <: SchemaImportContext] (val x: Self) extends AnyVal {
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
    def setCsvImportOptions(value: Columns): Self = this.set("csvImportOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsvImportOptions: Self = this.set("csvImportOptions", js.undefined)
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    @scala.inline
    def setFileType(value: String): Self = this.set("fileType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    @scala.inline
    def setImportUser(value: String): Self = this.set("importUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportUser: Self = this.set("importUser", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

