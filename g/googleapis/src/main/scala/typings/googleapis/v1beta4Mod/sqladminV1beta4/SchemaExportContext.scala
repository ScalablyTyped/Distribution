package typings.googleapis.v1beta4Mod.sqladminV1beta4

import typings.googleapis.anon.MysqlExportOptions
import typings.googleapis.anon.SelectQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database instance export context.
  */
@js.native
trait SchemaExportContext extends StObject {
  
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
  implicit class SchemaExportContextMutableBuilder[Self <: SchemaExportContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCsvExportOptions(value: SelectQuery): Self = StObject.set(x, "csvExportOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvExportOptionsUndefined: Self = StObject.set(x, "csvExportOptions", js.undefined)
    
    @scala.inline
    def setDatabases(value: js.Array[String]): Self = StObject.set(x, "databases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabasesUndefined: Self = StObject.set(x, "databases", js.undefined)
    
    @scala.inline
    def setDatabasesVarargs(value: String*): Self = StObject.set(x, "databases", js.Array(value :_*))
    
    @scala.inline
    def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSqlExportOptions(value: MysqlExportOptions): Self = StObject.set(x, "sqlExportOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlExportOptionsUndefined: Self = StObject.set(x, "sqlExportOptions", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
