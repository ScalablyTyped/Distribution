package typings.googleapis.sqlV1beta4Mod.sqlV1beta4

import typings.googleapis.anon.MysqlExportOptions
import typings.googleapis.anon.SelectQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExportContext extends StObject {
  
  /**
    * Options for exporting data as CSV.
    */
  var csvExportOptions: js.UndefOr[SelectQuery | Null] = js.undefined
  
  /**
    * Databases to be exported. *MySQL instances:* If *fileType* is *SQL* and no database is specified, all databases are exported, except for the *mysql* system database. If *fileType* is *CSV*, you can specify one database, either by using this property or by using the *csvExportOptions.selectQuery* property, which takes precedence over this property. *PostgreSQL instances:* You must specify one database to be exported. If *fileType* is *CSV*, this database must match the one specified in the *csvExportOptions.selectQuery* property.
    */
  var databases: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The file type for the specified uri. *SQL*: The file contains SQL statements. *CSV*: The file contains CSV data.
    */
  var fileType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always *sql#exportContext*.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Option for export offload.
    */
  var offload: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Options for exporting data as SQL statements.
    */
  var sqlExportOptions: js.UndefOr[MysqlExportOptions | Null] = js.undefined
  
  /**
    * The path to the file in Google Cloud Storage where the export will be stored. The URI is in the form *gs: //bucketName/fileName*. If the file already exists, the requests // succeeds, but the operation fails. If *fileType* is // *SQL* and the filename ends with .gz, the contents are // compressed.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaExportContext {
  
  inline def apply(): SchemaExportContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportContext]
  }
  
  extension [Self <: SchemaExportContext](x: Self) {
    
    inline def setCsvExportOptions(value: SelectQuery): Self = StObject.set(x, "csvExportOptions", value.asInstanceOf[js.Any])
    
    inline def setCsvExportOptionsNull: Self = StObject.set(x, "csvExportOptions", null)
    
    inline def setCsvExportOptionsUndefined: Self = StObject.set(x, "csvExportOptions", js.undefined)
    
    inline def setDatabases(value: js.Array[String]): Self = StObject.set(x, "databases", value.asInstanceOf[js.Any])
    
    inline def setDatabasesNull: Self = StObject.set(x, "databases", null)
    
    inline def setDatabasesUndefined: Self = StObject.set(x, "databases", js.undefined)
    
    inline def setDatabasesVarargs(value: String*): Self = StObject.set(x, "databases", js.Array(value*))
    
    inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFileTypeNull: Self = StObject.set(x, "fileType", null)
    
    inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOffload(value: Boolean): Self = StObject.set(x, "offload", value.asInstanceOf[js.Any])
    
    inline def setOffloadNull: Self = StObject.set(x, "offload", null)
    
    inline def setOffloadUndefined: Self = StObject.set(x, "offload", js.undefined)
    
    inline def setSqlExportOptions(value: MysqlExportOptions): Self = StObject.set(x, "sqlExportOptions", value.asInstanceOf[js.Any])
    
    inline def setSqlExportOptionsNull: Self = StObject.set(x, "sqlExportOptions", null)
    
    inline def setSqlExportOptionsUndefined: Self = StObject.set(x, "sqlExportOptions", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
