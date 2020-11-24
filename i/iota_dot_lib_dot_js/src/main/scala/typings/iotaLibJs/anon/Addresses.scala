package typings.iotaLibJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Addresses extends js.Object {
  
  var addresses: js.UndefOr[js.Array[String]] = js.native
  
  var approvees: js.UndefOr[js.Array[String]] = js.native
  
  var bundles: js.UndefOr[js.Array[String]] = js.native
  
  var tags: js.UndefOr[js.Array[String]] = js.native
}
object Addresses {
  
  @scala.inline
  def apply(): Addresses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Addresses]
  }
  
  @scala.inline
  implicit class AddressesOps[Self <: Addresses] (val x: Self) extends AnyVal {
    
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
    def setAddressesVarargs(value: String*): Self = this.set("addresses", js.Array(value :_*))
    
    @scala.inline
    def setAddresses(value: js.Array[String]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    
    @scala.inline
    def setApproveesVarargs(value: String*): Self = this.set("approvees", js.Array(value :_*))
    
    @scala.inline
    def setApprovees(value: js.Array[String]): Self = this.set("approvees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApprovees: Self = this.set("approvees", js.undefined)
    
    @scala.inline
    def setBundlesVarargs(value: String*): Self = this.set("bundles", js.Array(value :_*))
    
    @scala.inline
    def setBundles(value: js.Array[String]): Self = this.set("bundles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundles: Self = this.set("bundles", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
