package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBankAccountType extends StObject {
  
  var CA: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA = js.native
  
  var GB: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB = js.native
  
  var IBAN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN = js.native
  
  var NotSpecified: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified = js.native
  
  var OTHER: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = js.native
  
  var US: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US = js.native
}
object IBankAccountType {
  
  @scala.inline
  def apply(CA: CA, GB: GB, IBAN: IBAN, NotSpecified: NotSpecified, OTHER: OTHER, US: US): IBankAccountType = {
    val __obj = js.Dynamic.literal(CA = CA.asInstanceOf[js.Any], GB = GB.asInstanceOf[js.Any], IBAN = IBAN.asInstanceOf[js.Any], NotSpecified = NotSpecified.asInstanceOf[js.Any], OTHER = OTHER.asInstanceOf[js.Any], US = US.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBankAccountType]
  }
  
  @scala.inline
  implicit class IBankAccountTypeMutableBuilder[Self <: IBankAccountType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCA(value: CA): Self = StObject.set(x, "CA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGB(value: GB): Self = StObject.set(x, "GB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIBAN(value: IBAN): Self = StObject.set(x, "IBAN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSpecified(value: NotSpecified): Self = StObject.set(x, "NotSpecified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOTHER(value: OTHER): Self = StObject.set(x, "OTHER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUS(value: US): Self = StObject.set(x, "US", value.asInstanceOf[js.Any])
  }
}
