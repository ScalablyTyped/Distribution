package typings.mangopay2NodejsSdk.typingsEnumsMod.enums

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ACTIVE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EXPIRED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUBMITTED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMandateStatus extends StObject {
  
  var Active: ACTIVE
  
  var Created: CREATED
  
  var Expired: EXPIRED
  
  var Failed: FAILED
  
  var Submitted: SUBMITTED
}
object IMandateStatus {
  
  inline def apply(): IMandateStatus = {
    val __obj = js.Dynamic.literal(Active = "ACTIVE", Created = "CREATED", Expired = "EXPIRED", Failed = "FAILED", Submitted = "SUBMITTED")
    __obj.asInstanceOf[IMandateStatus]
  }
  
  extension [Self <: IMandateStatus](x: Self) {
    
    inline def setActive(value: ACTIVE): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: CREATED): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setExpired(value: EXPIRED): Self = StObject.set(x, "Expired", value.asInstanceOf[js.Any])
    
    inline def setFailed(value: FAILED): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
    
    inline def setSubmitted(value: SUBMITTED): Self = StObject.set(x, "Submitted", value.asInstanceOf[js.Any])
  }
}
