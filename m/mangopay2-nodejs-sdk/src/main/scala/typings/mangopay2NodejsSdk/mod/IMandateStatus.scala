package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ACTIVE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUBMITTED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMandateStatus extends StObject {
  
  var Active: ACTIVE = js.native
  
  var Created: CREATED = js.native
  
  var Failed: FAILED = js.native
  
  var Submitted: SUBMITTED = js.native
}
object IMandateStatus {
  
  @scala.inline
  def apply(Active: ACTIVE, Created: CREATED, Failed: FAILED, Submitted: SUBMITTED): IMandateStatus = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Created = Created.asInstanceOf[js.Any], Failed = Failed.asInstanceOf[js.Any], Submitted = Submitted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMandateStatus]
  }
  
  @scala.inline
  implicit class IMandateStatusMutableBuilder[Self <: IMandateStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: ACTIVE): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: CREATED): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailed(value: FAILED): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitted(value: SUBMITTED): Self = StObject.set(x, "Submitted", value.asInstanceOf[js.Any])
  }
}
