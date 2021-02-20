package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRowRequest extends StObject {
  
  /** Required. The row to update. */
  var row: js.UndefOr[Row] = js.native
  
  /** The list of fields to update. */
  var updateMask: js.UndefOr[String] = js.native
  
  /** Optional. Column key to use for values in the row. Defaults to user entered name. */
  var view: js.UndefOr[String] = js.native
}
object UpdateRowRequest {
  
  @scala.inline
  def apply(): UpdateRowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRowRequest]
  }
  
  @scala.inline
  implicit class UpdateRowRequestMutableBuilder[Self <: UpdateRowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRow(value: Row): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
