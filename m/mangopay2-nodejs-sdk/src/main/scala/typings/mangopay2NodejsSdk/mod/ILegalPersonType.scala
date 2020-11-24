package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BUSINESS
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ORGANIZATION
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SOLETRADER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILegalPersonType extends js.Object {
  
  var Business: BUSINESS = js.native
  
  var NotSpecified: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified = js.native
  
  var Organization: ORGANIZATION = js.native
  
  var Soletrader: SOLETRADER = js.native
}
object ILegalPersonType {
  
  @scala.inline
  def apply(Business: BUSINESS, NotSpecified: NotSpecified, Organization: ORGANIZATION, Soletrader: SOLETRADER): ILegalPersonType = {
    val __obj = js.Dynamic.literal(Business = Business.asInstanceOf[js.Any], NotSpecified = NotSpecified.asInstanceOf[js.Any], Organization = Organization.asInstanceOf[js.Any], Soletrader = Soletrader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILegalPersonType]
  }
  
  @scala.inline
  implicit class ILegalPersonTypeOps[Self <: ILegalPersonType] (val x: Self) extends AnyVal {
    
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
    def setBusiness(value: BUSINESS): Self = this.set("Business", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSpecified(value: NotSpecified): Self = this.set("NotSpecified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization(value: ORGANIZATION): Self = this.set("Organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoletrader(value: SOLETRADER): Self = this.set("Soletrader", value.asInstanceOf[js.Any])
  }
}
