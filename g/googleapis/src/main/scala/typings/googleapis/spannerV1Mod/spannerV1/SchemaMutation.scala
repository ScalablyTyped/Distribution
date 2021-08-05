package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A modification to one or more Cloud Spanner rows.  Mutations can be applied
  * to a Cloud Spanner database by sending them in a Commit call.
  */
trait SchemaMutation extends StObject {
  
  /**
    * Delete rows from a table. Succeeds whether or not the named rows were
    * present.
    */
  var delete: js.UndefOr[SchemaDelete] = js.undefined
  
  /**
    * Insert new rows in a table. If any of the rows already exist, the write
    * or transaction fails with error `ALREADY_EXISTS`.
    */
  var insert: js.UndefOr[SchemaWrite] = js.undefined
  
  /**
    * Like insert, except that if the row already exists, then its column
    * values are overwritten with the ones provided. Any column values not
    * explicitly written are preserved.
    */
  var insertOrUpdate: js.UndefOr[SchemaWrite] = js.undefined
  
  /**
    * Like insert, except that if the row already exists, it is deleted, and
    * the column values provided are inserted instead. Unlike insert_or_update,
    * this means any values not explicitly written become `NULL`.
    */
  var replace: js.UndefOr[SchemaWrite] = js.undefined
  
  /**
    * Update existing rows in a table. If any of the rows does not already
    * exist, the transaction fails with error `NOT_FOUND`.
    */
  var update: js.UndefOr[SchemaWrite] = js.undefined
}
object SchemaMutation {
  
  inline def apply(): SchemaMutation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMutation]
  }
  
  extension [Self <: SchemaMutation](x: Self) {
    
    inline def setDelete(value: SchemaDelete): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setInsert(value: SchemaWrite): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    inline def setInsertOrUpdate(value: SchemaWrite): Self = StObject.set(x, "insertOrUpdate", value.asInstanceOf[js.Any])
    
    inline def setInsertOrUpdateUndefined: Self = StObject.set(x, "insertOrUpdate", js.undefined)
    
    inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    inline def setReplace(value: SchemaWrite): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setUpdate(value: SchemaWrite): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
