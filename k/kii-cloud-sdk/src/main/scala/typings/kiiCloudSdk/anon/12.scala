package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  def failure(obj: KiiObject, anErrorString: String): Any
  
  def success(theDeletedObject: KiiObject): Any
}
object `12` {
  
  inline def apply(failure: (KiiObject, String) => Any, success: KiiObject => Any): `12` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `12`] (val x: Self) extends AnyVal {
    
    inline def setFailure(value: (KiiObject, String) => Any): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
    
    inline def setSuccess(value: KiiObject => Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
