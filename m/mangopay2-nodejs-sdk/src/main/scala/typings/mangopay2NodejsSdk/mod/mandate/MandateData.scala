package typings.mangopay2NodejsSdk.mod.mandate

import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MandateData extends EntityBaseData {
  
  /**
    * An ID of a Bank Account
    */
  var BankAccountId: String = js.native
  
  /**
    * The banking reference for this mandate
    */
  var BankReference: String = js.native
  
  /**
    * The language to use for the mandate confirmation page - needs to be the ISO code of the language
    */
  var Culture: MandateCultureCode = js.native
  
  /**
    * The URL to download the mandate
    */
  var DocumentURL: String = js.native
  
  /**
    * The execution type for creating the mandate
    */
  var ExecutionType: MandateExecutionType = js.native
  
  /**
    * The type of Mandate
    */
  var MandateType: typings.mangopay2NodejsSdk.mod.mandate.MandateType = js.native
  
  /**
    * The URL to redirect to user to for them to proceed with the payment
    */
  var RedirectURL: String = js.native
  
  /**
    * The result code
    */
  var ResultCode: String = js.native
  
  /**
    * A verbal explanation of the ResultCode
    */
  var ResultMessage: String = js.native
  
  /**
    * The URL to redirect to after payment (whether successful or not)
    */
  var ReturnURL: String = js.native
  
  /**
    * The type of mandate, but will only be completed once the mandate has been submitted
    */
  var Scheme: MandateScheme = js.native
  
  /**
    * The status of the mandate:
    */
  var Status: MandateStatus = js.native
  
  /**
    * The object owner's UserId
    */
  var UserId: String = js.native
}
object MandateData {
  
  @scala.inline
  def apply(
    BankAccountId: String,
    BankReference: String,
    CreationDate: Double,
    Culture: MandateCultureCode,
    DocumentURL: String,
    ExecutionType: MandateExecutionType,
    Id: String,
    MandateType: MandateType,
    RedirectURL: String,
    ResultCode: String,
    ResultMessage: String,
    ReturnURL: String,
    Scheme: MandateScheme,
    Status: MandateStatus,
    Tag: String,
    UserId: String
  ): MandateData = {
    val __obj = js.Dynamic.literal(BankAccountId = BankAccountId.asInstanceOf[js.Any], BankReference = BankReference.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], DocumentURL = DocumentURL.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MandateType = MandateType.asInstanceOf[js.Any], RedirectURL = RedirectURL.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], ReturnURL = ReturnURL.asInstanceOf[js.Any], Scheme = Scheme.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MandateData]
  }
  
  @scala.inline
  implicit class MandateDataOps[Self <: MandateData] (val x: Self) extends AnyVal {
    
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
    def setBankReference(value: String): Self = this.set("BankReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCulture(value: MandateCultureCode): Self = this.set("Culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentURL(value: String): Self = this.set("DocumentURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionType(value: MandateExecutionType): Self = this.set("ExecutionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMandateType(value: MandateType): Self = this.set("MandateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectURL(value: String): Self = this.set("RedirectURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCode(value: String): Self = this.set("ResultCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultMessage(value: String): Self = this.set("ResultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnURL(value: String): Self = this.set("ReturnURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: MandateScheme): Self = this.set("Scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: MandateStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = this.set("UserId", value.asInstanceOf[js.Any])
  }
}
