package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateDatabaseRequest extends StObject {
  
  /**
    * Required. A `CREATE DATABASE` statement, which specifies the ID of the new database. The database ID must conform to the regular expression `a-z*[a-z0-9]` and be between 2 and 30 characters in length. If the database ID is a reserved word or if it contains a hyphen, the database ID must be enclosed in backticks (`` ` ``).
    */
  var createStatement: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The dialect of the Cloud Spanner Database.
    */
  var databaseDialect: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The encryption configuration for the database. If this field is not specified, Cloud Spanner will encrypt/decrypt all data at rest using Google default encryption.
    */
  var encryptionConfig: js.UndefOr[SchemaEncryptionConfig] = js.undefined
  
  /**
    * Optional. A list of DDL statements to run inside the newly created database. Statements can create tables, indexes, etc. These statements execute atomically with the creation of the database: if there is an error in any statement, the database is not created.
    */
  var extraStatements: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCreateDatabaseRequest {
  
  inline def apply(): SchemaCreateDatabaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateDatabaseRequest]
  }
  
  extension [Self <: SchemaCreateDatabaseRequest](x: Self) {
    
    inline def setCreateStatement(value: String): Self = StObject.set(x, "createStatement", value.asInstanceOf[js.Any])
    
    inline def setCreateStatementNull: Self = StObject.set(x, "createStatement", null)
    
    inline def setCreateStatementUndefined: Self = StObject.set(x, "createStatement", js.undefined)
    
    inline def setDatabaseDialect(value: String): Self = StObject.set(x, "databaseDialect", value.asInstanceOf[js.Any])
    
    inline def setDatabaseDialectNull: Self = StObject.set(x, "databaseDialect", null)
    
    inline def setDatabaseDialectUndefined: Self = StObject.set(x, "databaseDialect", js.undefined)
    
    inline def setEncryptionConfig(value: SchemaEncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    inline def setExtraStatements(value: js.Array[String]): Self = StObject.set(x, "extraStatements", value.asInstanceOf[js.Any])
    
    inline def setExtraStatementsNull: Self = StObject.set(x, "extraStatements", null)
    
    inline def setExtraStatementsUndefined: Self = StObject.set(x, "extraStatements", js.undefined)
    
    inline def setExtraStatementsVarargs(value: String*): Self = StObject.set(x, "extraStatements", js.Array(value*))
  }
}
