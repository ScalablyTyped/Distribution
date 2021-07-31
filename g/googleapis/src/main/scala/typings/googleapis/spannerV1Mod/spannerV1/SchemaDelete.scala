package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments to delete operations.
  */
trait SchemaDelete extends StObject {
  
  /**
    * Required. The primary keys of the rows within table to delete. Delete is
    * idempotent. The transaction will succeed even if some or all rows do not
    * exist.
    */
  var keySet: js.UndefOr[SchemaKeySet] = js.undefined
  
  /**
    * Required. The table whose rows will be deleted.
    */
  var table: js.UndefOr[String] = js.undefined
}
object SchemaDelete {
  
  @scala.inline
  def apply(): SchemaDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDelete]
  }
  
  @scala.inline
  implicit class SchemaDeleteMutableBuilder[Self <: SchemaDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeySet(value: SchemaKeySet): Self = StObject.set(x, "keySet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySetUndefined: Self = StObject.set(x, "keySet", js.undefined)
    
    @scala.inline
    def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
