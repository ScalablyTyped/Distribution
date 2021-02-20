package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BUSINESS
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ORGANIZATION
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SOLETRADER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILegalPersonType extends StObject {
  
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
  implicit class ILegalPersonTypeMutableBuilder[Self <: ILegalPersonType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusiness(value: BUSINESS): Self = StObject.set(x, "Business", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSpecified(value: NotSpecified): Self = StObject.set(x, "NotSpecified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization(value: ORGANIZATION): Self = StObject.set(x, "Organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoletrader(value: SOLETRADER): Self = StObject.set(x, "Soletrader", value.asInstanceOf[js.Any])
  }
}
