package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `32` extends StObject {
  
  def failure(theUser: KiiUser, anErrorString: String): js.Any
  
  def success(theAuthenticatedUser: KiiUser): js.Any
}
object `32` {
  
  inline def apply(failure: (KiiUser, String) => js.Any, success: KiiUser => js.Any): `32` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`32`]
  }
  
  extension [Self <: `32`](x: Self) {
    
    inline def setFailure(value: (KiiUser, String) => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
    
    inline def setSuccess(value: KiiUser => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
