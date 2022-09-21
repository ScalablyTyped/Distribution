package typings.googleapis.v1beta4Mod.sqladminV1beta4

import typings.googleapis.anon.EncryptionOptions
import typings.googleapis.anon.FieldsTerminatedBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImportContext extends StObject {
  
  /**
    * Import parameters specific to SQL Server .BAK files
    */
  var bakImportOptions: js.UndefOr[EncryptionOptions | Null] = js.undefined
  
  /**
    * Options for importing data as CSV.
    */
  var csvImportOptions: js.UndefOr[FieldsTerminatedBy | Null] = js.undefined
  
  /**
    * The target database for the import. If `fileType` is `SQL`, this field is required only if the import file does not specify a database, and is overridden by any database specification in the import file. If `fileType` is `CSV`, one database must be specified.
    */
  var database: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The file type for the specified uri. * `SQL`: The file contains SQL statements. * `CSV`: The file contains CSV data. * `BAK`: The file contains backup data for a SQL Server instance.
    */
  var fileType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The PostgreSQL user for this import operation. PostgreSQL instances only.
    */
  var importUser: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always `sql#importContext`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Path to the import file in Cloud Storage, in the form `gs://bucketName/fileName`. Compressed gzip files (.gz) are supported when `fileType` is `SQL`. The instance must have write permissions to the bucket and read access to the file.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaImportContext {
  
  inline def apply(): SchemaImportContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportContext]
  }
  
  extension [Self <: SchemaImportContext](x: Self) {
    
    inline def setBakImportOptions(value: EncryptionOptions): Self = StObject.set(x, "bakImportOptions", value.asInstanceOf[js.Any])
    
    inline def setBakImportOptionsNull: Self = StObject.set(x, "bakImportOptions", null)
    
    inline def setBakImportOptionsUndefined: Self = StObject.set(x, "bakImportOptions", js.undefined)
    
    inline def setCsvImportOptions(value: FieldsTerminatedBy): Self = StObject.set(x, "csvImportOptions", value.asInstanceOf[js.Any])
    
    inline def setCsvImportOptionsNull: Self = StObject.set(x, "csvImportOptions", null)
    
    inline def setCsvImportOptionsUndefined: Self = StObject.set(x, "csvImportOptions", js.undefined)
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFileTypeNull: Self = StObject.set(x, "fileType", null)
    
    inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    inline def setImportUser(value: String): Self = StObject.set(x, "importUser", value.asInstanceOf[js.Any])
    
    inline def setImportUserNull: Self = StObject.set(x, "importUser", null)
    
    inline def setImportUserUndefined: Self = StObject.set(x, "importUser", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
