package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends js.Object {
  
  /** A composite filter. */
  var compositeFilter: js.UndefOr[CompositeFilter] = js.native
  
  /** A filter on a property. */
  var propertyFilter: js.UndefOr[PropertyFilter] = js.native
}
object Filter {
  
  @scala.inline
  def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    
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
    def setCompositeFilter(value: CompositeFilter): Self = this.set("compositeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompositeFilter: Self = this.set("compositeFilter", js.undefined)
    
    @scala.inline
    def setPropertyFilter(value: PropertyFilter): Self = this.set("propertyFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyFilter: Self = this.set("propertyFilter", js.undefined)
  }
}
