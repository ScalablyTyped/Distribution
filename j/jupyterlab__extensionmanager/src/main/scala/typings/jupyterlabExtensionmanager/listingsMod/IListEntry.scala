package typings.jupyterlabExtensionmanager.listingsMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IListEntry extends js.Object {
  
  var creation_date: js.UndefOr[String] = js.native
  
  var last_update_date: js.UndefOr[String] = js.native
  
  /**
    * The name of the extension.
    */
  var name: String = js.native
  
  var reason: js.UndefOr[String] = js.native
  
  var regexp: js.UndefOr[RegExp] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object IListEntry {
  
  @scala.inline
  def apply(name: String): IListEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListEntry]
  }
  
  @scala.inline
  implicit class IListEntryOps[Self <: IListEntry] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreation_date(value: String): Self = this.set("creation_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreation_date: Self = this.set("creation_date", js.undefined)
    
    @scala.inline
    def setLast_update_date(value: String): Self = this.set("last_update_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast_update_date: Self = this.set("last_update_date", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setRegexp(value: RegExp): Self = this.set("regexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexp: Self = this.set("regexp", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
