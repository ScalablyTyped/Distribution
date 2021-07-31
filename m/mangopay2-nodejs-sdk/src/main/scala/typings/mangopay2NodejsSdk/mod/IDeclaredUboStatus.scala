package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDeclaredUboStatus extends StObject {
  
  var Created: CREATED
  
  var Refused: REFUSED
  
  var Validated: VALIDATED
}
object IDeclaredUboStatus {
  
  @scala.inline
  def apply(): IDeclaredUboStatus = {
    val __obj = js.Dynamic.literal(Created = "CREATED", Refused = "REFUSED", Validated = "VALIDATED")
    __obj.asInstanceOf[IDeclaredUboStatus]
  }
  
  @scala.inline
  implicit class IDeclaredUboStatusMutableBuilder[Self <: IDeclaredUboStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: CREATED): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefused(value: REFUSED): Self = StObject.set(x, "Refused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidated(value: VALIDATED): Self = StObject.set(x, "Validated", value.asInstanceOf[js.Any])
  }
}
