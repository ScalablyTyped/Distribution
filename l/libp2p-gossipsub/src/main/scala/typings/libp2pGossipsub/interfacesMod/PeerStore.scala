package typings.libp2pGossipsub.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeerStore extends js.Object {
  
  var addressBook: AddressBook = js.native
}
object PeerStore {
  
  @scala.inline
  def apply(addressBook: AddressBook): PeerStore = {
    val __obj = js.Dynamic.literal(addressBook = addressBook.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerStore]
  }
  
  @scala.inline
  implicit class PeerStoreOps[Self <: PeerStore] (val x: Self) extends AnyVal {
    
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
    def setAddressBook(value: AddressBook): Self = this.set("addressBook", value.asInstanceOf[js.Any])
  }
}
