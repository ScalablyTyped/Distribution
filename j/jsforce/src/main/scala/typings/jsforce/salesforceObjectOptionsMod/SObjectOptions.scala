package typings.jsforce.salesforceObjectOptionsMod

import typings.jsforce.salesforceIdMod.SalesforceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SObjectOptions extends js.Object {
  
  var ExtId__c: js.UndefOr[String] = js.native
  
  var Id: js.UndefOr[SalesforceId] = js.native
  
  var Name: js.UndefOr[String] = js.native
}
object SObjectOptions {
  
  @scala.inline
  def apply(): SObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SObjectOptions]
  }
  
  @scala.inline
  implicit class SObjectOptionsOps[Self <: SObjectOptions] (val x: Self) extends AnyVal {
    
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
    def setExtId__c(value: String): Self = this.set("ExtId__c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtId__c: Self = this.set("ExtId__c", js.undefined)
    
    @scala.inline
    def setId(value: SalesforceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
