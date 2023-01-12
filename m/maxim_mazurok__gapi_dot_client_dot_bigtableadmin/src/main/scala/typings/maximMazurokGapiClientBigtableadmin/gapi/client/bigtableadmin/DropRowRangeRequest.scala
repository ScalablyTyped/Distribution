package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropRowRangeRequest extends StObject {
  
  /** Delete all rows in the table. Setting this to false is a no-op. */
  var deleteAllDataFromTable: js.UndefOr[Boolean] = js.undefined
  
  /** Delete all rows that start with this row key prefix. Prefix cannot be zero length. */
  var rowKeyPrefix: js.UndefOr[String] = js.undefined
}
object DropRowRangeRequest {
  
  inline def apply(): DropRowRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropRowRangeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropRowRangeRequest] (val x: Self) extends AnyVal {
    
    inline def setDeleteAllDataFromTable(value: Boolean): Self = StObject.set(x, "deleteAllDataFromTable", value.asInstanceOf[js.Any])
    
    inline def setDeleteAllDataFromTableUndefined: Self = StObject.set(x, "deleteAllDataFromTable", js.undefined)
    
    inline def setRowKeyPrefix(value: String): Self = StObject.set(x, "rowKeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setRowKeyPrefixUndefined: Self = StObject.set(x, "rowKeyPrefix", js.undefined)
  }
}
