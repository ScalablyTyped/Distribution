package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds a filter view.
  */
@js.native
trait SchemaAddFilterViewRequest extends js.Object {
  
  /**
    * The filter to add. The filterViewId field is optional; if one is not set,
    * an id will be randomly generated. (It is an error to specify the ID of a
    * filter that already exists.)
    */
  var filter: js.UndefOr[SchemaFilterView] = js.native
}
object SchemaAddFilterViewRequest {
  
  @scala.inline
  def apply(): SchemaAddFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddFilterViewRequest]
  }
  
  @scala.inline
  implicit class SchemaAddFilterViewRequestOps[Self <: SchemaAddFilterViewRequest] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: SchemaFilterView): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
  }
}
