package typings.kiiCloudSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `37` extends StObject {
  
  def failure(errString: String): js.Any
  
  def success(): js.Any
}
object `37` {
  
  @scala.inline
  def apply(failure: String => js.Any, success: () => js.Any): `37` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction0(success))
    __obj.asInstanceOf[`37`]
  }
  
  @scala.inline
  implicit class `37MutableBuilder`[Self <: `37`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: String => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccess(value: () => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
  }
}
