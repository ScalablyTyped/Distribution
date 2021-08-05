package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  def failure(obj: KiiObject, anErrorString: String): js.Any
  
  def success(theDeletedObject: KiiObject): js.Any
}
object `12` {
  
  inline def apply(failure: (KiiObject, String) => js.Any, success: KiiObject => js.Any): `12` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`12`]
  }
  
  extension [Self <: `12`](x: Self) {
    
    inline def setFailure(value: (KiiObject, String) => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
    
    inline def setSuccess(value: KiiObject => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
