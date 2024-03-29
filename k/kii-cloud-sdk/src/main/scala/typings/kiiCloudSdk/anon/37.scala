package typings.kiiCloudSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `37` extends StObject {
  
  def failure(errString: String): Any
  
  def success(): Any
}
object `37` {
  
  inline def apply(failure: String => Any, success: () => Any): `37` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction0(success))
    __obj.asInstanceOf[`37`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `37`] (val x: Self) extends AnyVal {
    
    inline def setFailure(value: String => Any): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: () => Any): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
  }
}
