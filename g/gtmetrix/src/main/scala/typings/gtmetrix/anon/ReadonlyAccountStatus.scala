package typings.gtmetrix.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<gtmetrix.gtmetrix.AccountStatus> */
@js.native
trait ReadonlyAccountStatus extends js.Object {
  
  val api_credits: Double = js.native
  
  val api_refill: Double = js.native
}
object ReadonlyAccountStatus {
  
  @scala.inline
  def apply(api_credits: Double, api_refill: Double): ReadonlyAccountStatus = {
    val __obj = js.Dynamic.literal(api_credits = api_credits.asInstanceOf[js.Any], api_refill = api_refill.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyAccountStatus]
  }
  
  @scala.inline
  implicit class ReadonlyAccountStatusOps[Self <: ReadonlyAccountStatus] (val x: Self) extends AnyVal {
    
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
    def setApi_credits(value: Double): Self = this.set("api_credits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApi_refill(value: Double): Self = this.set("api_refill", value.asInstanceOf[js.Any])
  }
}
