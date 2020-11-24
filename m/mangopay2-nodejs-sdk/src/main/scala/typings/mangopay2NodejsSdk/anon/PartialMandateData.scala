package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.mandate.MandateCultureCode
import typings.mangopay2NodejsSdk.mod.mandate.MandateExecutionType
import typings.mangopay2NodejsSdk.mod.mandate.MandateScheme
import typings.mangopay2NodejsSdk.mod.mandate.MandateStatus
import typings.mangopay2NodejsSdk.mod.mandate.MandateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.mandate.MandateData> */
@js.native
trait PartialMandateData extends js.Object {
  
  var BankAccountId: js.UndefOr[String] = js.native
  
  var BankReference: js.UndefOr[String] = js.native
  
  var CreationDate: js.UndefOr[Double] = js.native
  
  var Culture: js.UndefOr[MandateCultureCode] = js.native
  
  var DocumentURL: js.UndefOr[String] = js.native
  
  var ExecutionType: js.UndefOr[MandateExecutionType] = js.native
  
  var Id: js.UndefOr[String] = js.native
  
  var MandateType: js.UndefOr[typings.mangopay2NodejsSdk.mod.mandate.MandateType] = js.native
  
  var RedirectURL: js.UndefOr[String] = js.native
  
  var ResultCode: js.UndefOr[String] = js.native
  
  var ResultMessage: js.UndefOr[String] = js.native
  
  var ReturnURL: js.UndefOr[String] = js.native
  
  var Scheme: js.UndefOr[MandateScheme] = js.native
  
  var Status: js.UndefOr[MandateStatus] = js.native
  
  var Tag: js.UndefOr[String] = js.native
  
  var UserId: js.UndefOr[String] = js.native
}
object PartialMandateData {
  
  @scala.inline
  def apply(): PartialMandateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMandateData]
  }
  
  @scala.inline
  implicit class PartialMandateDataOps[Self <: PartialMandateData] (val x: Self) extends AnyVal {
    
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
    def setBankAccountId(value: String): Self = this.set("BankAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBankAccountId: Self = this.set("BankAccountId", js.undefined)
    
    @scala.inline
    def setBankReference(value: String): Self = this.set("BankReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBankReference: Self = this.set("BankReference", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Double): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setCulture(value: MandateCultureCode): Self = this.set("Culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCulture: Self = this.set("Culture", js.undefined)
    
    @scala.inline
    def setDocumentURL(value: String): Self = this.set("DocumentURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentURL: Self = this.set("DocumentURL", js.undefined)
    
    @scala.inline
    def setExecutionType(value: MandateExecutionType): Self = this.set("ExecutionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionType: Self = this.set("ExecutionType", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setMandateType(value: MandateType): Self = this.set("MandateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMandateType: Self = this.set("MandateType", js.undefined)
    
    @scala.inline
    def setRedirectURL(value: String): Self = this.set("RedirectURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectURL: Self = this.set("RedirectURL", js.undefined)
    
    @scala.inline
    def setResultCode(value: String): Self = this.set("ResultCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultCode: Self = this.set("ResultCode", js.undefined)
    
    @scala.inline
    def setResultMessage(value: String): Self = this.set("ResultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultMessage: Self = this.set("ResultMessage", js.undefined)
    
    @scala.inline
    def setReturnURL(value: String): Self = this.set("ReturnURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnURL: Self = this.set("ReturnURL", js.undefined)
    
    @scala.inline
    def setScheme(value: MandateScheme): Self = this.set("Scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheme: Self = this.set("Scheme", js.undefined)
    
    @scala.inline
    def setStatus(value: MandateStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("UserId", js.undefined)
  }
}
