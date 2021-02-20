package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiACL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Success extends StObject {
  
  def failure(theACL: KiiACL, anErrorString: String): js.Any = js.native
  
  def success(theSavedACL: KiiACL): js.Any = js.native
}
object Success {
  
  @scala.inline
  def apply(failure: (KiiACL, String) => js.Any, success: KiiACL => js.Any): Success = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[Success]
  }
  
  @scala.inline
  implicit class SuccessMutableBuilder[Self <: Success] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: (KiiACL, String) => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSuccess(value: KiiACL => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
