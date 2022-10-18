package typings.mangopay2NodejsSdk.typingsEnumsMod.enums

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBankAccountType extends StObject {
  
  var CA: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
  
  var GB: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
  
  var IBAN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
  
  var NotSpecified: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
  
  var OTHER: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
  
  var US: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
}
object IBankAccountType {
  
  inline def apply(): IBankAccountType = {
    val __obj = js.Dynamic.literal(CA = "CA", GB = "GB", IBAN = "IBAN", NotSpecified = "NotSpecified", OTHER = "OTHER", US = "US")
    __obj.asInstanceOf[IBankAccountType]
  }
  
  extension [Self <: IBankAccountType](x: Self) {
    
    inline def setCA(value: CA): Self = StObject.set(x, "CA", value.asInstanceOf[js.Any])
    
    inline def setGB(value: GB): Self = StObject.set(x, "GB", value.asInstanceOf[js.Any])
    
    inline def setIBAN(value: IBAN): Self = StObject.set(x, "IBAN", value.asInstanceOf[js.Any])
    
    inline def setNotSpecified(value: NotSpecified): Self = StObject.set(x, "NotSpecified", value.asInstanceOf[js.Any])
    
    inline def setOTHER(value: OTHER): Self = StObject.set(x, "OTHER", value.asInstanceOf[js.Any])
    
    inline def setUS(value: US): Self = StObject.set(x, "US", value.asInstanceOf[js.Any])
  }
}
