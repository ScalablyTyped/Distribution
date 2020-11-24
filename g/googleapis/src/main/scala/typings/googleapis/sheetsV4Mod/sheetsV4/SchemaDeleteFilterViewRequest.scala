package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes a particular filter view.
  */
@js.native
trait SchemaDeleteFilterViewRequest extends js.Object {
  
  /**
    * The ID of the filter to delete.
    */
  var filterId: js.UndefOr[Double] = js.native
}
object SchemaDeleteFilterViewRequest {
  
  @scala.inline
  def apply(): SchemaDeleteFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteFilterViewRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteFilterViewRequestOps[Self <: SchemaDeleteFilterViewRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilterId(value: Double): Self = this.set("filterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterId: Self = this.set("filterId", js.undefined)
  }
}
