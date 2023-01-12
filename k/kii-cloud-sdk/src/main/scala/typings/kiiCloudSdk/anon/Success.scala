package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiACL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Success extends StObject {
  
  def failure(theACL: KiiACL, anErrorString: String): Any
  
  def success(theSavedACL: KiiACL): Any
}
object Success {
  
  inline def apply(failure: (KiiACL, String) => Any, success: KiiACL => Any): Success = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[Success]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Success] (val x: Self) extends AnyVal {
    
    inline def setFailure(value: (KiiACL, String) => Any): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
    
    inline def setSuccess(value: KiiACL => Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
