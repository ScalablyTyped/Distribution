package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Firstname extends js.Object {
  
  var email_addresses: js.Array[String] = js.native
  
  var first_name: js.UndefOr[String] = js.native
  
  var last_name: js.UndefOr[String] = js.native
  
  var phone_numbers: js.Array[String] = js.native
}
object Firstname {
  
  @scala.inline
  def apply(email_addresses: js.Array[String], phone_numbers: js.Array[String]): Firstname = {
    val __obj = js.Dynamic.literal(email_addresses = email_addresses.asInstanceOf[js.Any], phone_numbers = phone_numbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firstname]
  }
  
  @scala.inline
  implicit class FirstnameOps[Self <: Firstname] (val x: Self) extends AnyVal {
    
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
    def setEmail_addressesVarargs(value: String*): Self = this.set("email_addresses", js.Array(value :_*))
    
    @scala.inline
    def setEmail_addresses(value: js.Array[String]): Self = this.set("email_addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone_numbersVarargs(value: String*): Self = this.set("phone_numbers", js.Array(value :_*))
    
    @scala.inline
    def setPhone_numbers(value: js.Array[String]): Self = this.set("phone_numbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_name(value: String): Self = this.set("first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirst_name: Self = this.set("first_name", js.undefined)
    
    @scala.inline
    def setLast_name(value: String): Self = this.set("last_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast_name: Self = this.set("last_name", js.undefined)
  }
}
