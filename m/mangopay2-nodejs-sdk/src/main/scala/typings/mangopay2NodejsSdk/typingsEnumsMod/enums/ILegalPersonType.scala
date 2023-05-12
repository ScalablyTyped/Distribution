package typings.mangopay2NodejsSdk.typingsEnumsMod.enums

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BUSINESS
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ORGANIZATION
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PARTNERSHIP
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SOLETRADER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILegalPersonType extends StObject {
  
  var Business: BUSINESS
  
  var NotSpecified: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
  
  var Organization: ORGANIZATION
  
  var Partnership: PARTNERSHIP
  
  var Soletrader: SOLETRADER
}
object ILegalPersonType {
  
  inline def apply(): ILegalPersonType = {
    val __obj = js.Dynamic.literal(Business = "BUSINESS", NotSpecified = "NotSpecified", Organization = "ORGANIZATION", Partnership = "PARTNERSHIP", Soletrader = "SOLETRADER")
    __obj.asInstanceOf[ILegalPersonType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILegalPersonType] (val x: Self) extends AnyVal {
    
    inline def setBusiness(value: BUSINESS): Self = StObject.set(x, "Business", value.asInstanceOf[js.Any])
    
    inline def setNotSpecified(value: NotSpecified): Self = StObject.set(x, "NotSpecified", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: ORGANIZATION): Self = StObject.set(x, "Organization", value.asInstanceOf[js.Any])
    
    inline def setPartnership(value: PARTNERSHIP): Self = StObject.set(x, "Partnership", value.asInstanceOf[js.Any])
    
    inline def setSoletrader(value: SOLETRADER): Self = StObject.set(x, "Soletrader", value.asInstanceOf[js.Any])
  }
}
