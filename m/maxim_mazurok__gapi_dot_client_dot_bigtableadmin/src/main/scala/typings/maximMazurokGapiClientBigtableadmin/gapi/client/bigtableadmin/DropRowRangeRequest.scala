package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropRowRangeRequest extends StObject {
  
  /** Delete all rows in the table. Setting this to false is a no-op. */
  var deleteAllDataFromTable: js.UndefOr[Boolean] = js.native
  
  /** Delete all rows that start with this row key prefix. Prefix cannot be zero length. */
  var rowKeyPrefix: js.UndefOr[String] = js.native
}
object DropRowRangeRequest {
  
  @scala.inline
  def apply(): DropRowRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropRowRangeRequest]
  }
  
  @scala.inline
  implicit class DropRowRangeRequestMutableBuilder[Self <: DropRowRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteAllDataFromTable(value: Boolean): Self = StObject.set(x, "deleteAllDataFromTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteAllDataFromTableUndefined: Self = StObject.set(x, "deleteAllDataFromTable", js.undefined)
    
    @scala.inline
    def setRowKeyPrefix(value: String): Self = StObject.set(x, "rowKeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowKeyPrefixUndefined: Self = StObject.set(x, "rowKeyPrefix", js.undefined)
  }
}
