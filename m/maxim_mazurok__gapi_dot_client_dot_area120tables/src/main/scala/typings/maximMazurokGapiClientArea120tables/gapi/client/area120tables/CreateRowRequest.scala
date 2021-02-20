package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRowRequest extends StObject {
  
  /** Required. The parent table where this row will be created. Format: tables/{table} */
  var parent: js.UndefOr[String] = js.native
  
  /** Required. The row to create. */
  var row: js.UndefOr[Row] = js.native
  
  /** Optional. Column key to use for values in the row. Defaults to user entered name. */
  var view: js.UndefOr[String] = js.native
}
object CreateRowRequest {
  
  @scala.inline
  def apply(): CreateRowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRowRequest]
  }
  
  @scala.inline
  implicit class CreateRowRequestMutableBuilder[Self <: CreateRowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRow(value: Row): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
