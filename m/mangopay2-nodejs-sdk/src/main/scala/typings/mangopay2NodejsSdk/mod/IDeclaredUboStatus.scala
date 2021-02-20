package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeclaredUboStatus extends StObject {
  
  var Created: CREATED = js.native
  
  var Refused: REFUSED = js.native
  
  var Validated: VALIDATED = js.native
}
object IDeclaredUboStatus {
  
  @scala.inline
  def apply(Created: CREATED, Refused: REFUSED, Validated: VALIDATED): IDeclaredUboStatus = {
    val __obj = js.Dynamic.literal(Created = Created.asInstanceOf[js.Any], Refused = Refused.asInstanceOf[js.Any], Validated = Validated.asInstanceOf[js.Any])
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
