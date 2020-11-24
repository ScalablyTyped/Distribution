package typings.intercomClient.leadMod

import typings.intercomClient.anon.Next
import typings.intercomClient.intercomClientStrings.userDotlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List extends js.Object {
  
  var contacts: js.Array[Lead] = js.native
  
  var pages: Next = js.native
  
  var total_count: Double = js.native
  
  var `type`: userDotlist = js.native
}
object List {
  
  @scala.inline
  def apply(contacts: js.Array[Lead], pages: Next, total_count: Double, `type`: userDotlist): List = {
    val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
  
  @scala.inline
  implicit class ListOps[Self <: List] (val x: Self) extends AnyVal {
    
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
    def setContactsVarargs(value: Lead*): Self = this.set("contacts", js.Array(value :_*))
    
    @scala.inline
    def setContacts(value: js.Array[Lead]): Self = this.set("contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(value: Next): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: userDotlist): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
