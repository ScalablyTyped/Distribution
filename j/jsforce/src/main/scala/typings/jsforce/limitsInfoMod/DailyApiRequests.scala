package typings.jsforce.limitsInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DailyApiRequests extends Limit {
  
  var `Chatter Desktop`: Limit = js.native
  
  var `Chatter Mobile for BlackBerry`: Limit = js.native
  
  var `Salesforce Files`: Limit = js.native
  
  var `Salesforce Marketing Cloud`: Limit = js.native
  
  var `Salesforce for Android`: Limit = js.native
  
  var `Salesforce for iOS`: Limit = js.native
  
  var SalesforceA: Limit = js.native
}
object DailyApiRequests {
  
  @scala.inline
  def apply(
    `Chatter Desktop`: Limit,
    `Chatter Mobile for BlackBerry`: Limit,
    Max: Double,
    Remaining: Double,
    `Salesforce Files`: Limit,
    `Salesforce Marketing Cloud`: Limit,
    `Salesforce for Android`: Limit,
    `Salesforce for iOS`: Limit,
    SalesforceA: Limit
  ): DailyApiRequests = {
    val __obj = js.Dynamic.literal(Max = Max.asInstanceOf[js.Any], Remaining = Remaining.asInstanceOf[js.Any], SalesforceA = SalesforceA.asInstanceOf[js.Any])
    __obj.updateDynamic("Chatter Desktop")((`Chatter Desktop`).asInstanceOf[js.Any])
    __obj.updateDynamic("Chatter Mobile for BlackBerry")((`Chatter Mobile for BlackBerry`).asInstanceOf[js.Any])
    __obj.updateDynamic("Salesforce Files")((`Salesforce Files`).asInstanceOf[js.Any])
    __obj.updateDynamic("Salesforce Marketing Cloud")((`Salesforce Marketing Cloud`).asInstanceOf[js.Any])
    __obj.updateDynamic("Salesforce for Android")((`Salesforce for Android`).asInstanceOf[js.Any])
    __obj.updateDynamic("Salesforce for iOS")((`Salesforce for iOS`).asInstanceOf[js.Any])
    __obj.asInstanceOf[DailyApiRequests]
  }
  
  @scala.inline
  implicit class DailyApiRequestsOps[Self <: DailyApiRequests] (val x: Self) extends AnyVal {
    
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
    def `setChatter Desktop`(value: Limit): Self = this.set("Chatter Desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setChatter Mobile for BlackBerry`(value: Limit): Self = this.set("Chatter Mobile for BlackBerry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSalesforce Files`(value: Limit): Self = this.set("Salesforce Files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSalesforce Marketing Cloud`(value: Limit): Self = this.set("Salesforce Marketing Cloud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSalesforce for Android`(value: Limit): Self = this.set("Salesforce for Android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSalesforce for iOS`(value: Limit): Self = this.set("Salesforce for iOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalesforceA(value: Limit): Self = this.set("SalesforceA", value.asInstanceOf[js.Any])
  }
}
