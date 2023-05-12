package typings.mangopay2NodejsSdk.typingsEnumsMod.enums

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUCCEEDED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDepositStatus extends StObject {
  
  var Created: CREATED
  
  var Failed: FAILED
  
  var Succeeded: SUCCEEDED
}
object IDepositStatus {
  
  inline def apply(): IDepositStatus = {
    val __obj = js.Dynamic.literal(Created = "CREATED", Failed = "FAILED", Succeeded = "SUCCEEDED")
    __obj.asInstanceOf[IDepositStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDepositStatus] (val x: Self) extends AnyVal {
    
    inline def setCreated(value: CREATED): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setFailed(value: FAILED): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
    
    inline def setSucceeded(value: SUCCEEDED): Self = StObject.set(x, "Succeeded", value.asInstanceOf[js.Any])
  }
}
