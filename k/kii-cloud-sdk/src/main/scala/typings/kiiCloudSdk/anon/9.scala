package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  def failure(theGroup: KiiGroup, anErrorString: String): js.Any
  
  def success(theDeletedGroup: KiiGroup): js.Any
}
object `9` {
  
  inline def apply(failure: (KiiGroup, String) => js.Any, success: KiiGroup => js.Any): `9` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`9`]
  }
  
  extension [Self <: `9`](x: Self) {
    
    inline def setFailure(value: (KiiGroup, String) => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
    
    inline def setSuccess(value: KiiGroup => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
