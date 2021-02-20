package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A modification to one or more Cloud Spanner rows.  Mutations can be applied
  * to a Cloud Spanner database by sending them in a Commit call.
  */
@js.native
trait SchemaMutation extends StObject {
  
  /**
    * Delete rows from a table. Succeeds whether or not the named rows were
    * present.
    */
  var delete: js.UndefOr[SchemaDelete] = js.native
  
  /**
    * Insert new rows in a table. If any of the rows already exist, the write
    * or transaction fails with error `ALREADY_EXISTS`.
    */
  var insert: js.UndefOr[SchemaWrite] = js.native
  
  /**
    * Like insert, except that if the row already exists, then its column
    * values are overwritten with the ones provided. Any column values not
    * explicitly written are preserved.
    */
  var insertOrUpdate: js.UndefOr[SchemaWrite] = js.native
  
  /**
    * Like insert, except that if the row already exists, it is deleted, and
    * the column values provided are inserted instead. Unlike insert_or_update,
    * this means any values not explicitly written become `NULL`.
    */
  var replace: js.UndefOr[SchemaWrite] = js.native
  
  /**
    * Update existing rows in a table. If any of the rows does not already
    * exist, the transaction fails with error `NOT_FOUND`.
    */
  var update: js.UndefOr[SchemaWrite] = js.native
}
object SchemaMutation {
  
  @scala.inline
  def apply(): SchemaMutation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMutation]
  }
  
  @scala.inline
  implicit class SchemaMutationMutableBuilder[Self <: SchemaMutation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelete(value: SchemaDelete): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    @scala.inline
    def setInsert(value: SchemaWrite): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertOrUpdate(value: SchemaWrite): Self = StObject.set(x, "insertOrUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertOrUpdateUndefined: Self = StObject.set(x, "insertOrUpdate", js.undefined)
    
    @scala.inline
    def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    @scala.inline
    def setReplace(value: SchemaWrite): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    @scala.inline
    def setUpdate(value: SchemaWrite): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
